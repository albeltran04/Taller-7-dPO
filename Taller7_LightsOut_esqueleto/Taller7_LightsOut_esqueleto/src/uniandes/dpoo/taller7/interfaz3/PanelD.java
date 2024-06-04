package uniandes.dpoo.taller7.interfaz3;


import java.awt.Color;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;


import javax.swing.BorderFactory;

@SuppressWarnings("serial")
public class PanelD extends JPanel{
	
    private  JButton [] boton = new JButton[4];
    


    public PanelD(){
    	
        GridLayout layout = new GridLayout(3, 1);
        this.setLayout(layout);
        
        Border border = BorderFactory.createTitledBorder("Menu");
        this.setBorder(border);

        
        String[] botones = {"Nuevo","Reiniciar","TOP-10","Cambiar jugador"};
        for(int i =0; i<4;i++) {
        	this.boton[i] = new JButton(botones[i]);
        	this.add(this.boton[i]);
            

        	
        Color colorDeFondo = new Color(255, 255, 255); 
        this.setBackground(colorDeFondo);     	
        	
        	
        }
        
       


    }
}


