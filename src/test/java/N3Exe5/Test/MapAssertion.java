package N3Exe5.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapAssertion {
	
	HashMap<Integer, String> flagMap;
	
	@BeforeEach
	public void setTestUp () {
		flagMap = new HashMap<Integer, String>();
		flagMap.put(1, "flagA");
		flagMap.put(2, "flagB");
	}
	
	@DisplayName("Given a HashMap, check if contains an specific key")
	@Test
	public void arrayListAssertionTest () {
	
		assertThat(flagMap).containsKey(1);
		
	}
	
	/*
	 * Crea un mapa y verifica que contiene una de las key que le añade.
	 */

}
