package logic;

import java.io.IOException;
import java.net.Socket;

import com.trolltech.qt.gui.*;

import view.Ui_Form;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		if (args.length >= 3) { // Wenn 2 oder mehrere Argumente angegeben werden kann auch ein Client und oder auch ein Server erzeugt werden

			String host = args[0]; // Speichert den Hostnamen
			int port = 33333; // Setzt standardmaessig den Port
			String name = args[2];
			try {
				port = Integer.parseInt(args[1]); // Ersetzt den Port mit dem angegebenen
			} catch (NumberFormatException ex) {
				System.out.println("Port is not a number, using default port: 33333");
			}

			System.out.println("Trying to connect to server " + host + ":" + port);

			try {
				//new ClientView(new Client(new Socket(host, port))); // Erstellt einen neuen Client und eine GUI
				new Tank(new Socket(host, port));
				System.out.println("Server found. Connection established.");
			} catch (IOException e) {
				System.out.println("No server at the given remote address found. Setting up server.");
				new Thread(new Lieferant("localhost", port, name)).start(); // Startet den Server
				try {
					new ClientView(new Client(new Socket("localhost", port))); // Erstellt einen neuen Client und eine GUI, verbindet sich zu localhost da hier nun der Server laeuft
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} else {
			System.out.println("Not enough args: <host> <port>");
		}
		**/

		QApplication.initialize(args);
		QWidget main = new QWidget();
		
		Ui_Form gui = new Ui_Form();
		
		gui.setupUi(main);
        main.show();
		
		QApplication.execStatic();
		int fmax = 20;
		
		while(true) {
			for(int x = 20; x > 0; x--)	{
				Thread t = new Thread();
        		try {
					t.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
			}
        }
		
	}
}
