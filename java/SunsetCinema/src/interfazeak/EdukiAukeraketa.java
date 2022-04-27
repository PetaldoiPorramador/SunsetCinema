package interfazeak;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class EdukiAukeraketa {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdukiAukeraketa window = new EdukiAukeraketa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EdukiAukeraketa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 46, 115, 0, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblRegistro = new JLabel("Egun Aukeraketa");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 2;
		gbc_lblRegistro.gridy = 1;
		panel.add(lblRegistro, gbc_lblRegistro);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_4 = new GridBagConstraints();
		gbc_horizontalBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_4.gridx = 2;
		gbc_horizontalBox_4.gridy = 7;
		panel.add(horizontalBox_4, gbc_horizontalBox_4);
		
		JLabel lblEnpresaKargua = new JLabel("Enpresaren kargua:");
		horizontalBox_4.add(lblEnpresaKargua);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_4.add(rigidArea_4);
		
		JComboBox comboBoxEnpresaKargua = new JComboBox();
		horizontalBox_4.add(comboBoxEnpresaKargua);
		
		/*Button button_hasiera = new Button("Hasiera");
		frame.getContentPane().add(button_hasiera, BorderLayout.NORTH);
		button_hasiera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Button button_kartelera = new Button("Kartelera");
		frame.getContentPane().add( button_kartelera, BorderLayout.EAST);
		button_kartelera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		Button button_astekoLaburpena = new Button("Asteko laburpena");
		frame.getContentPane().add(button_astekoLaburpena, BorderLayout.WEST);
		button_astekoLaburpena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Button button_balioztatu = new Button("Balioztatu");
		frame.getContentPane().add(button_balioztatu, BorderLayout.SOUTH);
		button_balioztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});*/
	}

}
