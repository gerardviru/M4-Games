package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu {
		
	public static JMenuBar menuBar() {
		
		// Menu de navegación 
		JMenuBar menuBar = new JMenuBar();
		
		// Item Archivo con desplegable
		JMenu pestanaArchivo = new JMenu("Archivo");
		menuBar.add(pestanaArchivo);
		
		//Item para crear una nueva partida
		JMenuItem subPestanaNuevo = new JMenuItem("Nuevo Juego");
		pestanaArchivo.add(subPestanaNuevo);
		
		//Item SALIR con un listener para salir del programa
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
	        	JOptionPane.showMessageDialog(subPestanaComo, "Cómo jugar a  Mastermind\nMasterMind es un juego dificíl de ingenio, en el cual un jugador intenta asdivinar el código que se le ocurre a su oponente.\n"
	        			+ "1. El juego crea un código aleatorio de colores.\n"
	        			+ "2. ghghghg"
	        			+ "3. fggfhghfghfh "
	        			+ "4. fdgfdgdfgdgg"
	        			+ "");    
	        }
	    });
		
		pestanaAyuda.add(subPestanaComo);
		
		JMenuItem subPestanaAcerca = new JMenuItem("Acerca de ...");
		subPestanaAcerca.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	JOptionPane.showMessageDialog(subPestanaAcerca, " Creado por:\n"
	        			+ " # Constantin Vlad\n"
	        			+ " # Gerard Viñuela\n"
	        			+ " # Gerard Sanchez\n"
	        			+ " # Aida Queralt");    
	        }
	    });
		
		pestanaAyuda.add(subPestanaAcerca); 
		
		return menuBar;
	}
}
