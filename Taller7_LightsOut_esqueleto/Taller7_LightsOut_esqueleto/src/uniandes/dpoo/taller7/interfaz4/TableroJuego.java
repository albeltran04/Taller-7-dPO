package uniandes.dpoo.taller7.interfaz4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

import uniandes.dpoo.taller7.modelo.Tablero;

@SuppressWarnings("serial")
public class TableroJuego extends JPanel {
    private int dimensionJuego;
    private Tablero board;

    public TableroJuego() {
        this.board = new Tablero(7);
        this.dimensionJuego = 7;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                int cellSize = Math.min(getWidth(), getHeight()) / dimensionJuego;
                int row = y / cellSize;
                int col = x / cellSize;
                board.jugar(row, col);
                repaint();
            }
        });
    }

    
    
    
    
    public void cambiarTamanio(int nuevoTamanio) {
        this.dimensionJuego = nuevoTamanio;
        board = new Tablero(nuevoTamanio);
        board.desordenar(10);
        repaint();
    }

    
    
    
    
    
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int anchoPanel = getWidth();
        int altoPanel = getHeight();
        int cellSize = Math.min(anchoPanel, altoPanel) / dimensionJuego;

        for (int fila = 0; fila < dimensionJuego; fila++) {
            for (int col = 0; col < dimensionJuego; col++) {
                Rectangle2D cell = new Rectangle2D.Double(fila * cellSize, col * cellSize, cellSize, cellSize);
                if (board.darTablero()[fila][col]) {
                    g2d.setColor(Color.YELLOW);
                } else {
                    g2d.setColor(Color.BLACK);
                }
                g2d.fill(cell);
                g2d.setColor(Color.BLACK);
                g2d.draw(cell);
            }
        }
    }
    
    
    
    
    
    
    

    public void iniciarNuevoJuego() {
        this.board = new Tablero(dimensionJuego);
        this.cambiarTamanio(dimensionJuego);
    }

    public void reiniciar() {
        this.board.reiniciar();
        this.repaint();
    }
}







