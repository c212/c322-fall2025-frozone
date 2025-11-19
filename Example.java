import javax.swing.JFrame;

public class Example {
  public static void main(String[] args) {
    Model m = new Model(args);
    for (int i = 0; i < args.length; i++) {
      System.out.println("Processing " + args[i]);
      View v = new View(m, i); 

      JFrame f = new JFrame("Player: " + args[i]); 
      f.setSize(400, 400); 
      f.add(v);
      
      f.setVisible(true);      
    }
  }
}

// --( Example.java )--
