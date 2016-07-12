package prob5;

public abstract class Shape {
	int countSides;

	public Shape(int i) {
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}

	abstract double getArea();

	abstract double getPerimeter();
}