package logic;

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

	}

	public Tank getTank() {
		return t;
	}
}
