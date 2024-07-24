package fr.diginamic.factory;

public class ElementFactory {
	public static Element getElement(ElementType type ,String nom, double valeur,Unite unit) {
		switch(type ) {
		case INGREDIENT :
			return new Ingredient(nom,valeur ,unit);
		case ALLERGENE:
			return new Allergene(nom,valeur ,unit);
		case ADDITIF:
			return new Additif(nom,valeur ,unit);
			default: return null;
		
		}
	
		
		
	}

}
