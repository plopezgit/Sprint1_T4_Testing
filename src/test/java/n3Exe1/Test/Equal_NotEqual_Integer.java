package n3Exe1.Test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Equal_NotEqual_Integer {
	
	Integer num1;
	Integer num2;
	
	@BeforeEach
	public void setTestUp () {
		num1 = 1;
		num2 = 2;
	}
	
	@DisplayName("Given two array, check if equal")
	@Test
	public void equalNotEqualInteger () {
	assertThat(num1).isEqualTo(num2);
	
	}
	
	@DisplayName("Given two array, check if not equal")
	@Test
	public void notEqualInteger () {
	assertThat(num1).isNotEqualTo(num2);
	
	}

}
