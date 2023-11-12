package n2Exe1.Test;

import org.hamcrest.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

public class StringLength_Test{

	public static Matcher<String> lenghtMethodMatcher(Matcher<? super Integer> matcher) {
		return new FeatureMatcher<String, Integer>(matcher, "a String of length that", 
				"length") {
			
			@Override
			protected Integer featureValueOf(String word) {
				return word.length();
			}
			
		};
	}
	
	@DisplayName("Given a word 'mordor', check its length")
	@Test
	public void stringLengthSizeTest() {
		MatcherAssert.assertThat("mordor", lenghtMethodMatcher(is(10))); 
	}
	    
			/*
			 * Checking Failure Trace: java.lang.AssertionError:  
			 * Expected: a String of length that is <67> 
			 * but: length was <6>
			 */
		
}
