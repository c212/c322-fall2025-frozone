import javax.swing.JPanel;
import java.awt.Graphics; 

public class View extends JPanel {
  protected Model m;
  int id;
  public View(Model m, int id) {
    this.m = m;
    this.id = id;
    m.register(this); 
    System.out.println("View for player " + this.id + " created and registered with the model."); 
  }
  public void paintComponent(Graphics g) {
    System.out.println("View " + this.id + " repainting..."); 
  }
  public void updateView() {
    System.out.println("View " + this.id + " being sent an update signal.");
    repaint(); 
  }
}

// ---( View.java )---
