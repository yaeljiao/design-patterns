package com.example.dp.party;


import com.example.dp.party.command.Command;
import com.example.dp.party.command.NoCommand;

public class RemoteControlWithUndo {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo() {
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
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    /**
     * 打印出每一个卡槽和对应的命令
     */
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----Remote Control-----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[Slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "   " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuffer.append("[Undo] " + undoCommand.getClass().getSimpleName() + "\n");
        return stringBuffer.toString();
    }
}
