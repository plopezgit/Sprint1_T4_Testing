package N3Exe1.Test;

import static org.assertj.core.api.Assertions.*;

public class Equal_NotEqual_Integer {
	
	Integer num1;
	Integer num2;
	
	public void setTestUp () {
		num1 = 1;
		num2 = 2;
	}
	
	public void equalNotEqualInteger () {
	assertThat(num1).isEqualTo(num2);
	assertThat(num1).isNotEqualTo(num2);
	
	}

}
