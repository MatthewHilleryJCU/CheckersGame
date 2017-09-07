import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class ConservedRatioPanel extends JPanel implements ComponentListener {
  private Dimension staticSize;
  public double ratio;
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
  }
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
    staticSize=(getSize().height>0&&getSize().width>0)?getSize():new Dimension(1,1);
    this.addComponentListener(this);
  }
  public ConservedRatioPanel(Dimension d) {
    staticSize=(getSize().height>0&&getSize().width>0)?getSize():new Dimension(1,1);
    setRatio((double)d.height,(double)d.width);
    this.addComponentListener(this);
  }
  public ConservedRatioPanel(int height, int width, int f) {
    staticSize=(getSize().height>0&&getSize().width>0)?getSize():new Dimension(1,1);
    setRatio((double)height,(double)width);
    this.addComponentListener(this);
  }
  public ConservedRatioPanel(int height, int width) {
    staticSize=(getSize().height>0&&getSize().width>0)?getSize():new Dimension(1,1);
    setRatio((double)height,(double)width);
    this.addComponentListener(this);
  }

   public void componentResized(ComponentEvent e) {
       setPreferredSize(getResizedDimension(
            this.staticSize, SwingUtilities.getWindowAncestor(this).getSize()
       ));
                        revalidate();
                        //System.out.println("Resized Dims: "+getSize().width+", "+getSize().height);
                        staticSize=new Dimension(getSize());
   }

   public void componentHidden(ComponentEvent e) {}

   public void componentMoved(ComponentEvent e) {}

   public void componentShown(ComponentEvent e) {}

}
