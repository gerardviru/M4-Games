package vistaJuego;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class VistaJuego extends JFrame {

	private int nrIntento = 0;
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

		// Inicializar controlador
		Controlador controlador = new Controlador();

		/*
		 * Crear la combinacion secreta de colores en un array. Utilizar el index del
		 * array para saber la posición
		 */
		controlador.generarColoresSecretos();		

		setTitle("MasterMind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 900, 700);
		// contentPane: el contenedor padre de todo
		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel coloresDisponiblesPanel = new JPanel();
		coloresDisponiblesPanel.setBounds(618, 81, 245, 74);
		coloresDisponiblesPanel.setOpaque(false);
		contentPane.add(coloresDisponiblesPanel);
		coloresDisponiblesPanel.setLayout(null);

		JLabel labelColoresDisponibles = new JLabel("Colores Disponibles");
		labelColoresDisponibles.setBounds(10, 11, 166, 14);
		coloresDisponiblesPanel.add(labelColoresDisponibles);

		/*
		 * Los siguientes JEditorPane son para las casillas de los colores disponibles
		 */
		JEditorPane casillaColorFijo1 = new JEditorPane();
		casillaColorFijo1.setEditable(false);
		casillaColorFijo1.setBackground(Color.MAGENTA);
		casillaColorFijo1.setBounds(10, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo1);

		JEditorPane casillaColorFijo2 = new JEditorPane();
		casillaColorFijo2.setBounds(48, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo2);
		casillaColorFijo2.setEditable(false);
		casillaColorFijo2.setBackground(Color.YELLOW);

		JEditorPane casillaColorFijo3 = new JEditorPane();
		casillaColorFijo3.setEditable(false);
		casillaColorFijo3.setBackground(Color.CYAN);
		casillaColorFijo3.setBounds(91, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo3);

		JEditorPane casillaColorFijo4 = new JEditorPane();
		casillaColorFijo4.setEditable(false);
		casillaColorFijo4.setBackground(Color.GREEN);
		casillaColorFijo4.setBounds(133, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo4);

		JEditorPane casillaColorFijo5 = new JEditorPane();
		casillaColorFijo5.setEditable(false);
		casillaColorFijo5.setBackground(Color.ORANGE);
		casillaColorFijo5.setBounds(172, 36, 21, 20);
//		editorPane_3_1.setVisible(false);
		coloresDisponiblesPanel.add(casillaColorFijo5);

		JEditorPane casillaColorFijo6 = new JEditorPane();
		casillaColorFijo6.setEditable(false);
		casillaColorFijo6.setBackground(Color.BLUE);
		casillaColorFijo6.setBounds(214, 36, 21, 20);
//		editorPane_3_2.setVisible(false);
		coloresDisponiblesPanel.add(casillaColorFijo6);

		/*
		 * Panel de las casillas de la combinacion secreta
		 */
		JPanel secretosPanel = new JPanel();
		secretosPanel.setLayout(null);
		secretosPanel.setBounds(618, 248, 245, 74);
		
		contentPane.add(secretosPanel);

		JLabel labelCombinacionSecreta = new JLabel("Combinación Secreta");
		labelCombinacionSecreta.setBounds(10, 11, 166, 14);
		secretosPanel.add(labelCombinacionSecreta);
		
		/* 
		 * Añadir los colores secretos al panel de colores secretos
		 * 	
		 */
		ArrayList<Color> coloresSecretos = controlador.getColoresSecretos();

		for (int i = 0; i < coloresSecretos.size(); i++) {
			Color colorSecreto = coloresSecretos.get(i);
			Casilla casilla = new Casilla(i +1);
			casilla.setBackground(colorSecreto);
			casilla.setBounds(55 * i, 50, 20, 20);
			secretosPanel.add(casilla);
		}

		/*
		 * EDITAR
		 * Panel para las casillas donde se cambian los colores
		 */
		JPanel insertarPanel = new JPanel();
		insertarPanel.setBounds(10, 50, 250, 40);
		insertarPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		contentPane.add(insertarPanel);

		/*
		 * EDITAR CASILLAS
		 * Generar las cuatro casillas donde se cambian los colores
		 * 
		 * 
		 * 
		 */
		insertarPanel.setLayout(null);
		Casilla casilla1 = new Casilla(1);
		casilla1.setBounds(45, 11, 21, 20);
		insertarPanel.add(casilla1);
		casilla1.addMouseListener(new CasillaMouseListener());

		Casilla casilla2 = new Casilla(2);
		casilla2.setBounds(100, 11, 21, 20);
		insertarPanel.add(casilla2);
		casilla2.addMouseListener(new CasillaMouseListener());

		Casilla casilla3 = new Casilla(3);
		casilla3.setBounds(155, 11, 21, 20);
		insertarPanel.add(casilla3);
		casilla3.addMouseListener(new CasillaMouseListener());

		Casilla casilla4 = new Casilla(4);
		casilla4.setBounds(210, 11, 21, 20);
		insertarPanel.add(casilla4);
		casilla4.addMouseListener(new CasillaMouseListener());

		/*
		 * Panel y casillas verificadas
		 * 
		 * 
		 */
//		JPanel validados = new JPanel();
//		validados.setBounds(385, 59, 250, 40);
//		contentPane.add(validados);
//		validados.setLayout(null);
//
//		JEditorPane verificado1 = new JEditorPane();
//		verificado1.setEditable(false);
//		verificado1.setVisible(false);
//		verificado1.setBounds(1, 0, 23, 24);
//		validados.add(verificado1);
//
//		JEditorPane verificado2 = new JEditorPane();
//		verificado2.setEditable(false);
//		verificado2.setVisible(false);
//		verificado2.setBounds(49, 0, 23, 24);
//		validados.add(verificado2);
//
//		JEditorPane verificado3 = new JEditorPane();
//		verificado3.setEditable(false);
//		verificado3.setVisible(false);
//		verificado3.setBounds(97, 0, 23, 24);
//		validados.add(verificado3);
//
//		JEditorPane verificado4 = new JEditorPane();
//		verificado4.setEditable(false);
//		verificado4.setVisible(false);
//		verificado4.setBounds(151, 0, 23, 24);
//		validados.add(verificado4);

		/*
		 * Boton para comprobar
		 * 
		 * 
		 */
		JButton comprobarBtn = new JButton("Comprobar");
		comprobarBtn.setBounds(266, 50, 110, 40);
		contentPane.add(comprobarBtn);
		comprobarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nrIntento++;

				// Comprobar cuantos colores son correctos
				// Comprobar si el color y la posición es correcta
				controlador.validarCasillas(insertarPanel);
				
				// Mostrar el estado de los colores insertados
				controlador.mostrarAciertos(contentPane, nrIntento);

//				controlador.validacion(editorPane_5.getBackground(),controlador.getColoresSecretos().get(1));

				// Dejar una copia de los colores escogidos en el mismo lugar
				controlador.dejarCopiaPanel(insertarPanel, contentPane, nrIntento);

				// Mover el boton comprobar y el panel insertar colores
				controlador.moverAbajo(comprobarBtn);
				controlador.moverAbajo(insertarPanel);
				contentPane.repaint();
				contentPane.revalidate();

			}
		});

	}
}
