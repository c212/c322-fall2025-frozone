import javax.swing.JFrame;

public class Example {
  public static void main(String[] args) {
    Model m = new Model(args);
    for (int i = 0; i < args.length; i++) {
      System.out.println("Creating View and Controller for: " + args[i]);
    }
  }
}

// --( Example.java )--
