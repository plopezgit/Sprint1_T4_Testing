package n1Exe3.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import n1Exe3.OutOfBound;

public class OutOfBound_Test {
	
	OutOfBound outOfBoundTest;
	
	@BeforeEach
	public void setTestUp() {
		outOfBoundTest = new OutOfBound();
	}
	
	
	@DisplayName("Given a random index that is out of bound, exception is thrown randomly")
	@RepeatedTest(10)
	public void printRandomObjectException () {
		assertThrows(ArrayIndexOutOfBoundsException.class, () ->
		outOfBoundTest.printRandomObject());	
		
	}

	
	
	

}
