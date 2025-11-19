import javax.swing.JFrame;

public class Example {
  public static void main(String[] args) {
    Model m = new Players(args);
    for (int i = 0; i < args.length; i++) {
      System.out.println("Processing " + args[i]);
      View v = new World(m, i); 
      Controller c = new Attendant(m, v);
      JFrame f = new JFrame("Player: " + args[i]); 
      f.setSize(400, 400); 
      f.add(v);
      f.addKeyListener(c);
      f.setVisible(true);      
    }
  }
}

// --( Example.java )--
