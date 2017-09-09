import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridPanel extends JPanel {
  protected Color bgColor;
  private int index;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
  }

  public void setBgColor(Color color) {
    this.bgColor=color;
    this.setBackground(color);
    System.out.println("set bg to " +color.toString()+" "+bgColor.toString());
    this.repaint();
  }

  public Color getBgColor() {
    return this.bgColor;
  }

  public void setIndex(int idx) {
    this.index=idx;
  }
  public int getIndex() {
    return this.index;
  }

  public GridPanel(int size, Color color, int idx) {
    this.index=idx;
    this.bgColor=color;
    this.setOpaque(true);
    /*addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        int modifiers = e.getModifiers();
        if ((modifiers & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
              setBackground(getClickedColor()); -- may need to update
        }
        if ((modifiers & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
              setBackground(getBgColor());
        }
        repaint();
      }
  });*/
  this.setBackground(bgColor);
  this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  //this.setLayout(new FlowLayout());
  Dimension s = new Dimension(size,size);
  setSize(s);
  setMinimumSize(s);
  setPreferredSize(s);
  //System.out.println(this.getClass().getSimpleName()+" "+this.getPreferredSize());
  //System.out.println("DEBUG:Rendered Size: "+this.getClass().getSimpleName()+": "+this.getSize());
  }
}
