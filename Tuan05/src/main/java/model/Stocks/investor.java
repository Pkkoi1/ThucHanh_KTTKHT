package model.Stocks;

public class investor implements observe {
    private String id;
    private String state;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public investor(String id, String state, String name) {
        this.id = id;
        this.state = state;
        this.name = name;
    }

    public investor() {
    }

    @Override
    public void update(Double price) {
        System.out.println("Price updated for " +name + " : " + price);
    }


}
