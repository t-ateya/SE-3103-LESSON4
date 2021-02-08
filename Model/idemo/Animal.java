package Model.idemo;

public abstract class Animal implements ISound {
	private int x;
	private int y;
	private String name;
	private int age;

	public Animal(int x, int y, String name, int age) {
		this.x = x;
		this.y = y;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Animal at (" + x + ", " + y + ") name = " + name + ", age = " + age;

	}
}
