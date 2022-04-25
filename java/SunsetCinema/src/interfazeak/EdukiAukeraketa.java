package interfazeak;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Button;
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
		
		Button button_hasiera = new Button("Hasiera");
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
		});
	}

}
