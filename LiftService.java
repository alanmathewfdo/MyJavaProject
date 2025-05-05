package com.liftprogram;

public interface LiftService {
	void moveTo(Lift lift, boolean action);
	void moveTo(Lift lift);
	void liftTurnOn(Lift lift);
	void liftTurnOff(Lift lift);
}
