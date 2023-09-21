package N3Exe3.Test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Equal_NotEqual_IntergerArray {
	
	Integer[] array1 = {1,2};
	Integer[] array2 = {1,2};
	
	@DisplayName("Given two Array<Integer>, check equiality")
	@Test
	public void equalNotEqualIntegerArray () {
	assertThat(array1).isEqualTo(array2);
	
	}

}
