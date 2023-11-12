package n3Exe6.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.from;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import n1Exe3.OutOfBound;

public class OutOfBoundAssertion {
	
	OutOfBound outOfBoundTest;
	
	@BeforeEach
	public void setTestUp() {
		outOfBoundTest = new OutOfBound();
	}
	
	@DisplayName("Given a random index that is out of bound, check exception is thrown randomly")
	@RepeatedTest(10)
	public void printRandomObjectExceptionTest () {
		assertThat(outOfBoundTest).returns("obj1", from(OutOfBound::returnRandomObject));
	}
	
	/*
	 * Provoca una ArrayIndexOutOfBoundsException en una clase cualquiera. 
	 * Crea una aserción que valide que la excepción es arrojada cuando corresponde.
	 */
	
	

}
