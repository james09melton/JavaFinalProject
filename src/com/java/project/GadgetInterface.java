package com.java.project;

public interface GadgetInterface {
	public enum Color {UNPAINTED, PAINTED, BRONZE, SILVER, GOLD};
	public GadgetInterface getAbstractWidget();
	public GadgetInterface.Color getColor();
	public void paint(GadgetInterface.Color color);
	public float getPrice();
}
