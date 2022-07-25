package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
	
	//--- Field ---
	private String name;
	private int money;
	private Product prod;
	
	
	//--- Constructor ---
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void sell(Product prod) {
		
	}
	
	
	//--- Method ---
	public void buy(Product prod) {
		
		if(money < prod.getPrice()) {
			
			System.out.println("[ERROR] 잔고가 부족합니다");
			return;
			
		} else {
			
			//전달인자로 받은 Product를	멤버필드에 저장하고
			this.prod = prod;
			
			//물건가격만큼 money를 차감한다.
			money -= prod.getPrice();
			
			System.out.println(name + "님이 " 
					+ money + "원을 지불하고 "
					+ prod.getModel() + " 구매함");
			System.out.println("[잔액] " + money + "원");
		}
		
	}

	
	
	
	
	//--- Getters, Setters ---
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
