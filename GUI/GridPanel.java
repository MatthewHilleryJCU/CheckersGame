import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridPanel extends JPanel {
  private Color bgColor=Color.BLUE;
  private Color clickedColor=Color.RED;
  public void setClickedColor(Color color) {
    this.clickedColor=color;
  }
  public void setBgColor(Color color) {
    this.bgColor=color;
  }
  public Color getClickedColor() {
    return this.clickedColor;
  }
  public Color getBgColor() {
    return this.bgColor;
  }
  public GridPanel(int size) {
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        int modifiers = e.getModifiers();
        if ((modifiers & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
              setBackground(getClickedColor());
        }
        if ((modifiers & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
              setBackground(getBgColor());
        }
        repaint();
      }
  });
  setBackground(bgColor);
  setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  setPreferredSize(new Dimension(size,size));
  }
}
