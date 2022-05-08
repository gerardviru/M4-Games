package vistaJuego;

import java.awt.Color;
import javax.swing.JEditorPane;

public class Casilla extends JEditorPane {
	
	private int posicion;
	private Color color;
	
	/**
	 * Contructor
	 * @param posicion - La posición de la casilla
	 * @param color - El color del fondo de la casilla
	 * @param editable - Determina si tendra MouseListener y se podrá cambiar el fondo
	 */
	public Casilla(int posicion, Color color, boolean editable) {
		this.posicion = posicion;
		this.color = color;
		this.setEditable(false);
		this.setBackground(color);
		
		if (editable) {
			this.addMouseListener(new CasillaMouseListener());			
		}
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
