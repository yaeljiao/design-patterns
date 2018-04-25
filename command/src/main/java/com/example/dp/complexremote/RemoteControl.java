package com.example.dp.complexremote;

import com.example.dp.complexremote.command.Command;
import com.example.dp.complexremote.command.NoCommand;

import java.util.Arrays;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        /**
         * 初始情况下，遥控器的开关上暂时没有命令
         * 这样做的好处是，当指令一个命令时候，不需要每次都做如下判断：
         * public void onButtonWasPushed(int slot) {
         *  if (onCommand[slot] != null) {
         *      onCommand[slot].execute();
         *  }
         * }
         */
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /**
     * 打印出每一个卡槽和对应的命令
     */
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----Remote Control-----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[Slot " + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
