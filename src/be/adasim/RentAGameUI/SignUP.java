package be.adasim.RentAGameUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUP extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPseudo;
	private JTextField textFieldPassword;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUP frame = new SignUP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignUP() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Connexion rent a game {SignUp}"); // TODO delete indication
		JFrame instance = this;
		
		JLabel lblNewLabel = new JLabel("Connexion");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(478, 11, 200, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblPseudonyme = new JLabel("Pseudonyme");
		lblPseudonyme.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPseudonyme.setBounds(244, 141, 158, 38);
		contentPane.add(lblPseudonyme);
		
		JLabel lblMotDePasse = new JLabel("Mot De Passe");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotDePasse.setBounds(244, 190, 158, 38);
		contentPane.add(lblMotDePasse);
		
		textFieldPseudo = new JTextField();
		textFieldPseudo.setColumns(10);
		textFieldPseudo.setBounds(452, 141, 211, 38);
		contentPane.add(textFieldPseudo);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(452, 190, 211, 38);
		contentPane.add(textFieldPassword);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(10, 597, 204, 73);
		contentPane.add(btnBack);
		
		JButton btnInscription = new JButton("Connexion");
		btnInscription.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnInscription.setBounds(1050, 597, 204, 73);
		contentPane.add(btnInscription);
	}

}
