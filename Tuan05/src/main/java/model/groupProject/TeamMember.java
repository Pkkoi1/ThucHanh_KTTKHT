package model.groupProject;

public class TeamMember implements Observer {
    private String name;
    private String state;

    public TeamMember(String name, String state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public void update(String state) {
        this.state = state;
        System.out.println("Team member " + name + " has been updated to: " + state);
    }
}
