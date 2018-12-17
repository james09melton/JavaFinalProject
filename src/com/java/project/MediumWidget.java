
package com.java.project;

public abstract class MediumWidget extends AbstractWidget {
	public MediumWidget(SurfaceColor color) {
		super(color);
	}
	
	public String getGears() {
		return "4 Gears";
	}
	
	public String getLevers() {
		return "3 Levers";
	}
	
	public String getSprings() {
		return "5 Springs";
	}

}