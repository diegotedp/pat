package com.rest.ducks.behavior;

import com.rest.ducks.interfaces.IFlyBehavior;

public class NoFlyBehavior implements IFlyBehavior {

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Esta ave no vuela";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.volar();
	}
}
