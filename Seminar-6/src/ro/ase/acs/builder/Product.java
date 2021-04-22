package ro.ase.acs.builder;

import java.util.Date;

public class Product {
	private String name;
	private float price;
	private int quanity;
	private Date expireDate;
	private float discount;
	private boolean isVegetarianFriendly;
	private boolean isVeganFriendly;

	 Product(String name, float price, int quanity, Date expireDate, float discount, boolean isVegetarianFriendly,
			boolean isVeganFriendly) {

		this.name = name;
		this.price = price;
		this.quanity = quanity;
		this.expireDate = expireDate;
		this.discount = discount;
		this.isVegetarianFriendly = isVegetarianFriendly;
		this.isVeganFriendly = isVeganFriendly;
	}

	Product(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getQuanity() {
		return quanity;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public float getDiscount() {
		return discount;
	}

	public boolean isVegetarianFriendly() {
		return isVegetarianFriendly;
	}

	public boolean isVeganFriendly() {
		return isVeganFriendly;
	}

	public static class ProductBuilder {
		private Product product;

		public ProductBuilder() {
			product = new Product(null, 0);

		}

		public ProductBuilder addName(String name) {
			product.name = name;
			return this;
		}

		public ProductBuilder addPrice(float price) {
			product.price = price;
			return this;
		}
		
		public ProductBuilder addDate(Date date) {
			product.expireDate=date;
			return this;
		}
		
		public ProductBuilder addIsVegetarianFriendly(boolean isVegetarian) {
			product.isVeganFriendly=isVegetarian;
			return this;
		}
		
		public ProductBuilder addIsVeganFriendly(boolean isVegan) {
			product.isVeganFriendly=isVegan;
			return this;
		}
		public Product build() {
			return product;
		}
	}

}
