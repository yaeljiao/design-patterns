package com.example.dp.simpleremote.command;

import com.example.dp.simpleremote.appliance.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
