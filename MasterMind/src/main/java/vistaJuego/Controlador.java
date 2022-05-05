package vistaJuego;

import java.awt.Color;

import javax.swing.JEditorPane;



public class Controlador {

	private Color[] colores = { Color.magenta, Color.cyan, Color.yellow, Color.green, Color.gray };
	private int valor= -1;
	public Controlador() {

	}

	public void cambiarColor(int mouseButton,JEditorPane panel) {
		
        // Dinamico segun la dificultad
        int maxColor = 3;

        
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
}
