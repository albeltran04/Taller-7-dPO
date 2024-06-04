package uniandes.dpoo.taller7.interfaz3;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;





@SuppressWarnings("serial")
public class TableroJuego extends JPanel{


	@Override
	public void paint(Graphics e) {
		Graphics2D d2g = (Graphics2D) e;
		d2g.setColor(Color.blue);
		d2g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	
	
}