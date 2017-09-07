import java.awt.*;
import javax.swing.*;
import java.util.*;

public class GamePanel extends JPanel {
protected static final int grid_side_length = 8;
protected static int init_squareSize = 50;
public Grid board;

public void paintComponent(Graphics g) {
  super.repaint();
}



public GamePanel(/*Dimension size*/) {
  board = new Grid(grid_side_length,grid_side_length,init_squareSize);
  setVisible(true);
  setPreferredSize(board.size);
  setSize(board.size);
  setMinimumSize(board.size);
  //System.out.println("DEBUG:PreferredSize: "+this.getClass().getSimpleName()+": "+this.getPreferredSize());
  //System.out.println("DEBUG:Rendered Size: "+this.getClass().getSimpleName()+": "+this.getSize());
  setBackground(Color.YELLOW);
  revalidate();
  repaint();
}
}
