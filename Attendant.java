import java.awt.event.KeyEvent;

public class Attendant extends Controller {
  public Attendant(Model m, View v) {
    super(m, v); 
  }  
  public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    if (keyCode == KeyEvent.VK_LEFT) {
      m.broadcast(new Move(v.id, -10,   0));
    } else if (keyCode == KeyEvent.VK_RIGHT) {
      m.broadcast(new Move(v.id,  10,   0));
    } else if (keyCode == KeyEvent.VK_UP) {
      m.broadcast(new Move(v.id,   0, -10));
    } else if (keyCode == KeyEvent.VK_DOWN) {
      m.broadcast(new Move(v.id,   0,  10));
    } else {

    }
  }
}

// ---( Attendant.java )---

