package duckType;

import duckFeature.*;

import duckSystem.duck;

public class rubberDuck extends duck{
	public rubberDuck() {
		flyFeature = new noFly();
		voiceFeature = new frictionVoice();
		outwardFeature = new whiteBlackOutward();
	}
	
	public void show() {
		voiceFeature.voiceAction();
		flyFeature.flyAction();
		outwardFeature.outwardAction();
	}
}
