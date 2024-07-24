package fr.diginamic.builder;

import fr.diginamic.factory.Ingredient;

public class ProduitBuilder {
	
	private Produit produit;
	public ProduitBuilder() {
	this.produit = new Produit();
	}
	public ProduitBuilder appendNom(String nom) {
	produit.setNom(nom);
	return this;
	}
	public ProduitBuilder appendGrade(String grade) {
		produit.setGrade(grade);
		return this;
		}
	public ProduitBuilder appendMarque(Marque marque) {
		produit.setMarque(marque);
		return this;
		}
	public ProduitBuilder appendCategrie(TypeCategorie produitLaitiers) {
		produit.setCategorie(produitLaitiers);
		return this;
		}
	/*
	public ProduitBuilder appendIngredient1(Ingredient ingredient,) {
		produit.setIngredient(new )));
		return this;
		}*/
	public ProduitBuilder appendAllergene(String allergene) {
		produit.setNom(allergene);
		return this;
		}
	
	public Produit get() {
	return produit;
	}

}
