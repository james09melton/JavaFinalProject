package com.java.project;

public class SerialNumbers {
	private static SerialNumbers instance; 
	public enum productTypes{
		LargeGadget, MediumGadget, SmallGadget, LargeWidge, MediumWidget, SmallWidget;
	}
	
	private String productPrefix;
	
	public synchronized static SerialNumbers getInstanced() {
		if(instance == null) {
			instance = new SerialNumbers();
		}return instance;
	}
	
	private SerialNumbers() { }
	
	public synchronized String getNextSerial(productTypes types) {
	int count;
	switch(types) {
	case LargeGadget:
		count = 5342;
	productPrefix = "32LG";
	int next = ++ count;
	return productPrefix + next;
	}
	
	public synchronized String getNextSerial2(productTypes types) {
	int count;
	switch(types) {
	case MediumGadget:
		count = 1853;
	productPrefix = "23LG";
	int next = ++ count;
	return productPrefix + next;
	}
	
	public synchronized String getNextSerial3(productTypes types) {
	int count;
	switch(types) {
	case SmallGadget:
		count = 4689;
	productPrefix = "85LG";
	int next = ++ count;
	return productPrefix + next;
	}
}
