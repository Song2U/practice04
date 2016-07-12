package prob5;

public class RectTriangle extends Shape implements Resizable {
	double width;
	double height;

	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	double getArea() {
		return ((width * height) * 2);
	}

	@Override
	double getPerimeter() {
		return Math.sqrt(width * width * height * height);
	}

	@Override
	public void resize(double d) {
		width = width * d;
		height = height * d;
	}
}
