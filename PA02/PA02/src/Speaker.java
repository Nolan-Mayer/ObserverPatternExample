import java.util.ArrayList;
import java.util.List;

public class Speaker implements RoomSubject {

  //empty constructor
  public Speaker() {}
  
  //create an arraylist of roomobservers
  private List<RoomObserver> inRoom = new ArrayList<>();
  
  //add to list
  public void registerObserver(RoomObserver obs) {
    inRoom.add(obs);
  }

  //remove from list
  public void removeObserver(RoomObserver obs) {
    inRoom.remove(obs);
  }

  //update all observers in list
  public void notifyObservers(String message) {
    for(RoomObserver obs : inRoom) {
      obs.update(message);
    }
  }

}