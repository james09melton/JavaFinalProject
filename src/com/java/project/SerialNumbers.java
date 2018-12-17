package com.java.project;

public class SerialNumbers {
	private static SerialNumbers instance; 
	public enum productTypes{
		LargeGadget, MediumGadget, SmallGadget, LargeWidget, MediumWidget, SmallWidget;
	}
	
	private String productPrefix;
	
	public synchronized static SerialNumbers getInstanced() {
		if(instance == null) {
			instance = new SerialNumbers();
		}return instance;
	}
	
	private SerialNumbers() { }
	
	public synchronized String getNextSerial(productTypes types) {
	int count, next;
	switch(types) {
	case LargeGadget:
		count = 5342;
	productPrefix = "32LG";
	next = ++ count;
	return productPrefix + next;
	
	case MediumGadget:
		count = 1853;
	productPrefix = "23LG";
	next = ++ count;
	return productPrefix + next;
	
	case SmallGadget:
		count = 4689;
	productPrefix = "85LG";
	next = ++ count;
	return productPrefix + next;
	
	case LargeWidget:
		count = 3275;
	productPrefix = "96LG";
	next = ++ count;
	return productPrefix + next;
	
	case MediumWidget:
		count = 9618;
	productPrefix = "75LG";
	next = ++ count;
	return productPrefix + next;
	
	case SmallWidget:
		count = 8520;
	productPrefix = "12LG";
	next = ++ count;
	return productPrefix + next;
	default: return "no type defined";
		}
	}
}
