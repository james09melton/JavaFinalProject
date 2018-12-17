package com.java.project;

public abstract class LargeWidget extends AbstractWidget{

	public LargeWidget(SurfaceColor color) {
		super(color);
	}
	public String getGears() {
		return "9 Gears";
	}
	public String getLevers() {
		return "2 Levers";
	}
	public String getSprings() {
		return "4 Springs";
	}
}
