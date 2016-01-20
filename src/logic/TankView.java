package logic;

import javax.swing.*;

/**
 * @author Stefan Polydor &lt;spolydor@student.tgm.ac.at&gt;
 * @version 20.01.16
 */
public class TankView extends JFrame {

	private Tank tank;


	public TankView(Tank t) {
		super(t.getName());
		tank = t;


	}
}
