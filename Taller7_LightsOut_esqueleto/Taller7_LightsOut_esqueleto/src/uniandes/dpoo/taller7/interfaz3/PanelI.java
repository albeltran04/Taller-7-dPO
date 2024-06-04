package uniandes.dpoo.taller7.interfaz3;

import java.awt.Color;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


@SuppressWarnings("serial")


public class PanelI extends JPanel
{


	JLabel cantidadJugadas;
	JLabel nombreJugador;
	
	//Constructor

	public PanelI()
	{
	
		GridLayout layout = new GridLayout(0, 4);
		this.setLayout(layout);
		
		
		
		Border borderPrincipal = BorderFactory.createTitledBorder("Actividades");
		this.setBorder(borderPrincipal);
		
		
		
		Border border = BorderFactory.createLineBorder(Color.GREEN, 2);
		JLabel jugadasLabel = new JLabel("Jugadas hechas");
		add(jugadasLabel);
		
		
		cantidadJugadas = new JLabel("0");
		cantidadJugadas.setBorder(border);
		add(cantidadJugadas);
		
		
		
		JLabel jugadorLabel = new JLabel("Jugador");
		add(jugadorLabel);
		
		
		
		
		nombreJugador = new JLabel("Null");
		nombreJugador.setBorder(border);
		add(nombreJugador);
				
	}
}