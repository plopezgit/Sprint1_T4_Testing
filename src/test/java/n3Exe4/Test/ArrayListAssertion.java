package n3Exe4.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayListAssertion {
	
	List<Object> objList;
	Integer int1;
	String string1;
	
	@BeforeEach
	public void setTestUp () {
		objList = new ArrayList<Object>();
		objList.add(int1=1);
		objList.add(string1="A");
	}
	
	@DisplayName("Given an ArrayList of an Integer and String, check its strict order and its content")
	@Test
	public void arrayListAssertionTest () {
		assertThat(objList).containsSequence(int1, string1).contains(int1)
			.contains(string1).containsOnlyOnce(int1);	
	}
	
	@DisplayName("Given an ArrayList of an Integer and String, when an object is removed from the List, then check if removed")
	@Test
	public void arrayListAssertionAfterRemoveObjectTest () {
		
		objList.remove(1);
		
		assertThat(objList).containsOnly(int1);
		
	}
	
	/*
	 * Crea un arrayList contenedor de varios tipos de objetos (créalos también). 
	 * Escribe una aserción para verificar el orden de los objetos en ArrayList 
	 * según han sido insertados.
	 * Verifica ahora que la lista anterior contiene los objetos en cualquier orden.
	 * Verifica que en la lista anterior uno de los objetos se ha añadido sólo una vez. 
	 * Deja uno de los elementos sin añadir, 
	 * y verifica que la lista no contiene éste último.
	 */

}
