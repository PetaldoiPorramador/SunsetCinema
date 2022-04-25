package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Registro extends JFrame {

	private JPanel contentPane;
	private Box horizontalBox;
	private JLabel lblIzena;
	private JTextField textIzena;
	private Component rigidArea;
	private Box horizontalBox_1;
	private JLabel lblAbizena1;
	private Component rigidArea_1;
	private JTextField textAbizena1;
	private Box horizontalBox_2;
	private JLabel lblAbizena2;
	private Component rigidArea_2;
	private JTextField textAbizena2;
	private Box horizontalBox_3;
	private JLabel lblJaiotzeData;
	private Component rigidArea_3;
	private JTextField textJaiotzeData;
	private Box horizontalBox_4;
	private JLabel lblEnpresaKargua;
	private Component rigidArea_4;
	private Box horizontalBox_5;
	private JLabel lblErabiltzailea;
	private Component rigidArea_5;
	private JTextField textErabiltzailea;
	private Box horizontalBox_6;
	private JLabel lblPasahitza1;
	private Component rigidArea_6;
	private Box horizontalBox_7;
	private JLabel lbllPasahitza2;
	private Component rigidArea_7;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_1;
	private JComboBox comboBoxEnpresaKargua;
	private Box horizontalBox_8;
	private Component rigidArea_8;
	private JButton btnRegistrar;
	private JButton btnLogin;
	private JLabel lblRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 46, 115, 0, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 2;
		gbc_lblRegistro.gridy = 1;
		panel.add(lblRegistro, gbc_lblRegistro);
		
		horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 2;
		gbc_horizontalBox.gridy = 3;
		panel.add(horizontalBox, gbc_horizontalBox);
		
		lblIzena = new JLabel("Izena:");
		horizontalBox.add(lblIzena);
		
		rigidArea = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox.add(rigidArea);
		
		textIzena = new JTextField();
		horizontalBox.add(textIzena);
		textIzena.setColumns(10);
		
		horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 2;
		gbc_horizontalBox_1.gridy = 4;
		panel.add(horizontalBox_1, gbc_horizontalBox_1);
		
		lblAbizena1 = new JLabel("Lehenengo abizena:");
		horizontalBox_1.add(lblAbizena1);
		
		rigidArea_1 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_1);
		
		textAbizena1 = new JTextField();
		textAbizena1.setColumns(10);
		horizontalBox_1.add(textAbizena1);
		
		horizontalBox_2 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2.gridx = 2;
		gbc_horizontalBox_2.gridy = 5;
		panel.add(horizontalBox_2, gbc_horizontalBox_2);
		
		lblAbizena2 = new JLabel("Bigarren abizena:");
		horizontalBox_2.add(lblAbizena2);
		
		rigidArea_2 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_2.add(rigidArea_2);
		
		textAbizena2 = new JTextField();
		textAbizena2.setColumns(10);
		horizontalBox_2.add(textAbizena2);
		
		horizontalBox_3 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_3 = new GridBagConstraints();
		gbc_horizontalBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_3.gridx = 2;
		gbc_horizontalBox_3.gridy = 6;
		panel.add(horizontalBox_3, gbc_horizontalBox_3);
		
		lblJaiotzeData = new JLabel("Jaiotze data:");
		horizontalBox_3.add(lblJaiotzeData);
		
		rigidArea_3 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_3.add(rigidArea_3);
		
		textJaiotzeData = new JTextField();
		textJaiotzeData.setToolTipText("");
		textJaiotzeData.setHorizontalAlignment(SwingConstants.CENTER);
		textJaiotzeData.setColumns(10);
		horizontalBox_3.add(textJaiotzeData);
		
		horizontalBox_4 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_4 = new GridBagConstraints();
		gbc_horizontalBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_4.gridx = 2;
		gbc_horizontalBox_4.gridy = 7;
		panel.add(horizontalBox_4, gbc_horizontalBox_4);
		
		lblEnpresaKargua = new JLabel("Enpresaren kargua:");
		horizontalBox_4.add(lblEnpresaKargua);
		
		rigidArea_4 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_4.add(rigidArea_4);
		
		comboBoxEnpresaKargua = new JComboBox();
		horizontalBox_4.add(comboBoxEnpresaKargua);
		
		horizontalBox_5 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_5 = new GridBagConstraints();
		gbc_horizontalBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_5.gridx = 2;
		gbc_horizontalBox_5.gridy = 8;
		panel.add(horizontalBox_5, gbc_horizontalBox_5);
		
		lblErabiltzailea = new JLabel("Erabiltzailea:");
		horizontalBox_5.add(lblErabiltzailea);
		
		rigidArea_5 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_5.add(rigidArea_5);
		
		textErabiltzailea = new JTextField();
		textErabiltzailea.setColumns(10);
		horizontalBox_5.add(textErabiltzailea);
		
		horizontalBox_6 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_6 = new GridBagConstraints();
		gbc_horizontalBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_6.gridx = 2;
		gbc_horizontalBox_6.gridy = 9;
		panel.add(horizontalBox_6, gbc_horizontalBox_6);
		
		lblPasahitza1 = new JLabel("Pasahitza:");
		horizontalBox_6.add(lblPasahitza1);
		
		rigidArea_6 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_6.add(rigidArea_6);
		
		passwordField_1 = new JPasswordField();
		horizontalBox_6.add(passwordField_1);
		
		horizontalBox_7 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_7 = new GridBagConstraints();
		gbc_horizontalBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_7.gridx = 2;
		gbc_horizontalBox_7.gridy = 10;
		panel.add(horizontalBox_7, gbc_horizontalBox_7);
		
		lbllPasahitza2 = new JLabel("Errepikatu pasahitza:");
		horizontalBox_7.add(lbllPasahitza2);
		
		rigidArea_7 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_7.add(rigidArea_7);
		
		passwordField_2 = new JPasswordField();
		horizontalBox_7.add(passwordField_2);
		
		horizontalBox_8 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_8 = new GridBagConstraints();
		gbc_horizontalBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_8.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalBox_8.gridx = 2;
		gbc_horizontalBox_8.gridy = 11;
		panel.add(horizontalBox_8, gbc_horizontalBox_8);
		
		btnRegistrar = new JButton("Registrar usuario");
		horizontalBox_8.add(btnRegistrar);
		
		rigidArea_8 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_8.add(rigidArea_8);
		
		btnLogin = new JButton("Volver a login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		horizontalBox_8.add(btnLogin);
	}
}
