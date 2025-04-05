package org.example;

import model.Stocks.investor;
import model.Stocks.stock;
import model.groupProject.Task;
import model.groupProject.TeamMember;

public class Main {
    public static void main(String[] args) {
        stock stock = new stock("1", 100.0);
        investor investor1 = new investor("1", "initial state", "Investor 1");
        investor investor2 = new investor("2", "initial state", "Investor 2");

        stock.attach(investor1);
        stock.attach(investor2);

        stock.setPrice(200.0);
        stock.setPrice(300.0);


        System.out.println("----------------------");

        Task task = new Task("1", "Design UX/UI", "Not started");
        Task task1 = new Task("2", "Develop the app", "Not started");

        TeamMember teamMember1 = new TeamMember("John", "Not started");
        TeamMember teamMember2 = new TeamMember("Doe", "Not started");
        TeamMember teamMember3 = new TeamMember("Jane", "Not started");
        TeamMember teamMember4 = new TeamMember("Kit", "Not started");

        task.attach(teamMember1);
        task1.attach(teamMember2);
        task.attach(teamMember3);
        task1.attach(teamMember4);

        task.setState("In progress");
        task1.setState("In progress");
        task1.setState("Completed");
    }
}