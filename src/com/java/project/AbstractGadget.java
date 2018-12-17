package com.java.project;

public abstract class AbstractGadget implements GadgetInterface {
	
	protected GadgetInterface iGadget;
	protected Widget iWidget;
	private SurfaceColor color;
	
	public AbstractGadget(GadgetInterface gadget) {
		this(gadget, SurfaceColor.PLAIN);
		
	}
	
	public  AbstractGadget(GadgetInterface gadget, SurfaceColor color) {
		this.iGadget = gadget;
		this.color = color;
	}
	
	public GadgetInterface getGadget() {
		return iGadget;
	}
	
	public String toString() {
		return getClass().getSimpleName()+" ("+iGadget+", "+color+", price = "+getPrice()+")";
}
	
}