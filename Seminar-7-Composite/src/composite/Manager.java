package composite;

import java.util.HashMap;
import java.util.Map;

public class Manager extends MembruOrganizatie {

	private float salariu;
	private String nume;

	private Map<String, MembruOrganizatie> subordonati = new HashMap<>();

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public float getSalariu() {
		// TODO Auto-generated method stub
		return salariu;
	}

	public void setSalariu(float salariu) {
		this.salariu = salariu;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaMembru(MembruOrganizatie membru) {
		subordonati.put(membru.getNume(), membru);

	}

	@Override
	public void stergeMembru(MembruOrganizatie membru) {
		subordonati.remove(membru.getNume());

	}

	@Override
	public MembruOrganizatie cautaMembru(String numeMebru) {
		return subordonati.get(numeMebru);

	}

	@Override
	public String afisareDetalii() {
		StringBuilder deAfisat = new StringBuilder();
		deAfisat.append(("Nume:" + this.nume));
		deAfisat.append("  ");
		for (Map.Entry<String, MembruOrganizatie> it : subordonati.entrySet()) {
			it.getValue().afisareDetalii();
		}
		return deAfisat.toString();
	}

}
