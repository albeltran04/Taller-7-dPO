package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;

import java.awt.Dimension;
import javax.swing.JFrame;





@SuppressWarnings("serial")
public class VentanaJuego extends JFrame {




	public VentanaJuego() {

        setTitle("Juego LightsOut");
        setSize(new Dimension(726, 461));  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

    }

    public static void main(String[] args) {

    	new VentanaJuego();
    	
    }
}