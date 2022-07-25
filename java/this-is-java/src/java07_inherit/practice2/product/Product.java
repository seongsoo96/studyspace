package java07_inherit.practice2.product;

public abstract class Product {
	
	//--- Field ---
	protected String model;
	protected int price;
	
	
	//--- Constructor ---
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	
	//--- Method ---
	//추상 메소드
	public abstract void out();
	
//	public void out() {
//	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
