package vistaJuego;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JEditorPane;
import javax.swing.JPanel;

public class Controlador {

	private Color[] colores = { Color.magenta, Color.cyan, Color.yellow, Color.green, Color.gray };
	private ArrayList<Color> coloresSecretos = new ArrayList<Color>();
	private int valor= -1;
	private int maxColor = 3;
	private int uMovimiento = 40;
	
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
	
	/**
	 * Genera la combinacion secreta de colores
	 */
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
		
		Point actualLocation = component.getLocation();
		component.setLocation(actualLocation.x, actualLocation.y + uMovimiento);
	}
	
	/**
	 * Deja una copia grafica de los colores insertados anteriormente
	 * 
	 * @param insertPanel
	 * @param padrePanel
	 * @param nrIntento
	 */
	public void dejarCopiaPanel(JPanel insertPanel, JPanel padrePanel, int nrIntento) {
		// Inicializar un nuevo panel
		JPanel pastPanel = new JPanel();
		
		pastPanel.setLayout(null);
		pastPanel.setBounds(0, uMovimiento*nrIntento, 260, 40);
		
		// Añadir hijos al pastPanel
		// Tomar los hijos del insertPanel
		Component[] insertedComponents = insertPanel.getComponents();
		// Crear y añadir nuevos hijos al pastPanel a partir de los hijos del insertPanel
		for (int i = 0; i < insertedComponents.length; i++) {
			Component insertComp = insertedComponents[i];
			Component comp = new JEditorPane();
			comp.setBounds(55*i+55, 11, 20, 20);
			comp.setBackground(insertComp.getBackground());
			comp.setEnabled(false);
			pastPanel.add(comp);
		}
		
		
		pastPanel.setVisible(true);
		
		// Añadir el nuevo panel al panel padre
		padrePanel.add(pastPanel);

		
	}
}
