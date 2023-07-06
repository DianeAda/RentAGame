package be.adasim.RentAGameUI;

import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AdminListGame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminListGame frame = new AdminListGame();
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
	public AdminListGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Liste des jeux {AdminListGame}"); // TODO delete indication
		JFrame instance = this;
		
		JLabel lblNewLabel = new JLabel("Liste jeu - Administrateur");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(325, 11, 548, 65);
		contentPane.add(lblNewLabel);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(10, 597, 204, 73);
		contentPane.add(btnBack);
		
		JButton btnModify = new JButton("Modifier");
		btnModify.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnModify.setBounds(1050, 597, 204, 73);
		contentPane.add(btnModify);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nom", "Console", "Cout"
			}
		));
		table.setBounds(69, 87, 934, 462);
		contentPane.add(table);
		
	}

}
