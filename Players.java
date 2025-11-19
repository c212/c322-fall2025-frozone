public class Players extends Model {
  Point[] locations;
  public Players(String[] args) {
    super(args);
    locations = new Point[args.length];
    for (int i = 0; i < args.length; i++) {
      locations[i] = new Point( (int) (400 * Math.random()), (int) (400 * Math.random()) );
    }
  }

  public void broadcast(Command c) {
    Move m = (Move) c; 
    Point p = this.locations[c.id]; 
    p.x += m.dx; 
    p.y += m.dy; 
    super.broadcast(c);
  }

}
// ---( Players.java )---
