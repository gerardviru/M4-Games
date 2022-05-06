package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class archivoAyuda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					archivoAyuda frame = new archivoAyuda();
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
	public archivoAyuda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(archivoAyuda.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaTimeThumb.png")));
		setTitle("Master Mind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 690, 437);
		setBounds(450, 200, 900, 700);
		
		// Menu de navegación 
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// Item Archivo con desplegable
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		//Item para crear una nueva partida
		JMenuItem mntmNewMenuItem = new JMenuItem("Nuevo Juego");
		mntmNewMenuItem.setIcon(new ImageIcon(archivoAyuda.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mnNewMenu.add(mntmNewMenuItem);
		
		//Item SALIR con un listener para salir del programa
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.setIcon(new ImageIcon(archivoAyuda.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	                System.exit(0);
	        }
	    });
		mnNewMenu.add(mntmNewMenuItem_1);
		
		
		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("¿ Como jugar ?");
		mntmNewMenuItem_2.setIcon(new ImageIcon(archivoAyuda.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	JOptionPane.showMessageDialog(mntmNewMenuItem_2, "Cómo jugar a  Mastermind\nMasterMind es un juego dificíl de ingenio, en el cual un jugador intenta asdivinar el código que se le ocurre a su oponente.\n"
	        			+ "1. El juego crea un código aleatorio de colores.\n"
	        			+ "2. ghghghg"
	        			+ "3. fggfhghfghfh "
	        			+ "4. fdgfdgdfgdgg"
	        			+ "");    
	        }
	    });
		
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Acerca de ...");
		mntmNewMenuItem_3.setIcon(new ImageIcon(archivoAyuda.class.getResource("/com/sun/java/swing/plaf/windows/icons/Inform.gif")));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	JOptionPane.showMessageDialog(mntmNewMenuItem_3, " Creado por:\n"
	        			+ " # Constantin Vlad\n"
	        			+ " # Gerard Viñuela\n"
	        			+ " # Gerard Sanchez\n"
	        			+ " # Aida Queralt");    
	        }
	    });
		
		mnNewMenu_1.add(mntmNewMenuItem_3); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
