import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
public class ConservedRatioPanel extends JPanel implements ComponentListener {
  public double ratio;
  public void setRatio(double height, double width) {
    ratio=height/width;
  }
  public void setRatio(double rat) {
    ratio=rat;
  }
  public ConservedRatioPanel() {
    this.addComponentListener(this);
  }
  public ConservedRatioPanel(int height, int width, int f) {
    setRatio((double)height,(double)width);
    this.addComponentListener(this);
  }
  public ConservedRatioPanel(int height, int width) {
    setRatio((double)height,(double)width);
    this.addComponentListener(this);
  }
    public void paintComponent(Graphics g) {}

   public void componentResized(ComponentEvent e) {
       setPreferredSize(new Dimension(
                          getSize().width,
                          (int)(ratio*(double)getSize().height)
                        ));
                        repaint();
   }

   public void componentHidden(ComponentEvent e) {}

   public void componentMoved(ComponentEvent e) {}

   public void componentShown(ComponentEvent e) {}

}
