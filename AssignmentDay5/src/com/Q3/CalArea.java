package com.Q3;

public class CalArea {
	
	
	public void area(Circle circle) {
		
		int r = circle.radius;
//		System.out.println(r);
		
		double Area = 3.14*(r*r);
		
		System.out.println(Area);
		
		
	}
    public void area(Rectangle rectangle) {
    	
    	int l = rectangle.length;
    	int b = rectangle.breadth;
    	
    	int Area = l*b;
    	
    	System.out.println(Area);
    	
    	
    	
    }
    public void area(Square square) {
    	
    	int s = square.side;
    	
    	int Area = s*s;
    	
    	System.out.println(Area);
    	
    	
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalArea a = new CalArea();
		
		Circle c = new Circle();
		
		c.radius = 3;
		
		a.area(c);
		
		Rectangle r = new Rectangle();
		
		r.length = 3;
		
		r.breadth = 4;
		
		a.area(r);
		
		Square s = new Square();
		
		s.side = 4;
		
		a.area(s);
		

	}

}
