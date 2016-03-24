package nl.youngcapital.dierenoefening;

class Dier extends DierenWinkel{
	public String naam;
	public Dier(String n){setNaam(n);}
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
}