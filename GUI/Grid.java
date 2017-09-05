import java.util.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Color;

public class Grid extends ConservedRatioPanel {
  public ArrayList<GridPanel> gridPanels;

  public void addGridPanels() {
    for(int i=0;i<gridPanels.size();i++) {
      add(gridPanels.get(i));
    }
  }

  public Grid(int gN_Width,int gN_Height,int panelSize) {
    int nPanels = gN_Width*gN_Height;
    gridPanels = new ArrayList<GridPanel>();
    setLayout(new GridLayout(gN_Width,gN_Height));
    setPreferredSize(new Dimension(gN_Width*panelSize,gN_Height*panelSize));
    setRatio(gN_Width*panelSize,gN_Height*panelSize);
    for(int i=0; i<nPanels; i++) {
      GridPanel gp = new GridPanel(panelSize);
      if(i%2==0) {
        gp.setBgColor(Color.BLACK);
      } else {
        gp.setBgColor(Color.WHITE);
      }
      gridPanels.add(new GridPanel(panelSize));
    }
    addGridPanels();
  }
}
