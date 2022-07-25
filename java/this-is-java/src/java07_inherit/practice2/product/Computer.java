package java07_inherit.practice2.product;

public class Computer extends Product {
	
	//--- Field ---
//	private String model;
//	private int price;
	
	
	//--- Constructor ---
	public Computer(String model, int price) {
		super(model, price);
	}
	
	
	//--- Mothod ---
	@Override
	public void out() {
		System.out.println("Computer (" + model + ", " + price + ")");
	}

	
	//--- Getters, Setters ---
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
