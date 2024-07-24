package fr.diginamic.builder;

import java.util.List;

public class Marque {
	private TypeMarque nameMarque;
	private List<Produit> produits;
	public Marque(TypeMarque nameMarque, List<Produit> produits) {
		super();
		this.nameMarque = nameMarque;
		this.produits = produits;
	}
	public TypeMarque getNameMarque() {
		return nameMarque;
	}
	public void setNameMarque(TypeMarque nameMarque) {
		this.nameMarque = nameMarque;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	

}
