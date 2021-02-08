package Model.idemo;

public abstract class Vehicle {

	private int x;
	private int y;
	private String make;
	private double price;

	public Vehicle(int x, int y, String make, double price) {
		this.x = x;
		this.y = y;
		this.make = make;
		this.price = price;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getPrice() {
		return price;
	}

	public String getMake() {
		return make;
	}

	@Override
	public String toString(){
		return "Vehicle at (" + x + ", " + y + ")" +
				make + " $" + price;
	}

}