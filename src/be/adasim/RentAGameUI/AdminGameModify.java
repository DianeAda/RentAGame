package be.adasim.RentAGameUI;

import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminGameModify extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCreditCost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGameModify frame = new AdminGameModify();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminGameModify() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Liste des jeux {AdminGameModify}"); // TODO delete indication
		JFrame instance = this;
		
		JLabel lblNewLabel = new JLabel("Modifier jeu - Administrateur");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(325, 11, 548, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomDuJeu = new JLabel("Nom du jeu");
		lblNomDuJeu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomDuJeu.setBounds(325, 110, 119, 42);
		contentPane.add(lblNomDuJeu);
		
		JLabel lblConsole = new JLabel("Console");
		lblConsole.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConsole.setBounds(325, 163, 131, 42);
		contentPane.add(lblConsole);
		
		JLabel lblPrixEnCrdit = new JLabel("Prix en crédit");
		lblPrixEnCrdit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrixEnCrdit.setBounds(325, 216, 175, 42);
		contentPane.add(lblPrixEnCrdit);
		
		textFieldCreditCost = new JTextField();
		textFieldCreditCost.setColumns(10);
		textFieldCreditCost.setBounds(454, 216, 211, 38);
		contentPane.add(textFieldCreditCost);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(10, 597, 204, 73);
		contentPane.add(btnBack);
		
		JButton btnAdd = new JButton("Ajouter");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAdd.setBounds(1050, 597, 204, 73);
		contentPane.add(btnAdd);
		
		JLabel lblconsole = new JLabel("{CONSOLE}");
		lblconsole.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblconsole.setBounds(454, 163, 131, 42);
		contentPane.add(lblconsole);
		
		JLabel lblnomdujeu = new JLabel("{NOMDUJEU}");
		lblnomdujeu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnomdujeu.setBounds(454, 110, 131, 42);
		contentPane.add(lblnomdujeu);
	}

}
