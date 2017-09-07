import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Checker extends GridPanel {
private static final int padding=5;
private Grid sup;
private Ch_Color ChColor;
private Color color;
private Ch_Type type;
private Boolean alive;
public int gpIndex;
private int screenX;
private int screenY;
private int myX;
private int myY;


public void paintComponent(Graphics g) {
  int gx = getX()-(getBounds().height/2);
  int gy = getY()-(getBounds().width/2);
  g.fillOval(gx,gy,getBounds().width,getBounds().height);
  super.paintComponent(g);
}

/*private Point adjustLocation(GridPanel gp) {
  Rectangle gpBounds = gp.getBounds();
  Rectangle thisBounds = this.getBounds();
  return new Point(
    (int)Math.floor(gpBounds.x+gpBounds.width/2)-(int)Math.floor(thisBounds.width/2),
    (int)Math.floor(gpBounds.y+gpBounds.height/2)-(int)Math.floor(thisBounds.height/2)
  );
}*/
public Checker(int size, Color bg, Ch_Color _color, Ch_Type _type, int gpindex, Grid objRef) {
  super(size,bg,gpindex);
  this.ChColor = _color;
  this.sup = objRef;
  this.color=(ChColor==Ch_Color.RED)?Color.RED:Color.BLACK;
  this.type=_type;
  this.gpIndex=gpindex;
  this.alive=true;
  setBackground(this.color);

//  System.out.println(this.getClass().getSimpleName()+" "+this.getPreferredSize());
  this.addMouseListener(new MouseListener() {
     public void mouseClicked(MouseEvent e) {}
     @Override
     public void mousePressed(MouseEvent e) {
       screenX = e.getXOnScreen();
       screenY = e.getYOnScreen();
       myX = (int)getX();
       myY = (int)getY();
     }
     public void mouseReleased(MouseEvent e) {
       GridPanel lc = sup.getGrid(getLocation());
       if(sup.validGrid(lc)) {
         sup.moveChecker(gpIndex,lc.getIndex());
       }else{
         setLocation(myX,myY);
       }
     }
     public void mouseEntered(MouseEvent e) {}
     public void mouseExited(MouseEvent e) {}

   });
   this.addMouseMotionListener(new MouseMotionListener() {
     @Override
     public void mouseDragged(MouseEvent e) {
       int deltaX = e.getXOnScreen() - screenX;
       int deltaY = e.getYOnScreen() - screenY;
       setLocation(myX + deltaX, myY + deltaY);
     }
     public void mouseMoved(MouseEvent e) {}
   });
   setPreferredSize(new Dimension(
                                  sup.gridPanels.get(gpIndex).getSize().width-padding,
                                  sup.gridPanels.get(gpIndex).getSize().height-padding
                                  )
                    );
   setVisible(true);
   repaint();
 }
}
