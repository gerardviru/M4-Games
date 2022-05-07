package vistaJuego;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Controlador {

	private Color[] colores = { Color.magenta, Color.cyan, Color.yellow, Color.green, Color.gray };
	private ArrayList<Color> coloresSecretos = new ArrayList<Color>();
	private int valor= -1;
	private int maxColor = 3;
	
	public Controlador() {

	}
	
	public ArrayList<Color> getColoresSecretos() {
		return coloresSecretos;
	}

	public void cambiarColor(int mouseButton, Component casilla) {
		
        // Dinamico segun la dificultad

		if (mouseButton == 1) {
            if (valor >= maxColor)
                valor = 0; 
            else
                valor++;
        } else if (mouseButton == maxColor) {
            if (valor <= 0)
                valor = maxColor; 
            else
                valor--;
        }
		casilla.setBackground(colores[valor]);
		
	}
	
	public void combinacionSecreta() {
		for (int i = 0; i < maxColor +1; i++) {
			int numRandom = (int) (Math.random()*maxColor);
			coloresSecretos.add(colores[numRandom]);
		}
	}
	
	/**
	 * Validar los colores de las casillas
	 * 
	 * @param colorPanel
	 * @param colorSecreto
	 * @return
	 */
	public boolean validacion(Color colorPanel, Color colorSecreto) {
		if(colorPanel.equals(colorSecreto)) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}
	
	/**
	 * Mover un componente hacia abajo
	 * @param component
	 */
	public void moverAbajo(Component component) {
		// Cantidad de desplazamiento
		int units = 40;
		
		Point actualLocation = component.getLocation();
		component.setLocation(actualLocation.x, actualLocation.y + units);
	}
	
	public void dejarCopiaPanel(JPanel panel, JPanel padrePanel, int nrIntento) {
		JPanel pastPanel = new JPanel();
//		pastPanel.setLayout();
		pastPanel.setBounds(0, 49*nrIntento, 260, 40);
		pastPanel.setBackground(Color.BLACK);
		pastPanel.setName("panellll");
		pastPanel.setVisible(true);
		padrePanel.add(pastPanel);

		
	}
}
