package N3Exe3.Test;

import static org.assertj.core.api.Assertions.*;

public class Equal_NotEqual_IntergerArray {
	
	Integer[] array1 = {1,2};
	Integer[] array2 = {1,2};
	
	public void equalNotEqualInteger () {
	assertThat(array1).isEqualTo(array2);
	
	}

}
