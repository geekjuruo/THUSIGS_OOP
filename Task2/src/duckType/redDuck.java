package duckType;

import duckFeature.*;

import duckSystem.duck;

public class redDuck extends duck{
	public redDuck() {
		flyFeature = new swingsFly();
		voiceFeature = new gagaVoice();
		outwardFeature = new grayRedOutward();
	}
	
	public void show() {
		voiceFeature.voiceAction();
		flyFeature.flyAction();
		outwardFeature.outwardAction();
	}
}
