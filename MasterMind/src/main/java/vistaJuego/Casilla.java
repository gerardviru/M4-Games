package vistaJuego;

import java.awt.Color;
import javax.swing.JEditorPane;

public class Casilla extends JEditorPane {
	
	private int posicion;
	private String color;
	
	public Casilla(int posicion) {
		this.posicion = posicion;
		this.color = color;
		this.setEditable(false);
		this.setBackground(Color.WHITE);
		this.addMouseListener(new CasillaMouseListener());
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
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
