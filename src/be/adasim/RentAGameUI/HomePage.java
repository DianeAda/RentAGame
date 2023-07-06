package be.adasim.RentAGameUI;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class HomePage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomePage() {

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 1280, 720);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				setTitle("Accueil rent a game {HomePage}"); // TODO delete indication
				JFrame instance = this;
				
				JLabel lblNewLabel = new JLabel("BIENVENUE SUR RENT A GAME");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
				lblNewLabel.setForeground(Color.RED);
				lblNewLabel.setBounds(302, 11, 571, 111);
				contentPane.add(lblNewLabel);
				
				JButton btnSignIn = new JButton("Inscription");
				btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 25));
				btnSignIn.setBounds(10, 597, 204, 73);
				contentPane.add(btnSignIn);
				
				JButton btnSignUp = new JButton("Connexion");
				btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 25));
				btnSignUp.setBounds(1050, 597, 204, 73);
				contentPane.add(btnSignUp);
	}
}
