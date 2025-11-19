public class Move extends Command {
  int dx, dy; 
  public Move(int id, int dx, int dy) {
    super(id);
    this.dx = dx;
    this.dy = dy;
  }  
  public String toString() {
    return "Move from " + this.id;
  } 
}
