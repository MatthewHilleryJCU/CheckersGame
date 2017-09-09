import java.awt.*;
import javax.swing.*;
import java.util.*;

public class GamePanel extends JPanel {
protected static final int grid_side_length = 8;
protected static int init_squareSize = 50;
public Grid board;
private MainWindow frame;


public void paintComponent(Graphics g) {
  super.repaint();
}



public GamePanel(MainWindow parent) {
  this.frame = parent;
  frame.insertComponentIntoLayer(this,1);
  board = new Grid(grid_side_length,grid_side_length,init_squareSize, frame);
  //checkerboard = new Grid(grid_side_length,grid_side_length, init_squareSize, frame);
  setVisible(true);
  setPreferredSize(board.size);
  setSize(board.size);
  setMinimumSize(board.size);
  //System.out.println("DEBUG:PreferredSize: "+this.getClass().getSimpleName()+": "+this.getPreferredSize());
  //System.out.println("DEBUG:Rendered Size: "+this.getClass().getSimpleName()+": "+this.getSize());
  //setBackground(Color.YELLOW);
  add(board);
  //add(checkerboard);
  frame.insertComponentIntoLayer(board,1);
  //frame.insertComponentIntoLayer(checkerboard,1);
  revalidate();
  repaint();
}
}
