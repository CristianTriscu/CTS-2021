package composite;

public class Angajat extends MembruOrganizatie {

	private String nume;
	private float salariu;

	
	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setSalariu(float salariu) {
		this.salariu = salariu;
	}

	@Override
	public float getSalariu() {
		return salariu;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return nume;
	}

	@Override
	public void adaugaMembru(MembruOrganizatie membru) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void stergeMembru(MembruOrganizatie membru) {
		throw new UnsupportedOperationException();

	}

	@Override
	public MembruOrganizatie cautaMembru(String numeMebru) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String afisareDetalii() {
		return this.nume;
		
	}

}
