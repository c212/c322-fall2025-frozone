import java.awt.Graphics; 

public class World extends View {
  public World(Model m, int id) {
    super(m, id); 
  }
  public void paintComponent(Graphics g) {
    Point[] locations = ((Players)m).locations;
    for (Point p : locations) 
      g.drawOval(p.x, p.y, 20, 20); 
  }
}

// ---( World.java )---
