package com.java.project;

public abstract class SmallWidget extends AbstractWidget {
	public SmallWidget(SurfaceColor color) {
		super(color);
	}
	
	public String getGears() {
		return "2 Gears";
	}
	
	public String getLevers() {
		return "1 Lever";
	}
	
	public String getSprings() {
		return "3 Springs";
	}

}