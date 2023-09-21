package N3Exe6.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import N1Exe3.OutOfBound;

public class OutOfBoundAssertion {
	
	OutOfBound outOfBoundTest;
	
	@BeforeEach
	public void setTestUp() {
		outOfBoundTest = new OutOfBound();
		outOfBoundTest.printRandomObject();
	}
	
	@DisplayName("Given a random index that is out of bound, exception is thrown randomly")
	@RepeatedTest(10)
	public void printRandomObjectExceptionTest () {
		assertThat(outOfBoundTest).extracting("printRandomObject");
		
	}

	
	/*
	 * Provoca una ArrayIndexOutOfBoundsException en una clase cualquiera. 
	 * Crea una aserción que valide que la excepción es arrojada cuando corresponde.
	 */
	
	

}
