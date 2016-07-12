package prob5;

public class RectTangle extends Shape implements Resizable {
	double width;
	double height;

	public RectTangle(double width, double height) {
		super(4);
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
		return (width * height);
	}

	@Override
	double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double d) {
		width = width * d;
		height = height * d;
	}
}
