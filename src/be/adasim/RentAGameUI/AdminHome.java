package be.adasim.RentAGameUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Connexion rent a game {AdminHome}"); // TODO delete indication
		JFrame instance = this;
		
		JLabel lblNewLabel = new JLabel("Home administrateur");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(363, 11, 491, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(10, 597, 204, 73);
		contentPane.add(btnBack);
		
		JButton btnListGame = new JButton("Liste Jeu");
		btnListGame.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnListGame.setBounds(304, 154, 204, 73);
		contentPane.add(btnListGame);
		
		JButton btnAddAGame = new JButton("Ajouter un jeu");
		btnAddAGame.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAddAGame.setBounds(650, 154, 204, 73);
		contentPane.add(btnAddAGame);
		
		
	}
}
