public class Command {
  int id;
  public Command(int id) {
    this.id = id;
  }  
  public String toString() {
    return "Command issued by view " + this.id; 
  }
}

// --( Command.java )--
