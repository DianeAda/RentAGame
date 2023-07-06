package be.adasim.RentAGameConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class RentAGameConnection {
	
	private static Connection instance = null;
	private static String user = null;
	private static String password = null;
	
	private RentAGameConnection() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
			instance = DriverManager.getConnection("jdbc:ucanaccess://c:/pippo.mdb;memory=true",user, password);
			// TODO ajouter le vrai chemin de la DB
		} catch(ClassNotFoundException ex) {
			
		} catch(SQLException ex1) {
			
		}
		if(instance == null) {
            JOptionPane.showMessageDialog(null, "La base de données est inaccessible, fermeture du programme.");
            System.exit(0);
		}
		
	}
	
	public static Connection GetInstance() {
		if(instance == null)
			new RentAGameConnection();
		
		return instance;
	}
}
