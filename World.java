import java.awt.Graphics; 

public class World extends View {
  public World(Model m, int id) {
    super(m, id); 
  }
  public void paintComponent(Graphics g) {
    Point[] locations = ((Players)m).locations;
    for (Point p : locations) 
      System.out.println( p ); 
  }
}

// ---( World.java )---
