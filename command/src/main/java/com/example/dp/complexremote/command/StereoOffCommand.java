package com.example.dp.complexremote.command;

import com.example.dp.complexremote.appliance.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	@Override
	public void execute() {
		stereo.off();
	}
}
