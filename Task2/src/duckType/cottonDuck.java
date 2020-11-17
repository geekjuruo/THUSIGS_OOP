package duckType;

import duckFeature.*;

import duckSystem.duck;

public class cottonDuck extends duck{
	public cottonDuck() {
		flyFeature = new noFly();
		voiceFeature = new noVoice();
		outwardFeature = new whiteOnlyOutward();
	}
	
	public void show() {
		voiceFeature.voiceAction();
		flyFeature.flyAction();
		outwardFeature.outwardAction();
	}
}
