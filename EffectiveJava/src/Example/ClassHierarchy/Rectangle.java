package Example.ClassHierarchy;

class Rectangle extends FigureTrue {

	final double length;
	final double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		
		return length * width;
	}
}
