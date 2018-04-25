package com.example.dp.party;

import com.example.dp.party.appliance.Hottub;
import com.example.dp.party.appliance.Light;
import com.example.dp.party.appliance.Stereo;
import com.example.dp.party.appliance.TV;
import com.example.dp.party.command.*;

public class RemoteLoader {
    public static void main(String[] args) {
    	RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();

		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);

		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOnCommands = {lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOffCommands = {lightOff, stereoOff, tvOff, hottubOff};

		MacroCommand partyOnMacroCommand = new MacroCommand(partyOnCommands);
		MacroCommand partyOffMacroCommand = new MacroCommand(partyOffCommands);

		remoteControlWithUndo.setCommand(0, partyOnMacroCommand, partyOffMacroCommand);
		System.out.println(remoteControlWithUndo);
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
	}

}
