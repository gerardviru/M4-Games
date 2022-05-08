package vistaJuego;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.SwingConstants;

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
	 * Constructor. Create the frame.
	 */
	public VistaJuego() {

		// Inicializar controlador
		Controlador controlador = new Controlador();

		/*
		 * Crear la combinacion secreta de colores en un array. Utilizar el index del
		 * array para saber la posición
		 */
		controlador.generarCasillasSecretas();	

		/*
		 * Definiendo las propiedades de la ventana principal
		 */
		setTitle("MasterMind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 900, 700);
		
		// contentPane: el contenedor que engloba toda la ventana VistaJuego
		contentPane = new JPanel();
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
		 * Genera las casillas mostradas en el panel de los colores disponibles
		 */
		generarCasillasColoresDisponibles(coloresDisponiblesPanel);

		/*
		 * Panel de las casillas de la combinacion secreta
		 */
		JPanel secretosPanel = new JPanel();
		secretosPanel.setLayout(null);
		secretosPanel.setBounds(618, 248, 245, 74);
//		secretosPanel.setVisible(false);
		controlador.secretosPanel = secretosPanel;
		
		contentPane.add(secretosPanel);

		JLabel labelCombinacionSecreta = new JLabel("Combinación Secreta");
		labelCombinacionSecreta.setBounds(10, 11, 166, 14);
		secretosPanel.add(labelCombinacionSecreta);
		
		/* 
		 * Añadir las casillas secretas al panel de colores secretos
		 * 	
		 */
		ArrayList<Casilla> casillasSecretas = controlador.getCasillasSecretas();

		for (int i = 0; i < casillasSecretas.size(); i++) {
			Casilla casilla = casillasSecretas.get(i);
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
		ArrayList<Casilla> casillasInput = new ArrayList<Casilla>();
		
		for (int i = 0; i < 4; i++) {
			insertarPanel.setLayout(null);
			Casilla casilla = new Casilla(i, Color.WHITE, true);
			casilla.setBounds(55 *i+1 + 45, 11, 21, 20);
			insertarPanel.add(casilla);
			casillasInput.add(casilla);
		}	


		/*
		 * Boton para comprobar
		 * 
		 * 
		 */
		JButton comprobarBtn = new JButton("Comprobar");
		comprobarBtn.setBounds(266, 50, 110, 40);
		contentPane.add(comprobarBtn);
		
		/*
		 * Etiqueta que muestra final de la partida
		 * 
		 * 
		 * 
		 */
		JLabel labelFinalizada = new JLabel("GAME OVER!");
		labelFinalizada.setHorizontalAlignment(SwingConstants.CENTER);
		labelFinalizada.setFont(new Font("Verdana", Font.PLAIN, 25));
		labelFinalizada.setBounds(618, 395, 245, 152);
		labelFinalizada.setVisible(false);
		contentPane.add(labelFinalizada);
		
		controlador.setLabelFinalizada(labelFinalizada);
		controlador.setComprobarBtn(comprobarBtn);
		
		JLabel labelIntentos = new JLabel(controlador.getMaximoIntentos() + " Intentos");
		labelIntentos.setFont(new Font("Tahoma", Font.PLAIN, 22));
		labelIntentos.setBounds(618, 11, 245, 59);
		contentPane.add(labelIntentos);
		
		/*
		 * Acción del botón 
		 */
		comprobarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nrIntento++;
				
				// Pasar casillas input
				
				controlador.setCasillasInput(casillasInput);

				// Comprobar cuantos colores son correctos
				// Comprobar si el color y la posición es correcta
				controlador.validarCasillas(casillasInput);
				
				// Mostrar el estado de los colores insertados
				controlador.mostrarAciertos(contentPane, nrIntento);

				// Dejar una copia de los colores escogidos en el mismo lugar
				controlador.dejarCopiaPanel(insertarPanel, contentPane, nrIntento);

				// Mover el boton comprobar y el panel insertar colores
				controlador.moverAbajo(comprobarBtn);
				controlador.moverAbajo(insertarPanel);
				contentPane.repaint();
				contentPane.revalidate();
				
				// Actualizar el número de intentos
				labelIntentos.setText((controlador.getMaximoIntentos()- nrIntento) + " Intentos");
				
				if (nrIntento >= controlador.getMaximoIntentos()) {
					controlador.finalizarPartida();
				}

			}
		});

	}

	public void generarCasillasColoresDisponibles(JPanel coloresDisponiblesPanel) {
		/*
		 * Los siguientes JEditorPane son para las casillas de los colores disponibles
		 */
		Casilla casillaColorFijo0 = new Casilla(0, Color.MAGENTA, false);
		casillaColorFijo0.setBounds(10, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo0);

		Casilla casillaColorFijo1 = new Casilla(1, Color.YELLOW, false);
		casillaColorFijo1.setBounds(48, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo1);

		Casilla casillaColorFijo2 = new Casilla(2, Color.CYAN, false);
		casillaColorFijo2.setBounds(91, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo2);

		Casilla casillaColorFijo3 = new Casilla(3, Color.GREEN, false);
		casillaColorFijo3.setBounds(133, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo3);
		
		Casilla casillaColorFijo4 = new Casilla(4, Color.ORANGE, false);
		casillaColorFijo4.setBounds(172, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo4);

		Casilla casillaColorFijo5 = new Casilla(4, Color.BLUE, false);
		casillaColorFijo5.setBounds(214, 36, 21, 20);
		coloresDisponiblesPanel.add(casillaColorFijo5);
	}
}