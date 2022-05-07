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
		editorPane_4.setBounds(20, 29, 21, 20);
		insertarPanel.add(editorPane_4);
		
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBounds(83, 29, 21, 20);
		insertarPanel.add(editorPane_5);
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
		editorPane_6.setBounds(152, 29, 21, 20);
		insertarPanel.add(editorPane_6);
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
		editorPane_7.setBounds(216, 29, 21, 20);
		insertarPanel.add(editorPane_7);
		
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
		
		JPanel insertarPanel_1 = new JPanel();
		insertarPanel_1.setLayout(null);
		insertarPanel_1.setOpaque(false);
		insertarPanel_1.setVisible(false);
		insertarPanel_1.setBounds(0, 135, 256, 74);
		contentPane.add(insertarPanel_1);
		
		JEditorPane editorPane_4_1 = new JEditorPane();
		editorPane_4_1.setEditable(false);
		editorPane_4_1.setBackground(Color.WHITE);
		editorPane_4_1.addMouseListener(new MouseListener() {
			Controlador controlador = new Controlador();
			public void mouseClicked(MouseEvent e) {
					controlador.cambiarColor(e.getButton(),editorPane_4_1);
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
		editorPane_4_1.setBounds(20, 29, 21, 20);
		insertarPanel_1.add(editorPane_4_1);
		
		JEditorPane editorPane_5_1 = new JEditorPane();
		editorPane_5_1.setEditable(false);
		editorPane_5_1.setBackground(Color.WHITE);
		editorPane_5_1.addMouseListener(new MouseListener() {
		Controlador controlador = new Controlador();
		public void mouseClicked(MouseEvent e) {
				controlador.cambiarColor(e.getButton(),editorPane_5_1);
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
		editorPane_5_1.setBounds(83, 29, 21, 20);
		insertarPanel_1.add(editorPane_5_1);
		
		JEditorPane editorPane_6_1 = new JEditorPane();
		editorPane_6_1.setEditable(false);
		editorPane_6_1.setBackground(Color.WHITE);
		editorPane_6_1.setBounds(152, 29, 21, 20);
		insertarPanel_1.add(editorPane_6_1);
		
		JEditorPane editorPane_7_1 = new JEditorPane();
		editorPane_7_1.setEditable(false);
		editorPane_7_1.setBackground(Color.WHITE);
		editorPane_7_1.setBounds(216, 29, 21, 20);
		insertarPanel_1.add(editorPane_7_1);
		
		JPanel insertarPanel_2 = new JPanel();
		insertarPanel_2.setLayout(null);
		insertarPanel_2.setOpaque(false);
		insertarPanel_2.setVisible(false);
		insertarPanel_2.setBounds(0, 220, 256, 74);
		contentPane.add(insertarPanel_2);
		
		JEditorPane editorPane_4_2 = new JEditorPane();
		editorPane_4_2.setEditable(false);
		editorPane_4_2.setBackground(Color.WHITE);
		editorPane_4_2.setBounds(20, 29, 21, 20);
		insertarPanel_2.add(editorPane_4_2);
		
		JEditorPane editorPane_5_2 = new JEditorPane();
		editorPane_5_2.setEditable(false);
		editorPane_5_2.setBackground(Color.WHITE);
		editorPane_5_2.setBounds(83, 29, 21, 20);
		insertarPanel_2.add(editorPane_5_2);
		
		JEditorPane editorPane_6_2 = new JEditorPane();
		editorPane_6_2.setEditable(false);
		editorPane_6_2.setBackground(Color.WHITE);
		editorPane_6_2.setBounds(152, 29, 21, 20);
		insertarPanel_2.add(editorPane_6_2);
		
		JEditorPane editorPane_7_2 = new JEditorPane();
		editorPane_7_2.setEditable(false);
		editorPane_7_2.setBackground(Color.WHITE);
		editorPane_7_2.setBounds(216, 29, 21, 20);
		insertarPanel_2.add(editorPane_7_2);
		
		JButton comprobarBtn = new JButton("Comprobar");
		comprobarBtn.setBounds(266, 76, 109, 23);
		contentPane.add(comprobarBtn);
		comprobarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.validacion(editorPane_4.getBackground(),controlador.getColoresSecretos().get(0));
				controlador.validacion(editorPane_5.getBackground(),controlador.getColoresSecretos().get(1));
				controlador.validacion(editorPane_6.getBackground(),controlador.getColoresSecretos().get(2));
				controlador.validacion(editorPane_7.getBackground(),controlador.getColoresSecretos().get(3));
				
				// Mover el Boton comprobar
				comprobarBtn.setBounds(266, 160, 109, 23);
				contentPane.add(comprobarBtn);
				contentPane.revalidate();
					
				insertarPanel_1.setVisible(true);
			}
		});
		
	}
}
