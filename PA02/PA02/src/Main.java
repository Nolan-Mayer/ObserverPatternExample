/**
 * Main class for PA02.
*/
public class Main {
  /**
   * Application entry point.
   * Nolan Mayer
   * @param args Command-line arguments. Ignored by this app.
   */
  public static void main(String[] args) {
    RoomSubject speaker = new Speaker();

    RoomObserver bob, ted, carol, alice;
    bob = new Person("Bob");
    ted = new Person("Ted");
    carol = new Person("Carol");
    alice = new Person("Alice");

    // test 1 - no one in the room
    String message = "Blah 1";
    System.out.println("Speaker says " + message);
    speaker.notifyObservers(message);

    // test 2 - everyone in the room
    speaker.registerObserver(bob);
    speaker.registerObserver(ted);
    speaker.registerObserver(carol);
    speaker.registerObserver(alice);

    message = "Blah 2";
    System.out.println("Speaker says " + message);
    speaker.notifyObservers(message);

    // test 3 -- ted and alice step out
    speaker.removeObserver(ted);
    speaker.removeObserver(alice);

    message = "Blah 3";
    System.out.println("Speaker says " + message);
    speaker.notifyObservers(message);
  }
}