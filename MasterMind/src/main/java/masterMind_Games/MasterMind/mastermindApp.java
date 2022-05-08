package masterMind_Games.MasterMind;

import dificultad.Dificultad;
import vistaJuego.Controlador;
import vistaJuego.VistaJuego;

public class mastermindApp 
{
	
    public static void main( String[] args )
    {
    	
		// Inicializar controlador
		Controlador controlador = new Controlador();
    	
    	Dificultad.vistaDificultad(controlador);
    }
}
