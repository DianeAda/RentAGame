package be.adasim.RentAGameUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JTextField textFieldPseudo;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Inscription rent a game {SignIn}"); // TODO delete indication
		JFrame instance = this;
		
		JLabel lblNewLabel = new JLabel("Inscription");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(478, 11, 200, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomDutilisateur = new JLabel("Nom d’utilisateur");
		lblNomDutilisateur.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomDutilisateur.setBounds(244, 92, 158, 38);
		contentPane.add(lblNomDutilisateur);
		
		JLabel lblPseudonyme = new JLabel("Pseudonyme");
		lblPseudonyme.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPseudonyme.setBounds(244, 141, 158, 38);
		contentPane.add(lblPseudonyme);
		
		JLabel lblMotDePasse = new JLabel("Mot De Passe");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotDePasse.setBounds(244, 190, 158, 38);
		contentPane.add(lblMotDePasse);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(10, 597, 204, 73);
		contentPane.add(btnBack);
		
		JButton btnInscription = new JButton("Inscription");
		btnInscription.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnInscription.setBounds(1050, 597, 204, 73);
		contentPane.add(btnInscription);
		
		JLabel lblDateDeNaissance = new JLabel("Date de Naissance");
		lblDateDeNaissance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDateDeNaissance.setBounds(244, 239, 175, 38);
		contentPane.add(lblDateDeNaissance);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(452, 92, 211, 38);
		contentPane.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		textFieldPseudo = new JTextField();
		textFieldPseudo.setColumns(10);
		textFieldPseudo.setBounds(452, 141, 211, 38);
		contentPane.add(textFieldPseudo);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(452, 190, 211, 38);
		contentPane.add(textFieldPassword);

		JCalendar calendar = new JCalendar();
		calendar.setBounds(452, 239, 211, 200);
		contentPane.add(calendar);
		
	}
}
