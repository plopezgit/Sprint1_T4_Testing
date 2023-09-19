package N1Exe2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import N1Exe1.MonthList;

public class DNICalculation_Test {
	
	@ParameterizedTest
	@ValueSource ( ints = {30359622, 30259622, 20458723, 30145387, 40656789, 24356743, 54378923, 30347893,
								36234567, 20247645})
	public void checkGetDNILetter () {		
		
	}

}
