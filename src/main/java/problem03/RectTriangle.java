package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}
	
	

	@Override
	public double getArea() {
		
		
		double area = (width*height)/2;
		
		System.out.println(area);
		return 0.;
	}

	@Override
	public double getPerimeter() {
		
		double per = width*height;
		
		System.out.println(per);
		return 0.;
	}
	
	
	
	
	
	
	
	
	
}
