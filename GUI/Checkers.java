import javax.swing.SwingUtilities;
public class Checkers {
public static MainWindow w;
private static Grid g;
private static int init_sizeX;
private static int init_sizeY;
private static final int sideLength = 8;
private static int init_squareSize;
public static void main(String args[]) {
  init_sizeX = 500;
  init_sizeY = 500;
  init_squareSize=20;
  SwingUtilities.invokeLater(new Runnable() {
      public void run() {
  w = new MainWindow(init_sizeX,init_sizeY);
  g = new Grid(sideLength,sideLength,init_squareSize);
  w.addComponent(g);
  w.repaint();
}
});
}
}
