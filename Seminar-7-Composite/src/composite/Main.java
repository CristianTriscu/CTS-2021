package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Angajat a1=new Angajat();
		a1.setNume("Vasile");
		a1.setSalariu(4000);
		
		Angajat a2=new Angajat();
		a2.setNume("George");
		a2.setSalariu(3000);
		
		Manager m1=new Manager();
		m1.setNume("Ion");
		m1.setSalariu(10002);
		m1.adaugaMembru(a1);
	
		Manager m2=new Manager();
		m2.setNume("Cristian");
		m2.setSalariu(10001);
		
		m2.adaugaMembru(a2);
		m1.adaugaMembru(m2);
		
		m1.afisareDetalii();
	}

}
