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
import java.awt.Color;

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
		panel.setBounds(665, 72, 186, 74);
		panel.setOpaque(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.MAGENTA);
		editorPane.setBounds(10, 36, 21, 20);
		panel.add(editorPane);
		
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setBounds(10, 11, 98, 14);
		panel.add(lblNewLabel);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(Color.YELLOW);
		editorPane_1.setBounds(57, 36, 21, 20);
		panel.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(Color.CYAN);
		editorPane_2.setBounds(107, 36, 21, 20);
		panel.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBackground(Color.GREEN);
		editorPane_3.setBounds(155, 36, 21, 20);
		panel.add(editorPane_3);
	}
}
