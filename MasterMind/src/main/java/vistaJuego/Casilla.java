package vistaJuego;

import java.awt.Color;
import javax.swing.JEditorPane;

public class Casilla extends JEditorPane {
	
	private int posicion;
	private Color color;
	private boolean comprobada = false;
	
	private int valor = -1;
	private int maxColor;
	private Color[] colores;
	
	/**
	 * Contructor para las casillas que no deben cambiar de color.
	 * 
	 * @param posicion - La posición de la casilla
	 * @param color - El color del fondo de la casilla
	 * @param editable - Determina si tendra MouseListener y se podrá cambiar el fondo
	 */
	public Casilla(int posicion, Color color, boolean editable) {
		this.posicion = posicion;
		this.color = color;
		this.setBackground(color);
		this.setEditable(false);
		
	}
	
	/**
	 * Contructor para las casillas input que cambian de color al hacer click con el raton;
	 * 
	 * @param posicion
	 * @param color
	 * @param valor
	 * @param maxColor
	 * @param colores
	 */
	public Casilla(int posicion, Color color, int valor, int maxColor, Color[] colores) {
		this.posicion = posicion;
		this.color = color;
		this.setBackground(color);
		this.setEditable(false);
		this.addMouseListener(new CasillaMouseListener(valor, maxColor, colores));			
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
	
	/**
	 * 
	 * @return
	 */
	public boolean getComprobada() {
		return comprobada;
	}
	/**
	 * 
	 * @param x
	 */
	public void setComprobada(boolean x) {
		this.comprobada = x; 
	}
	
	

}
