package N1Exe1.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import N1Exe1.MonthList;

@TestMethodOrder(OrderAnnotation.class)
public class MonthList_Test {
	
	private MonthList monthListTest;
	private int expectedSizeValueToTest;
	private String expectedSpecificIndexValueToTest;
	
	@BeforeEach
	public void setTestUp () {
		monthListTest = new MonthList();
		expectedSizeValueToTest = 12;
		expectedSpecificIndexValueToTest = "Aug";
	}
	
	
	@DisplayName("Dado que una Lista de meses es rellenada, validar que la lista no esta vacia")
	@Test
	@Order(1)
	public void checkMonthListNotNull () {
		boolean monthListIsEmpty = monthListTest.addMonths().isEmpty();
		
		assertFalse(monthListIsEmpty);
	}
	
	@DisplayName("Dado que una Lista de meses es rellenada, validar que el size de la lista sea el esperado")
	@Test
	@Order(2)
	public void checkMonthListSize () {
		int monthListTestSize = monthListTest.addMonths().size();
		assertEquals(expectedSizeValueToTest, monthListTestSize);
	}
	
	@DisplayName("Dado que una Lista de meses es rellenada, validar el valor de un indice especifico")
	@Test
	@Order(3)
	public void checkMonthListAugust () {
		String monthListSpecificMonth = monthListTest.addMonths().get(7);
		assertEquals(expectedSpecificIndexValueToTest, monthListSpecificMonth);
	}

}
