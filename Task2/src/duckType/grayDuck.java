package duckType;

import duckFeature.*;

import duckSystem.duck;

public class grayDuck extends duck{
	public grayDuck() {
		flyFeature = new swingsFly();
		voiceFeature = new gagaVoice();
		outwardFeature = new grayOnlyOutward();
	}
	
	public void show() {
		voiceFeature.voiceAction();
		flyFeature.flyAction();
		outwardFeature.outwardAction();
	}
}
