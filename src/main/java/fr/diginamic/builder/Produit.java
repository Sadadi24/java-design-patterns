package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Ingredient;

public class Produit {
	private String nom;
	private String grade;
	private TypeCategorie categorie;
	private Marque marque;
	private List<Ingredient> ingredient= new ArrayList<Ingredient>();
	private List<Allergene> allergene =  new ArrayList<Allergene>();
	private List<Additif> additif =  new ArrayList<Additif>();
	
	




	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public TypeCategorie getCategorie() {
		return categorie;
	}



	public void setCategorie(TypeCategorie categorie) {
		this.categorie = categorie;
	}



	public Marque getMarque() {
		return marque;
	}



	public void setMarque(Marque marque) {
		this.marque = marque;
	}



	public List<Ingredient> getIngredient() {
		return ingredient;
	}



	public void setIngredient(List<Ingredient> b) {
		this.ingredient = b;
	}



	public List<Allergene> getAllergene() {
		return allergene;
	}



	public void setAllergene(List<Allergene> allergene) {
		this.allergene = allergene;
	}



	public List<Additif> getAdditif() {
		return additif;
	}



	public void setAdditif(List<Additif> additif) {
		this.additif = additif;
	}

}
