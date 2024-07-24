
import org.junit.Test;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Element;
import fr.diginamic.factory.ElementFactory;
import fr.diginamic.factory.ElementType;
import fr.diginamic.factory.Ingredient;
import fr.diginamic.factory.Unite;

import static org.junit.Assert.*;
public class FactoryTest {
   @Test
   public void testCreateIngredient() {
       Element element = ElementFactory.getElement(ElementType.INGREDIENT, "Sucre", 10.5,Unite.MICRO_GRAMMES);
       assertNotNull(element);
       assertTrue(element instanceof Ingredient);
       assertEquals("Sucre", element.getNom());
       assertEquals(10.5, element.getValeur(), 0.01);
   }
   @Test
   public void testCreateAllergene() {
       Element element = ElementFactory.getElement(ElementType.ALLERGENE, "Gluten", 5.2,Unite.MILLI_GRAMMES);
       assertNotNull(element);
       assertTrue(element instanceof Allergene);
       assertEquals("Gluten", element.getNom());
       assertEquals(5.2, element.getValeur(), 0.01);
   }
   @Test
   public void testCreateAdditif() {
       Element element = ElementFactory.getElement(ElementType.ADDITIF, "E300", 0.1,Unite.MICRO_GRAMMES);
       assertNotNull(element);
       assertTrue(element instanceof Additif);
       assertEquals("E300", element.getNom());
       assertEquals(0.1, element.getValeur(), 0.01);
   }
   
}