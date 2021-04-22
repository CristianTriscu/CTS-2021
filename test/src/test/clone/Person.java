package test.clone;

public class Person implements Cloneable{
	private int age;
	private String name;
	private float height;
	private Pet pet;
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getHeight() {
		return height;
	}



	public void setHeight(float height) {
		this.height = height;
	}



	public Pet getPet() {
		return pet;
	}



	public void setPet(Pet pet) {
		this.pet = pet;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person clone = (Person)super.clone();
		clone.setPet(new Pet());
		pet.setName(this.pet.getName());
		
		return clone;
	}

	//
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}

}
