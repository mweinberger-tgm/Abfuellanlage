package logic;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.List;

public class Lieferant implements Runnable {

	private ServerSocket socket;

	private String name;

	private String host;

	private int port;

	private boolean running;

	private List<ClientListener> cml;

	public Lieferant(String host, int port, String name) throws IOException {
		socket = new ServerSocket(port);
		this.host = host;
		this.port = port;
		this.name = name;
	}

	public void liefern(float liefermenge, String name) {
		for (ClientListener cl : cml) {
			if (cl.getTank().getName().equals(name)) {
				cl.getTank().getOutputStream().println(liefermenge);
			}
		}
	}

	public void run() {
		while (running) {
			try {
				// Wartet bis sich ein Client verbindet und fuegt ihn zur liste hinzu
				ClientListener cml = new ClientListener(new Tank(this.socket.accept()), this);
				new Thread(cml).start();
				this.cml.add(cml);
				System.out.println(cml.getTank().getConnection().getInetAddress().getHostAddress() + " connected to the server");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void isRunning(boolean ss) {
		running = ss;
	}

	public String getName() {
		return this.name;
	}

	public List<ClientListener> getConnections() {
		return this.cml;
	}

}
