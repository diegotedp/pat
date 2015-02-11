package com.rest.ducks;

import com.rest.ducks.behavior.NoFlyBehavior;
import com.rest.ducks.behavior.SilenceBehavior;

public class DecoyDuck extends Duck {

	public DecoyDuck(){
		this.setFlyBehavior(new NoFlyBehavior());
		this.setCuackBehavior(new SilenceBehavior());
	}
}
