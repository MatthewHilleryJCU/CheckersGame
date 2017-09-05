import java.awt.*;
import javax.swing.*;

public class MainWindow {
private JFrame frame;
  public void repaint() {
    frame.repaint();
  }
  public void addComponent(Component c) {
    frame.add(c);
    c.setVisible(true);
    repaint();
  }
   public MainWindow(int winSizeX,int winSizeY) {
     frame = new JFrame("Main");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //JLabel textLabel = new JLabel("Main",SwingConstants.CENTER);
     frame.setPreferredSize(new Dimension(winSizeX, winSizeY));
     //frame.getContentPane().add(textLabel, BorderLayout.CENTER);
     frame.setLocationRelativeTo(null);
     frame.pack();
     frame.setVisible(true);
   }
}
