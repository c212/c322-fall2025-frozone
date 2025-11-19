import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
  private Model m;
  private View v;
  public Controller(Model m, View v) {
    this.m = m;
    this.v = v;
    System.out.println("Controller for " + v.id + " created."); 
  }
  public void keyPressed(KeyEvent e) {
    System.out.println("Controller for " + v.id + " " + e);
    m.broadcast(new Command(v.id)); 
  }
  public void keyReleased(KeyEvent e) { }
  public void keyTyped(KeyEvent e) { }
}

// ---( Controller.java )---
