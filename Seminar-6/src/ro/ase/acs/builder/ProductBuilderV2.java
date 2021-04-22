package ro.ase.acs.builder;

import java.util.Date;

public class ProductBuilderV2 {
	private String name;
	private float price;
	private int quanity;
	private Date expireDate;
	private float discount;
	private boolean isVegetarianFriendly;
	private boolean isVeganFriendly;
	
	public ProductBuilderV2() {
		
	}
	
	public ProductBuilderV2 addName(String name) {
		this.name = name;
		return this;
	}

	public ProductBuilderV2 addPrice(float price) {
		this.price = price;
		return this;
	}
	
	public ProductBuilderV2 addDate(Date date) {
		this.expireDate=date;
		return this;
	}
	
	public ProductBuilderV2 addIsVegetarianFriendly(boolean isVegetarian) {
		this.isVeganFriendly=isVegetarian;
		return this;
	}
	
	public ProductBuilderV2 addIsVeganFriendly(boolean isVegan) {
		this.isVeganFriendly=isVegan;
		return this;
	}
	
	public Product build() {
		Product product = new Product(name,price);
		return product;
	}
}
