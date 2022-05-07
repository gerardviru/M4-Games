package vistaJuego;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CasillaMouseListener implements MouseListener {
	
	Controlador controlador = new Controlador();

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getButton());
		System.out.println(e.getComponent());
		controlador.cambiarColor(e.getButton(), e.getComponent());
		
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

}
