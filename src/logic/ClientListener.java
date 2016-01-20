package logic;

import java.io.IOException;

/**
 * @author Stefan Polydor &lt;spolydor@student.tgm.ac.at&gt;
 * @version 20.01.16
 */
public class ClientListener implements Runnable {

	private Tank t;
	private Lieferant l;

	public ClientListener(Tank t, Lieferant l) {
		this.t = t;
		this.l = l;
	}

	@Override
	public void run() {
		try {
			String line;
			// Wenn ein Client eine Nachricht an den Server sendet, sendet der Server diese an alle Client weiter
			while ((line = this.t.getInputStream().readLine()) != null) {
				String[] ln = line.split(",");
				this.l.liefern(Float.parseFloat(ln[1]), ln[0]);
				// System.out.println(line);
			}
		} catch (IOException e) {
			// Wenn ein Client die Verbindung trennt, trennt der Server sie auch
			System.out.println("Client has lost connection");
			this.l.getConnections().remove(this.t);
			try {
				this.t.disconnect();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public Tank getTank() {
		return t;
	}
}
