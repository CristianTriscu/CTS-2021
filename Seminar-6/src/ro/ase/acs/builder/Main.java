package ro.ase.acs.builder;

public class Main {

	public static void main(String[] args) {

//		Product product = new Product("test", 20, 500, null, 0, true, false);
//		Product product2 = new Product("Chocolate", 7);
//		product2.setExpireDate(new Date());
//		// ...
//		product2.setQuanity(10);
		
		Product product =new Product.ProductBuilder()
				.addName("Milk")
				.addPrice(5)
				.addIsVeganFriendly(true)
				.build();
		
		ProductBuilderV2 pB=new ProductBuilderV2();
		pB.addName("Chocolate");
		pB.addPrice(200);
		Product product2=pB.build();
		
		Director director=new Director();
		Product product5=director.createVeganChocolate(10);
		
	}

}
