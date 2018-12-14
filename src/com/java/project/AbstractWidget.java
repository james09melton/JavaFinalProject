package com.java.project;

public abstract class AbstractWidget implements Widget{
	private int size;
	private boolean isWide;
	
	public AbstractWidget(int size, boolean isWide) {
		this.size = size;
		this.isWide = isWide;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isWide() {
		return isWide;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+" ("+size+")";
	}
}
