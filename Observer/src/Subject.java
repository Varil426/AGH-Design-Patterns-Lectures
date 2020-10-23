import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers;

    Subject() {
        observers = new ArrayList<>();
    }

    void addObserver(Observer obs) {
        if(obs != null)
            this.observers.add(obs);
    }

    void updateAll() {
        for(Observer ob : observers) {
            ob.update();
        }
    }
}
