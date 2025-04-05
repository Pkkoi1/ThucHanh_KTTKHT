package model.Stocks;

import java.util.ArrayList;
import java.util.List;

public class stock {
    private String id;
   private Double price;

   List<observe> observers = new ArrayList<>();

    public stock(String id, Double price) {
         this.id = id;
         this.price = price;
    }
    public stock() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
        notifyAllObservers();

    }
    public void attach(observe observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (observe observer : observers) {
            observer.update(price);
        }
    }

}
