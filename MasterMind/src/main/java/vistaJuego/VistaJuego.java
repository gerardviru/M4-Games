package vistaJuego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class VistaJuego extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaJuego frame = new VistaJuego();
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
	public VistaJuego() {
		setTitle("MasterMind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(663, 67, 186, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 25, 21, 20);
		panel.add(editorPane);
		
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setBounds(566, 71, 98, 14);
		contentPane.add(lblNewLabel);
	}
}
