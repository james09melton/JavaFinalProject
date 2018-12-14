package com.java.project;

public abstract class AbstractGadget implements GadgetInterface{
	private GadgetInterface gadget;
	private GadgetInterface.Color color;
	
	public AbstractGadget(GadgetInterface gadget) {
		this(gadget, GadgetInterface.Color.UNPAINTED);
	}
	
	public AbstractGadget(GadgetInterface gadget, GadgetInterface.Color color) {
		this.gadget = gadget;
		this.color = color;
	}

	public GadgetInterface getGadget() {
		return gadget;
	}

	public GadgetInterface.Color getColor(){
		return color;
	}
	
	public void paint(GadgetInterface.Color color) {
		this.color = color;
	}

	public float getPrice() {
		return 900.00f;
	}
	
	public String toString() {
		return getClass().getSimpleName()+" ("+gadget+", "+color+", price = "+getPrice()+")";
	}
}

