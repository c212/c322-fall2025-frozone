public class Players extends Model {
  Point[] locations;
  public Players(String[] args) {
    super(args);
    locations = new Point[args.length];
    for (int i = 0; i < args.length; i++) {
      locations[i] = new Point( (int) (400 * Math.random()), (int) (400 * Math.random()) );
    }
  }

}

// ---( Players.java )---
