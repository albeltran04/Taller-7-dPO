package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;




@SuppressWarnings("serial")
public class PanelA extends JPanel
{

	JRadioButton easy;
	JRadioButton medium;
	JRadioButton hard;

	JComboBox<String> cb;

	public PanelA()
	{                                       

		Border borde = BorderFactory.createTitledBorder("Opciones del juego");
		this.setBorder(borde);

		JLabel tamanio = new JLabel("Tamaño:");
		tamanio.setAlignmentX(LEFT_ALIGNMENT);
		this.add(tamanio);
        

		String[] opciones = { "4x4", "5x5", "6x6", "7x7", "8x8", "9x9" };
		

		
		cb = new JComboBox<String>(opciones);
		cb.setMaximumSize(getPreferredSize());
		cb.setAlignmentX(LEFT_ALIGNMENT);
		
		this.add(cb);

		JLabel dificultadLbl = new JLabel("Dificultad:");
		this.add(dificultadLbl);
		

		
		easy = new JRadioButton("Facil", true); 
		medium = new JRadioButton("Medio", false);
		hard = new JRadioButton("Dificil", false);
		
		ButtonGroup group = new ButtonGroup();
		group.add(easy);
		group.add(medium);
		group.add(hard);

		

		
		this.add(easy);
		this.add(medium);
		this.add(hard);
		
	}

}