
public class Person implements RoomObserver {
  //fields
  private String name;

  //constructor
  public Person(String name) {
    super();
    this.name = name;
  }

  //update method called when notifyObservers is fired
  public void update(String message) {
    System.out.println(toString() + " hears " + message);
  }

  @Override 
  public String toString() {
    return name;
  }

}