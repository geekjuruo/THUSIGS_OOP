package duckSystem;

import duckFeature.*;

public abstract class duck {
	public fly flyFeature;
	public voice voiceFeature;
	public outward outwardFeature; 
    
	public void fly() {
    	flyFeature.flyAction();
    }
    public void voice() {
    	voiceFeature.voiceAction();
	}
    public void outward() {
    	outwardFeature.outwardAction();
	}
    
    public abstract void show();
    
}
