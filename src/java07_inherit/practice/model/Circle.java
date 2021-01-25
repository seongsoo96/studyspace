package java07_inherit.practice.model;

public class Circle extends Point {
	
	//--- Field ---
	private int radius;
	
	
	//--- Constructor ---
	public Circle() {
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		
		this.radius = radius; //초기화
	}
	
	
	//--- Method ---
	@Override
	public void draw() {
		//중심점
		System.out.print("중심점 : ");
		super.draw(); //(x, y)
		
		//원의 면적
		System.out.print("원의 면적 : ");
		System.out.printf("%.1f\n", Math.PI * radius * radius);
		
		//원의 둘레
		System.out.print("원의 둘레 : ");
		System.out.printf("%.1f\n", 2 * Math.PI * radius);
	}
	
	
	
	
	//--- Getters, Setters ---
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
