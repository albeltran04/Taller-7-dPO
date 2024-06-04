package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;

import java.awt.Dimension;
import javax.swing.JFrame;





@SuppressWarnings("serial")
public class VentanaJuego extends JFrame {

	private PanelA arriba;
	private PanelD derecha;
	private PanelI abajo;



	public VentanaJuego() {

        setTitle("Juego LightsOut");
        setSize(new Dimension(726, 461));  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
		this.arriba = new PanelA();
		this.add(arriba,BorderLayout.NORTH);
		this.derecha = new PanelD();
		this.add(derecha,BorderLayout.EAST);
		this.abajo = new PanelI();
		this.add(abajo,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {

    	new VentanaJuego();
    	VentanaJuego ventana = new VentanaJuego();
        
        // Hace visible la ventana
        ventana.setVisible(true);
    	
    }
}