package ro.ase.acs.builder;

public class Director {
	private ProductBuilderV2 productBuilder = new ProductBuilderV2();
	
	public Director() {
		
	}
	public Product createVeganChocolate(float price) {
		return productBuilder.addName("Chocolate")
		.addPrice(price)
		.addIsVeganFriendly(true)
		.build();
		
	}
	
	// ...
}
