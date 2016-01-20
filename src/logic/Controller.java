package logic;

import java.util.ArrayList;

public class Controller {

	private ArrayList<Tank> tanks;

	private ArrayList<Lieferant> lieferanten;

	public void addTank(Tank tank) {
		tanks.add(tank);
	}

	public void addLieferant(Lieferant lieferant) {
		lieferanten.add(lieferant);
	}

	public boolean ausschenken(float menge, String name) {


		if (tanks.get(tanks.indexOf(name)).getFuellstand() >= menge)	{
			tanks.get(tanks.indexOf(name)).setFuellstand(tanks.get(tanks.indexOf(name)).getFuellstand() - menge);
			return true;
		}

			return false;
	}

	public boolean nachbestellen(String name) {
		int index = 0;
		for (Lieferant lieferant : lieferanten) {
			if (lieferant.getName().equals(name))
				break;
			else
				index += 1;
		}


		return true;
	}

}
