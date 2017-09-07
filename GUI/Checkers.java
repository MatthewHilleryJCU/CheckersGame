import javax.swing.SwingUtilities;
public class Checkers {
public static MainWindow w;
//private static int init_sizeX;
//private static int init_sizeY;
public static void main(String args[]) {
  SwingUtilities.invokeLater(new Runnable() {
      public void run() {
  w = new MainWindow();
  w.repaint();
}
});
}
}
