package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dificultad.Dificultad;
import vistaJuego.Controlador;
import vistaJuego.VistaJuego;

public class Menu {
	
	// Attributes
	private VistaJuego vistaJuego;
	private JMenuBar jMenu;
	
	// Constructor
	public Menu(VistaJuego vistaJuego) {
		this.vistaJuego = vistaJuego;
		this.jMenu = menuBar();
	}

	/**
	 * Crea el menú con todos los componentes
	 * @return
	 */
	private JMenuBar menuBar() {

		// Menu de navegación
		JMenuBar menuBar = new JMenuBar();

		// Item Archivo con desplegable
		JMenu pestanaArchivo = new JMenu("Archivo");
		menuBar.add(pestanaArchivo);

		// Item para crear una nueva partida
		JMenuItem subPestanaNuevo = new JMenuItem("Nuevo Juego");
		pestanaArchivo.add(subPestanaNuevo);
		subPestanaNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				Controlador controlador = new Controlador();
				Dificultad.vistaDificultad(controlador);
				vistaJuego.dispose();
			}
		});

		// Item SALIR con un listener para salir del programa
		JMenuItem subPestanaSalir = new JMenuItem("Salir");
		subPestanaSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				System.exit(0);
			}
		});
		pestanaArchivo.add(subPestanaSalir);

		JMenu pestanaAyuda = new JMenu("Ayuda");
		menuBar.add(pestanaAyuda);

		JMenuItem subPestanaComo = new JMenuItem("¿ Como jugar ?");
		subPestanaComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				JOptionPane.showMessageDialog(subPestanaComo,
						"MasterMind, es un juego de ingenio, en el cual un jugador intenta adivinar la combinación de colores creada al azar.\n \n"
								+ "1. El juego crea una combinación aleatoria de colores.\n" 
								+ "2. Dependiendo de la dificultad elegida, se dispone de un número de intentos determinados para adivinarlo\n" 
								+ "3. En cada intento se informa de que colores contiene la combinación creada al azar y de si están en la posicion correcta.\n"
								+ "4. Una vez consumido un intento, mostrará un cuadrado negro siempre que coincida el color con la posición y un cuadrado blanco solo si coincide el color.\n"
								+ "5. Al finalizar el número máximo de intentos, habrás perdido y se mostrará la combinación correcta.\n"
								+ "6. Si antes de finalizar el número máximo de intentos, habrás ganado");
								
			}
		});

		pestanaAyuda.add(subPestanaComo);

		JMenuItem subPestanaAcerca = new JMenuItem("Acerca de ...");
		subPestanaAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				JOptionPane.showMessageDialog(subPestanaAcerca, " Creado por:\n" + "  Constantin Vlad\n"
						+ "  Gerard Viñuela\n" + "  Aida Queralt\n"  + "  Gerard Sanchez\n");
			}
		});

		pestanaAyuda.add(subPestanaAcerca);
		
		return menuBar;
	}

	/**
	 * @return the vistaJuego
	 */
	public VistaJuego getVistaJuego() {
		return vistaJuego;
	}

	/**
	 * @param vistaJuego the vistaJuego to set
	 */
	public void setVistaJuego(VistaJuego vistaJuego) {
		this.vistaJuego = vistaJuego;
	}

	/**
	 * @return the jMenu
	 */
	public JMenuBar getjMenu() {
		return jMenu;
	}

	/**
	 * @param jMenu the jMenu to set
	 */
	public void setjMenu(JMenuBar jMenu) {
		this.jMenu = jMenu;
	}
	
	
}
