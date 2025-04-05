package model.groupProject;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String description;
    private String state;
    private List<Observer> observers = new ArrayList<>();

    public Task(String name, String description, String state) {
        this.name = name;
        this.description = description;
        this.state = state;
    }

    public Task() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
