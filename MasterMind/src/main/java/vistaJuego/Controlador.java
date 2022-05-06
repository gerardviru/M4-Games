package vistaJuego;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JEditorPane;

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

	public void cambiarColor(int mouseButton,JEditorPane panel) {
		
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
		panel.setBackground(colores[valor]);
		
	}
	
	public void combinacionSecreta() {
		for (int i = 0; i < maxColor +1; i++) {
			int numRandom = (int) (Math.random()*maxColor);
			coloresSecretos.add(colores[numRandom]);
		}
	}
	
	public boolean validacion(Color colorPanel, Color colorSecreto) {
		if(colorPanel.equals(colorSecreto)) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}
}
