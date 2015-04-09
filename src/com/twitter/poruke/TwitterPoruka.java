package com.twitter.poruke;

/**
 * Klasa koja predstavlja jednu twitter poruku.
 * @author Ivana Zecevic
 *
 */
public class TwitterPoruka {
	/**
	 * Ime korisnika.
	 */
	
	private String korisnik;
	/**
	 * Poruka korisnika.
	 */
	private String poruka;
	
	/**
	 * Metoda koja vraca ime korisnika.
	 * @return  ime korisnika tipa String
	 */
	
	public String getKorisnik() {
	return korisnik;
	}
	/**
	 * Metoda koja postavlja ime korisnika.
	 * @param korisnik postavljeno ime korisnika
	 * @throws java.lang.runtimeException ako je umeto ime 
	 * null vrednost ili prazan String
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik.equals(""))
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/**
	 *Metoda koja vraca poruku korisnika.
	 *@return poruka tipa String
	 */
	
	public String getPoruka() {
	return poruka;
	}
	/**
	 * Metoda koja postavlja poruku korisnika n unetu poruku.
	 * @param poruka korisnika
	 * @throws java.lang.RuntimeException ako je unta vrednost null vrednost 
	 * ili duzina poruke veca od 140
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || poruka.length()>140)
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	/**
	 * Metoda koja ispisuje vrednosti atributa poruka i korisnik.
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 
}
