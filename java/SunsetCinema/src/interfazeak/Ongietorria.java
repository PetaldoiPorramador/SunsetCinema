package bai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ongietorria {

	private JFrame frame;
	private final Button button = new Button("Ongietorria izan Sunset Zinemara, zein pelikulak zein prezioak" 
											 + " hoberenak diren lekua!" + "\n" +"Gure zerbitzuko login-era joateko "
											 + "pantalia honetako edozein lekutan egin dezazu klik, mesedez.");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ongietorria window = new Ongietorria();
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
	public Ongietorria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setActionCommand("Ongietorria izan Sunset Zinemara, zein pelikulak zein prezioak hoberenak diren lekua!\r\n\r\nGure zerbitzuko login-era joateko pantalia honetako edozein lekutan egin ezazu klik, mesedez.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.getContentPane().add(button, BorderLayout.CENTER);
	}

}
