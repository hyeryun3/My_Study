package shape;

public class Triangle extends Shape implements Resize{

	public Triangle() {	}
	
	public Triangle(int width, int height, String colors) {
		super.setWidth(width);
		super.setHeight(height);
		super.setColors(colors);
	}

	public double getArea() {
		return (double)(super.getArea()/2);
	}
	
	@Override
	public void setResize(int size) {
		super.setHeight(getHeight()+size);
	}
	
}
