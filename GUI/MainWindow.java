import java.awt.*;
import javax.swing.*;

public class MainWindow {
private JFrame frame;
private JPanel main;
  public void repaint() {
    frame.repaint();
  }
  public void addComponent(Component c) {
    main.add(c);
    c.setVisible(true);
    repaint();
  }
   public MainWindow(int winSizeX,int winSizeY) {
     frame = new JFrame("Main");
     main = new JPanel();
     frame.add(main);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setPreferredSize(new Dimension(winSizeX, winSizeY));
     frame.setLocationRelativeTo(null);
     frame.pack();
     frame.setVisible(true);
     frame.setMinimumSize(frame.getSize());
   }
}
