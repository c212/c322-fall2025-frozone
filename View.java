import javax.swing.JPanel;

public class View extends JPanel {
  private Model m;
  int id;
  public View(Model m, int id) {
    this.m = m;
    this.id = id;
    m.register(this); 
    System.out.println("View for player " + this.id + " created and registered with the model."); 
  }
}

// ---( View.java )---
