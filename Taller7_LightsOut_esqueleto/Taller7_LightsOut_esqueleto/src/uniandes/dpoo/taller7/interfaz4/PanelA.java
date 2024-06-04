package uniandes.dpoo.taller7.interfaz4;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class PanelA extends JPanel implements ActionListener {
    private JRadioButton easy;
    private JRadioButton medium;
    private JRadioButton hard;
    JComboBox<String> px;

    public PanelA() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel dificultadLbl = new JLabel("Dificultad:");
        this.add(dificultadLbl);

        easy = new JRadioButton("Fácil", true);
        medium = new JRadioButton("Medio", false);
        hard = new JRadioButton("Difícil", false);
        
		Border borde = BorderFactory.createTitledBorder("Opciones del juego");
		this.setBorder(borde);

		JLabel tamanio = new JLabel("Tamano:");
		tamanio.setAlignmentX(LEFT_ALIGNMENT);
		this.add(tamanio);
        

		String[] tamanios = { "4x4", "5x5", "6x6", "7x7", "8x8", "9x9" };        
        
		px = new JComboBox<String>(tamanios);
		px.setMaximumSize(getPreferredSize());
		px.setAlignmentX(LEFT_ALIGNMENT);
		px.addActionListener(px);
		
		this.add(px);




        ButtonGroup group = new ButtonGroup();
        group.add(easy);
        group.add(medium);
        group.add(hard);

        easy.addActionListener(this);
        medium.addActionListener(this);
        hard.addActionListener(this);

        this.add(easy);
        this.add(medium);
        this.add(hard);
        this.setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == easy) {
            System.out.println("Fácil seleccionado");
        } else if (e.getSource() == medium) {
            System.out.println("Medio seleccionado");
        } else if (e.getSource() == hard) {
            System.out.println("Difícil seleccionado");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PanelA Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(new PanelA());
        frame.setVisible(true);
    }
}
