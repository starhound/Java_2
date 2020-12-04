//Wesley Reid
//COP 2251 - Java 2
//SPC ID: 2385157
//Chapter 11 - Program 1

package wesley11;

import java.util.ArrayList;
import java.util.Arrays;

class CPU {
	private String makeModel;
	private double clock;
	private int cores;
	
	//typical constructor
	public CPU(String make, double clockSpeed, int coreCount) {
		this.makeModel = make;
		this.clock = clockSpeed;
		this.cores = coreCount;
	}

	public CPU(CPU proc) {
		this.makeModel = proc.makeModel;
		this.clock = proc.clock;
		this.cores = proc.cores;
	}

	//override
	public String toString() {
		String out = "";
		out += "CPU Make: " + this.makeModel + "\n";
		out += "CPU Clock Speed: " + this.clock + "\n";
		out += "CPU Cores: " + this.cores + "\n";
		return out;
	}
}

//first subclass - Computer(String, int, String, double)
class Computer extends CPU {
	protected String makeModel;
	private int memory;
	private String storage;
	private double price;
	
	//single constructor, CPU as super class
    public Computer(String model, CPU proc, int mem, String store, double incost) {
    	super(proc);
		this.makeModel = model;
		this.memory = mem;
		this.storage = store;
		this.price = incost;
	}
	
	public String toString() {
		String out = "";
		out += super.toString();
		out += "Make: " + this.makeModel + "\n";
		out += "Memory: " + this.memory + "\n";
		out += "Storage: " + this.storage + "\n";
		out += "Price: " + this.price + "\n";
		return out;
	}
}

//subclass - Desktop(String, String)
class Desktop extends Computer {
	private String monitor;
	private String keyboard;
	
	public Desktop(String mon, CPU proc, int mem, double cost, String model, String storage, String keys) {
		super(model, proc, mem, storage, cost);
		this.monitor = mon;
		this.keyboard = keys;
	}
	
	public String toString() {
		String out = "";
		out += super.toString();
		out += "Monitor: " + this.monitor + "\n";
		out += "Keyboard: " + this.keyboard + "\n";
		return out;
	}
}

//subclass - Laptop(String, double)
class Laptop extends Computer {
	private String screen;
	private double weight;
	
	public Laptop(String screenSize, CPU proc, int mem, double cost, String storage, String model, double itemWeight) {
		super(model, proc, mem, storage, cost);
		this.screen = screenSize;
		this.weight = itemWeight;
	}
	
	public String toString() {
		String out = "";
		out += super.toString();
		out += "Screen Size: " + this.screen + "\n";
		out += "Item Weight: " + this.weight + "\n";
		return out;
	}
}
