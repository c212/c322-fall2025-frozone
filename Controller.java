import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
  protected Model m;
  protected View v;
  public Controller(Model m, View v) {
    this.m = m;
    this.v = v;
    // System.out.println("Controller for " + v.id + " created."); 
  }
  public void keyPressed(KeyEvent e) {
    Command c = new Command(v.id);
    // System.out.println("Controller for " + v.id + " sending [" + c + "] ");
    m.broadcast(c); 
  }
  public void keyReleased(KeyEvent e) { }
  public void keyTyped(KeyEvent e) { }
}

// ---( Controller.java )---
