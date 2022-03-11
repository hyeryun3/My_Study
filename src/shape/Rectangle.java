package shape;

public class Rectangle extends Shape implements Resize{

	public Rectangle() { }

	public Rectangle(int width, int height, String colors) {
		super.setWidth(width);
		super.setHeight(height);
		super.setColors(colors);
	}
	
	public double getArea() {
		return super.getArea();
	}
	
	@Override
	public void setResize(int size) {
		super.setWidth(getWidth()+size);
	}
}
