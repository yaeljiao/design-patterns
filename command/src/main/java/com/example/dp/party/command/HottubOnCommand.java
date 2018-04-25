package com.example.dp.party.command;

import com.example.dp.party.appliance.Hottub;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	@Override
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}
	@Override
	public void undo() {
		hottub.off();
	}
}
