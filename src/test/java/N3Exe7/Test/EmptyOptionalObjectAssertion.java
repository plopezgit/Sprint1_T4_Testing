package N3Exe7.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmptyOptionalObjectAssertion{
	
	Integer int1;
	Optional<Integer> opt1;
	
	@BeforeEach
	public void setTestUp () {
		int1 = null;
		opt1 = Optional.ofNullable(int1);
	}
	
	@DisplayName("Given an empty Optional object, check if is empty")
	@Test
	public void emptyOptionalObjectAssertionTest () {
	assertThat(opt1).isEmpty();
	
	}
	
	/*
	 * Crea un objeto Optional vacío. 
	 * Escribe la aserción correcta para verificar que efectivamente está vacío.
	 */

}
