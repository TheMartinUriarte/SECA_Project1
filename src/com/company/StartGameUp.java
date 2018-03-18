package com.company;

public class StartGameUp {

    public String welcomeMSG_en;

    public StartGameUp(String welcomeMSG_en) {
        this.welcomeMSG_en = "Welcome to Rock Paper Scissors!";
    }

    public void display() {
        System.out.println(welcomeMSG_en);
    }
}
