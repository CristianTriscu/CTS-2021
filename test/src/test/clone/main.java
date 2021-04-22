package test.clone;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet cat=new Pet();
		cat.setName("pisica");
		Person p1=new Person();
		p1.setName("Geroge");
		p1.setPet(cat);
		
		System.out.println(p1.getName()+" are "+p1.getPet().getName());
		
		try {
			Person p2=(Person) p1.clone();
			p2.setName("Mihai");
			Pet dog=new Pet();
			
			dog.setName("caine");
			p2.setPet(dog);
			System.out.println(p2.getName()+" are "+p2.getPet().getName());
			System.out.println(p1.getName()+" are "+p1.getPet().getName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
