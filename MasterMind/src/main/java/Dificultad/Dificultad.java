package Dificultad;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Dimension;

public class Dificultad extends JFrame {
	
	private JPanel contentPane;


	public static void dificultad() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dificultad frame = new Dificultad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dificultad() {
		
		setTitle("Mastermind");
		setBounds(800, 300, 450, 300);
		getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Principiante", true);
		rdbtnNewRadioButton.setBounds(160, 46, 109, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnIntermedio = new JRadioButton("Intermedio", false);
		rdbtnIntermedio.setBounds(160, 94, 109, 23);
		getContentPane().add(rdbtnIntermedio);
		
		JRadioButton rdbtnAvanzado = new JRadioButton("Avanzado", false);
		rdbtnAvanzado.setBounds(160, 140, 109, 23);
		getContentPane().add(rdbtnAvanzado);
		
		ButtonGroup dificultades = new ButtonGroup ();
		dificultades.add(rdbtnNewRadioButton);
		dificultades.add(rdbtnIntermedio);
		dificultades.add(rdbtnAvanzado);
		
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(95, 198, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(227, 198, 89, 23);
		getContentPane().add(btnCancelar);
	
	}
}

