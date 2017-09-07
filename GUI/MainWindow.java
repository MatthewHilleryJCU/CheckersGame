import java.awt.*;
import javax.swing.*;
import java.util.*;

public class MainWindow extends JFrame {
// COMPONENTS:
  private JPanel main;
  private GamePanel gamePanel;

// PARAMS:
  private static final int padding=50;

//METHODS:

  public void addComponent(Component c) {
    main.add(c);
    c.setVisible(true);
    main.repaint();
  }

   public MainWindow() {
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
     setVisible(true);
     setLayout(new FlowLayout());

     main = new JPanel();
     add(main);
     main.setLayout(new FlowLayout()); //TODO set constraints
     setContentPane(main);

     gamePanel = new GamePanel();
     addComponent(gamePanel);
     //TODO SideBar
     //TODO ContextMenu

     main.revalidate();
     main.repaint();
     //setResizable(false);
     pack();
     Dimension packedSize=new Dimension(getSize().width+padding, getSize().height+padding);
     setMinimumSize(packedSize);
     //System.out.println(this.getClass().getSimpleName()+" "+this.getPreferredSize());
     //System.out.println("DEBUG:Rendered Size: "+this.getClass().getSimpleName()+": "+this.getSize());
    setBackground(Color.GREEN);
     revalidate();
     repaint();

   }
}
