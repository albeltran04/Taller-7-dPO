package uniandes.dpoo.taller7.interfaz4;



import java.awt.BorderLayout;

import java.awt.Dimension;
import javax.swing.JFrame;

import uniandes.dpoo.taller7.modelo.Tablero;





@SuppressWarnings("serial")
public class VentanaJuego extends JFrame {

	private PanelA arriba;
	private PanelD derecha;
	private PanelI abajo;
	private TableroJuego centro;
    private int dimensionJuego;
    private Tablero board;

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
		this.centro = new TableroJuego();
		this.add(centro,BorderLayout.CENTER);


    	}


	public void nuevoJuego() {
        this.board = new Tablero(dimensionJuego);
        this.centro.cambiarTamanio(dimensionJuego);
    }

    public void reiniciarJuego() {
        this.board.reiniciar();
        this.centro.repaint();
    }
    
    public Tablero getTablero() {
        return board;
    }
    

	
	
	
	
	
	
	
    public static void main(String[] args) {

    	new VentanaJuego();
    	VentanaJuego ventana = new VentanaJuego();
        
        // Hace visible la ventana
        ventana.setVisible(true);
    	
    }
}
