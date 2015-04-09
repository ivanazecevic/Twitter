package com.twitter;
import java.util.LinkedList;

import com.twitter.poruke.TwitterPoruka;
/**
 * Klasa Twitter predstavlja drustvenu mrezu na kojoj se 
 * pretrazivanje vrsi po tagu ili poruci.
 * @author Ivana Zecevic
 *
 */
	public class Twitter {
		/**
		 * Atribut koji pretstavlja listu ovjekata klase TwitterPoruka.
		 */
	private LinkedList<TwitterPoruka> poruke =
	new LinkedList<TwitterPoruka>();
	/**
	 * Metoda koja vraca sve poruke iz liste.
	 * @return Twitter poruke 
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){
	return poruke;
	}
	/**
	 * Metoda za unosenje objekta klase TwitterPoruka u listu
	 * @param korisnik ime korisnika 
	 * @param poruka poruka koja se unosi u listu
	 */
	public void unesi(String korisnik, String poruka) {
	
	TwitterPoruka tp = new TwitterPoruka();
	tp.setKorisnik(korisnik);
	tp.setPoruka(poruka);
	poruke.addLast(tp);
	}
	/**
	 * Metoda koja pretrazuje poruke po tagu 
	 * @param maxBroj maksimalan broj poruka koji vracamo
	 * @param tag tag poruke po kojem pretrazujemo
	 * @return niz objekata klase TwitterPoruka
	 * @throws java.lang.RuntimeException ako je tag
	 * null ili prazan String
	 */
	
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
	 if (tag==null || tag.isEmpty())
	throw new RuntimeException("Morate uneti tag");
	
	if (maxBroj<=0)
	maxBroj = 100;
	 
	int brojac = 0;
	
	TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
	
	for (int i = 0; i < poruke.size(); i++)
	if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
	if (brojac < maxBroj){
	rezultat[brojac+1]=poruke.get(i);
	brojac++;
	}
	else break;
	return rezultat;
	}
	} 



