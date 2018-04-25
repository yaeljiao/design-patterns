package com.example.dp.complexremotewithundo;

import com.example.dp.complexremotewithundo.appliance.CeilingFan;
import com.example.dp.complexremotewithundo.appliance.Light;
import com.example.dp.complexremotewithundo.command.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = new CeilingFanHighSpeedCommand(livingRoomCeilingFan);
        CeilingFanMediumSpeedCommand ceilingFanMediumSpeedCommand = new CeilingFanMediumSpeedCommand(livingRoomCeilingFan);
        CeilingFanLowSpeedCommand ceilingFanLowSpeedCommand = new CeilingFanLowSpeedCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        // 卡槽1控制客厅灯的开关
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        // 卡槽2控制风扇高速转动开关
        remoteControl.setCommand(1, ceilingFanHighSpeedCommand, ceilingFanOffCommand);
        // 卡槽3控制风扇中速转动开关
        remoteControl.setCommand(2, ceilingFanMediumSpeedCommand, ceilingFanOffCommand);
        // 卡槽4控制风扇低速转动开关
        remoteControl.setCommand(3, ceilingFanLowSpeedCommand, ceilingFanOffCommand);

        // 当前遥控器的状态
        System.out.println(remoteControl);

        // 控制客厅灯
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println("按下Undo按键");
        remoteControl.undoButtonWasPushed();

        // 控制风扇
        remoteControl.onButtonWasPushed(1);
        System.out.println("按下Undo按键");
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        System.out.println("按下Undo按键");
        remoteControl.undoButtonWasPushed();
    }
}
