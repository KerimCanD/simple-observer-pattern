import java.util.ArrayList;

public interface Observable {
    public ArrayList<Observer> observers = new ArrayList<>();

    public void add(Observer observer);
    public void remove(Observer observer);
    public void updateAll();
    public String getData();

    public void setData(String data);
}
