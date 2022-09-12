package Example.ClassHierarchy;

class Circle extends FigureTrue {

	final double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
	
		return Math.PI*(radius * radius);
	}

}
