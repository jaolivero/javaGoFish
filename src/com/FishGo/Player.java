package com.FishGo;

import java.util.Scanner;

public class Player {

    private String username;
    Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.username = name;
    }

    public String getUserName() {
        return username;
    }
}
