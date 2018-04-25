package com.example.dp.complexremotewithundo.appliance;

/**
 * 吊扇
 */
public class CeilingFan {
	// 吊扇所在的位置
	private String location = "";
	// 吊扇的风速级别
	private int level = 0; // 默认情况，level为0
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
	    // 最高转速
		level = HIGH;
		System.out.println(location + " ceiling fan is on high");
 
	} 

	public void medium() {
	    // 中等转速
		level = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
		// 最低转速
		level = LOW;
		System.out.println(location + " ceiling fan is on low");
	}
 
	public void off() {
		// 关闭风扇
		level = 0;
		System.out.println(location + " ceiling fan is off");
	}
 
	public int getSpeed() {
		return level;
	}
}
