package dificultad;
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
			public void actionPerformed(ActionEvent e) {
				int dificultad = 0;
				
				if (radBtn2.isSelected()) {
					dificultad = 1;
				} else if(radBtn3.isSelected()) {
					dificultad = 2;
				}
				dispose();
			}
		});
		btnAceptar.setBounds(95, 198, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(227, 198, 89, 23);
		getContentPane().add(btnCancelar);
	
	}
}

