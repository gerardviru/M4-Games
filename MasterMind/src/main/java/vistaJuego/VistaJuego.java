package vistaJuego;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VistaJuego extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void VistaJuego() {
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
		
		Controlador controlador = new Controlador();
		controlador.combinacionSecreta();
		setTitle("MasterMind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(658, 106, 186, 74);
		panel.setOpaque(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setBounds(10, 11, 166, 14);
		panel.add(lblNewLabel);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBackground(Color.MAGENTA);
		editorPane.setBounds(10, 36, 21, 20);
		panel.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setEditable(false);
		editorPane_1.setBackground(Color.YELLOW);
		editorPane_1.setBounds(57, 36, 21, 20);
		panel.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setEditable(false);
		editorPane_2.setBackground(Color.CYAN);
		editorPane_2.setBounds(107, 36, 21, 20);
		panel.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setEditable(false);
		editorPane_3.setBackground(Color.GREEN);
		editorPane_3.setBounds(155, 36, 21, 20);
		panel.add(editorPane_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBounds(658, 248, 186, 74);
		contentPane.add(panel_1);
		
		JLabel lblCombinacinSecreta = new JLabel("Combinación Secreta");
		lblCombinacinSecreta.setBounds(10, 11, 166, 14);
		panel_1.add(lblCombinacinSecreta);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setOpaque(false);
		panel_1_1.setBounds(20, 47, 425, 74);
		contentPane.add(panel_1_1);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setEditable(false);
		editorPane_4.setBackground(Color.WHITE);
	
		editorPane_4.addMouseListener(new MouseListener() {
			Controlador controlador = new Controlador();
			public void mouseClicked(MouseEvent e) {
					controlador.cambiarColor(e.getButton(),editorPane_4);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		editorPane_4.setBounds(35, 30, 21, 20);
		panel_1_1.add(editorPane_4);
		
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBounds(98, 30, 21, 20);
		panel_1_1.add(editorPane_5);
		editorPane_5.setEditable(false);
		editorPane_5.setBackground(Color.WHITE);
		editorPane_5.addMouseListener(new MouseListener() {
			Controlador controlador = new Controlador();
			public void mouseClicked(MouseEvent e) {
					controlador.cambiarColor(e.getButton(),editorPane_5);
			}
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBounds(167, 30, 21, 20);
		panel_1_1.add(editorPane_6);
		editorPane_6.setEditable(false);
		editorPane_6.setBackground(Color.WHITE);
		editorPane_6.addMouseListener(new MouseListener() {
			Controlador controlador = new Controlador();
			public void mouseClicked(MouseEvent e) {
					controlador.cambiarColor(e.getButton(),editorPane_6);
			}
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setEditable(false);
		editorPane_7.setBackground(Color.WHITE);
		editorPane_7.addMouseListener(new MouseListener() {
			Controlador controlador = new Controlador();
			public void mouseClicked(MouseEvent e) {
					controlador.cambiarColor(e.getButton(),editorPane_7);
			}
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		editorPane_7.setBounds(231, 30, 21, 20);
		panel_1_1.add(editorPane_7);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.validacion(editorPane_4.getBackground(),controlador.getColoresSecretos().get(0));
				controlador.validacion(editorPane_5.getBackground(),controlador.getColoresSecretos().get(1));
				controlador.validacion(editorPane_6.getBackground(),controlador.getColoresSecretos().get(2));
				controlador.validacion(editorPane_7.getBackground(),controlador.getColoresSecretos().get(3));
			}
		});
		btnNewButton.setBounds(287, 30, 116, 23);
		panel_1_1.add(btnNewButton);
		
		JEditorPane verificado1 = new JEditorPane();
		verificado1.setBounds(451, 160, 26, 20);
		contentPane.add(verificado1);
		
		JEditorPane verificado2 = new JEditorPane();
		verificado2.setBounds(486, 160, 26, 20);
		contentPane.add(verificado2);
		
		JEditorPane verificado3 = new JEditorPane();
		verificado3.setBounds(527, 160, 26, 20);
		contentPane.add(verificado3);
		
		JEditorPane verificado4 = new JEditorPane();
		verificado4.setBounds(563, 160, 26, 20);
		contentPane.add(verificado4);
		
	}
}
