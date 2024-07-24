package fr.diginamic.builder;

import java.util.List;

public class Categorie {
	private TypeCategorie categorieName;
	private List<Produit> produist;
	public Categorie(TypeCategorie categorieName, List<Produit> produist) {
		super();
		this.categorieName = categorieName;
		this.produist = produist;
	}
	public TypeCategorie getCategorieName() {
		return categorieName;
	}
	public void setCategorieName(TypeCategorie categorieName) {
		this.categorieName = categorieName;
	}
	public List<Produit> getProduist() {
		return produist;
	}
	public void setProduist(List<Produit> produist) {
		this.produist = produist;
	}
	
	
	

	
	

}
