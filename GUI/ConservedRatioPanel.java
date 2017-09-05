import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class ConservedRatioPanel extends JPanel implements ComponentListener {
  public double ratio;

  public Dimension getResizedDimension(Dimension componentSize, Dimension boundary) {
    double widthRatio = boundary.getWidth() / componentSize.getWidth();
        double heightRatio = boundary.getHeight() / componentSize.getHeight();
        double resizeRatio = Math.min(widthRatio, heightRatio);
        return new Dimension((int) (componentSize.width * resizeRatio), (int) (componentSize.height * resizeRatio));
}

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
       setPreferredSize(getResizedDimension(
            getSize(), SwingUtilities.getWindowAncestor(this).getSize()
       ));
                        revalidate();
                        System.out.println("Resized Dims: "+getSize().width+", "+getSize().height);
   }

   public void componentHidden(ComponentEvent e) {}

   public void componentMoved(ComponentEvent e) {}

   public void componentShown(ComponentEvent e) {}

}
