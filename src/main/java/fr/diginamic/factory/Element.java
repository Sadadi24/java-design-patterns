package fr.diginamic.factory;

public abstract class Element {
	private String nom;
	private double valeur;
	private Unite unite;
	
	
	public Element(String nom, double valeur, Unite unite) {
		this.nom = nom;
		this.valeur = valeur;
		this.unite = unite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	public Unite getUnite() {
		return unite;
	}
	public void setUnite(Unite unite) {
		this.unite = unite;
	}
	

}
