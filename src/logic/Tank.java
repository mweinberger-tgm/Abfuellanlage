package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Tank {

	private float fuellstand;

	private String name;

	private float grenzwert;

	private float maxFuellung;

	private Socket connection;

	private BufferedReader in;

	private PrintWriter out;

	public Tank(Socket con) throws IOException {
		connection = con;

		this.out = new PrintWriter(this.connection.getOutputStream(), true);

		this.in = new BufferedReader(new InputStreamReader(this.connection.getInputStream()));
	}

	public PrintWriter getOutputStream() {
		return this.out;
	}

	public BufferedReader getInputStream() {
		return this.in;
	}

	public Socket getConnection() {
		return this.connection;
	}

	public void disconnect() throws IOException {
		this.connection.close();
	}

	public void setAll(float fuellstand, String name, float grenzwert, float maxFuellung) {
		this.fuellstand = fuellstand;
		this.name = name;
		this.grenzwert = grenzwert;
		this.maxFuellung = maxFuellung;
	}

	public void nachbestellen() {
		getOutputStream().println(this.name + "," + (maxFuellung - fuellstand));
		String line = "";
		try {
			// Falls eine Zeile uebertragen wurde, wird sie in das Log Fenster geschrieben
			while ((line = this.in.readLine()) != null) {
				fuellstand += Float.parseFloat(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean ausschenken(float menge) {
		if (maxFuellung > menge) {
			if ((fuellstand - menge) > 0) {
				fuellstand -= menge;
				if (checkNachBestellen())
					nachbestellen();
				return true;
			} else
				nachbestellen();
			fuellstand -= menge;
		}
		return false;
	}

	private boolean checkNachBestellen() {
		if (fuellstand <= grenzwert)
			return true;
		else
			return false;
	}

	public String getName() {
		return name;
	}

	public float getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(float fuellstand) {
		this.fuellstand = fuellstand;
	}

}
