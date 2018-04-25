package com.example.dp.simpleremote;

import com.example.dp.simpleremote.command.Command;

/**
 * 模拟只有一个控制槽的遥控器
 * @author H155719
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
