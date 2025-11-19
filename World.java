import java.awt.Graphics; 

public class World extends View {
  public World(Model m, int id) {
    super(m, id); 
  }
  public void paintComponent(Graphics g) {
    Point[] locations = ((Players)m).locations;
    int i = 0; 
    for (Point p : locations) {
      g.drawOval(p.x, p.y, 20, 20); 
      g.drawString("" + m.args[i++], p.x + 5, p.y + 15); 
    }
  }

}

// ---( World.java )---
