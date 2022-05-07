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
import java.awt.GridLayout;

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
		
		JPanel coloresDisponiblesPanel = new JPanel();
		coloresDisponiblesPanel.setBounds(618, 81, 245, 74);
		coloresDisponiblesPanel.setOpaque(false);
		contentPane.add(coloresDisponiblesPanel);
		coloresDisponiblesPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setBounds(10, 11, 166, 14);
		coloresDisponiblesPanel.add(lblNewLabel);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBackground(Color.MAGENTA);
		editorPane.setBounds(10, 36, 21, 20);
		coloresDisponiblesPanel.add(editorPane);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setEditable(false);
		editorPane_2.setBackground(Color.CYAN);
		editorPane_2.setBounds(91, 36, 21, 20);
		coloresDisponiblesPanel.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setEditable(false);
		editorPane_3.setBackground(Color.GREEN);
		editorPane_3.setBounds(133, 36, 21, 20);
		coloresDisponiblesPanel.add(editorPane_3);
		
		JEditorPane editorPane_3_1 = new JEditorPane();
		editorPane_3_1.setEditable(false);
		editorPane_3_1.setBackground(Color.ORANGE);
		editorPane_3_1.setBounds(172, 36, 21, 20);
//		editorPane_3_1.setVisible(false);
		coloresDisponiblesPanel.add(editorPane_3_1);
		
		JEditorPane editorPane_3_2 = new JEditorPane();
		editorPane_3_2.setEditable(false);
		editorPane_3_2.setBackground(Color.BLUE);
		editorPane_3_2.setBounds(214, 36, 21, 20);
//		editorPane_3_2.setVisible(false);
		coloresDisponiblesPanel.add(editorPane_3_2);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(48, 36, 21, 20);
		coloresDisponiblesPanel.add(editorPane_1);
		editorPane_1.setEditable(false);
		editorPane_1.setBackground(Color.YELLOW);
		
		JPanel cambinacionPanel = new JPanel();
		cambinacionPanel.setLayout(null);
		cambinacionPanel.setOpaque(false);
		cambinacionPanel.setBounds(618, 248, 245, 74);
		contentPane.add(cambinacionPanel);
		
		JLabel lblCombinacinSecreta = new JLabel("Combinación Secreta");
		lblCombinacinSecreta.setBounds(10, 11, 166, 14);
		cambinacionPanel.add(lblCombinacinSecreta);
		
		JPanel insertarPanel = new JPanel();
		insertarPanel.setLayout(null);
		insertarPanel.setOpaque(false);
		insertarPanel.setBounds(0, 49, 256, 74);
		contentPane.add(insertarPanel);
	
	
		/*
		 * Generar las cuatro casillas donde se cambian los colores
		 */
		Casilla casilla1 = new Casilla(1);
		casilla1.setBounds(20, 29, 21, 20);
		insertarPanel.add(casilla1);
		casilla1.addMouseListener(new CasillaMouseListener());
		
		Casilla casilla2 = new Casilla(2);
		casilla2.setBounds(83, 29, 21, 20);
		insertarPanel.add(casilla2);
		casilla2.addMouseListener(new CasillaMouseListener());

		Casilla casilla3 = new Casilla(3);
		casilla3.setBounds(152, 29, 21, 20);
		insertarPanel.add(casilla3);
		casilla3.addMouseListener(new CasillaMouseListener());

		Casilla casilla4 = new Casilla(4);
		casilla4.setBounds(216, 29, 21, 20);
		insertarPanel.add(casilla4);
		casilla4.addMouseListener(new CasillaMouseListener());
		
		JPanel validados = new JPanel();
		validados.setBounds(385, 76, 174, 24);
		contentPane.add(validados);
		validados.setLayout(null);
		
		JEditorPane verificado1 = new JEditorPane();
		verificado1.setBounds(1, 0, 23, 24);
		validados.add(verificado1);
		
		JEditorPane verificado2 = new JEditorPane();
		verificado2.setBounds(49, 0, 23, 24);
		validados.add(verificado2);
		
		JEditorPane verificado3 = new JEditorPane();
		verificado3.setBounds(97, 0, 23, 24);
		validados.add(verificado3);
		
		JEditorPane verificado3_1 = new JEditorPane();
		verificado3_1.setBounds(151, 0, 23, 24);
		validados.add(verificado3_1);
		
		JButton comprobarBtn = new JButton("Comprobar");
		comprobarBtn.setBounds(266, 76, 109, 23);
		contentPane.add(comprobarBtn);
		comprobarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Comprobar cuantos colores son correctos
				// Comprobar si el color y la posición es correcta
				
//				controlador.validacion(editorPane_5.getBackground(),controlador.getColoresSecretos().get(1));
				
				// Mover el Boton comprobar
				comprobarBtn.setBounds(266, 160, 109, 23);
				contentPane.add(comprobarBtn);
				contentPane.revalidate();
					
			}
		});
		
	}
}
