package com.example.dp.complexremotewithundo.command;

import com.example.dp.complexremotewithundo.appliance.CeilingFan;

public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevLevel;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevLevel = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (prevLevel == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevLevel == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevLevel == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevLevel == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
