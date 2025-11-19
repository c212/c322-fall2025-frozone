public class Model {
  String[] args; 
  View[] views;
  public Model(String[] args) {
    this.args = args;
    // System.out.println("I am creating Model: " + java.util.Arrays.toString( this.args ));
    this.views = new View[args.length];     
  }
  public void register(View view) {
    this.views[view.id] = view;
  }
  public void broadcast(Command c) {
    // depending on c modify the data structures
    for (int i = 0; i < views.length; i++) {
      // System.out.println("Sending " + c + " to " + views[i].id); 
      views[i].updateView();
    } 
  }
}

// ---( Model.java )---
