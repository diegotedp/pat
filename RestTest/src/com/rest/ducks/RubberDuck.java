package com.rest.ducks;

import com.rest.ducks.behavior.NoFlyBehavior;
import com.rest.ducks.behavior.SqueakBehavior;


public class RubberDuck extends Duck {
	
	public RubberDuck(){
		this.setFlyBehavior(new NoFlyBehavior());
		this.setCuackBehavior(new SqueakBehavior());
	}
}
