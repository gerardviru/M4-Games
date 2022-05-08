package vistaJuego;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CasillaMouseListener implements MouseListener {
	
	private int valor = -1;
	private int maxColor;
	private Color[] colores;
	
	public CasillaMouseListener(int valor, int maxColor, Color[] colores) {
		this.valor = valor;
		this.maxColor = maxColor;
		this.colores = colores;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Dinamico segun la dificultad
		int mouseButton = e.getButton();
		Component casilla = e.getComponent();

		if (mouseButton == 1) {
			if (valor >= maxColor)
				valor = 0;
			else
				valor++;
		} else if (mouseButton == 3) {
			if (valor <= 0)
				valor = maxColor;
			else
				valor--;
		}
		casilla.setBackground(colores[valor]);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
