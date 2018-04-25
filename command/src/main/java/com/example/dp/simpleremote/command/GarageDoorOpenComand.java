package com.example.dp.simpleremote.command;

import com.example.dp.simpleremote.appliance.GarageDoor;

public class GarageDoorOpenComand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenComand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
