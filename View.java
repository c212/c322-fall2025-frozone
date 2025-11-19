import javax.swing.JPanel;

public class View extends JPanel {
  private Model m;
  int id;
  public View(Model m, int id) {
    this.m = m;
    this.id = id;
    System.out.println("View for player " + this.id + " created."); 
  }
}

// ---( View.java )---
