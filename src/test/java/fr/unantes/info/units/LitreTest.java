package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class LitreTest {

	@Test
	public void testToGallon() {
		Litre litre = new Litre(4.546);
		Gallon gallon = new Gallon(1);
		assertEquals(litre.toGallon(), gallon);
	}

	@Test
	public void testToLitre(){
		Litre litre = new Litre(1);
		Litre litre1 = new Litre(1);
		assertEquals(litre.toLitre(),litre1);
	}

	@Test
	public void testToLitreNotEqual(){
		Litre litre = new Litre(1);
		Litre litre2 = new Litre(2);
		assertNotEquals(litre.toLitre(),litre2);
	}

	@Test
	public void testNotEqual() {
		Litre litre = new Litre(15);

		litre.equals("15");
		litre.equals(null);
		litre.equals(litre);
		litre.equals(new Litre(10));
	}

}
