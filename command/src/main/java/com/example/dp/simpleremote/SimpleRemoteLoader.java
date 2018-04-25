package com.example.dp.simpleremote;

import com.example.dp.simpleremote.appliance.GarageDoor;
import com.example.dp.simpleremote.appliance.Light;
import com.example.dp.simpleremote.command.Command;
import com.example.dp.simpleremote.command.GarageDoorOpenComand;
import com.example.dp.simpleremote.command.LightOnCommand;

public class SimpleRemoteLoader {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        Command command1 = new LightOnCommand(light);
        Command command2 = new GarageDoorOpenComand(garageDoor);

        // 将遥控器的卡槽设置成控制灯亮
        simpleRemoteControl.setCommand(command1);
        simpleRemoteControl.buttonWasPressed();

        // 将遥控器的卡槽设置成控制开车库门
        simpleRemoteControl.setCommand(command2);
        simpleRemoteControl.buttonWasPressed();
    }
}
