
// interfaces methods filled in speaker class
public interface RoomSubject {
  public void registerObserver(RoomObserver obs);
  public void removeObserver(RoomObserver obs);
  public void notifyObservers(String message);
}