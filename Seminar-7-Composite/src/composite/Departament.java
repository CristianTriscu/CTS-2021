package composite;

import java.util.ArrayList;
import java.util.List;

public class Departament extends MembruOrganizatie{

	private List<MembruOrganizatie> listaMembri= new ArrayList<MembruOrganizatie>();
	private String numeDepartament;
	
	@Override
	public float getSalariu() {
		float salariuTotal=0;
		for(MembruOrganizatie a:listaMembri) {
			salariuTotal+=a.getSalariu();
		}
		return salariuTotal;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return numeDepartament;
	}
	


	public void setNumeDepartament(String numeDepartament) {
		this.numeDepartament = numeDepartament;
	}

	@Override
	public void adaugaMembru(MembruOrganizatie membru) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stergeMembru(MembruOrganizatie membru) {
		listaMembri.remove(membru);
		
	}

	@Override
	public MembruOrganizatie cautaMembru(String numeMebru) {
		for(MembruOrganizatie m:listaMembri) {
			if(m.getNume().equals(numeMebru)) {
				return m;
			}
		}
		return null;
	}

	@Override
	public String afisareDetalii() {
		StringBuilder deAfisat=new StringBuilder();
		deAfisat.append("Departamnet: "+ this.numeDepartament+"\n");
		deAfisat.append("\n");
		for(MembruOrganizatie m:listaMembri) {
			deAfisat.append(m.getNume());
		}
		return deAfisat.toString();
	}

}
