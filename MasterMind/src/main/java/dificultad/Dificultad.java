package dificultad;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import vistaJuego.Controlador;
import vistaJuego.VistaJuego;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

public class Dificultad extends JFrame {
	
	private JPanel contentPane;


	public static void vistaDificultad(Controlador controlador) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dificultad frame = new Dificultad(controlador);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dificultad(Controlador controlador) {
		
		setTitle("Mastermind");
		setBounds(800, 300, 450, 300);
		getContentPane().setLayout(null);
		
		JRadioButton radBtn1 = new JRadioButton("Principiante", true);
		radBtn1.setBounds(160, 46, 109, 23);
		getContentPane().add(radBtn1);
		
		JRadioButton radBtn2 = new JRadioButton("Intermedio", false);
		radBtn2.setBounds(160, 94, 109, 23);
		getContentPane().add(radBtn2);
		
		JRadioButton radBtn3 = new JRadioButton("Avanzado", false);
		radBtn3.setBounds(160, 140, 109, 23);
		getContentPane().add(radBtn3);
		
		ButtonGroup dificultades = new ButtonGroup ();
		dificultades.add(radBtn1);
		dificultades.add(radBtn2);
		dificultades.add(radBtn3);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			// Accion boton "ACEPTAR"
			// Define la dificultad
			public void actionPerformed(ActionEvent e) {
				
				if (radBtn2.isSelected()) {
					controlador.setMaximoIntentos(8);
					controlador.setMaxColor(4);
				} else if(radBtn3.isSelected()) {
					controlador.setMaximoIntentos(6);
					controlador.setMaxColor(5);
				}
				VistaJuego.crearVistaJuego(controlador);
				dispose();
			}
		});
		btnAceptar.setBounds(95, 198, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			// Accion boton "CANCELAR"
			public void actionPerformed(ActionEvent e) {
				VistaJuego.crearVistaJuego(controlador);
				dispose();
			}
		});
		btnCancelar.setBounds(227, 198, 89, 23);
		getContentPane().add(btnCancelar);
	
	}
}

