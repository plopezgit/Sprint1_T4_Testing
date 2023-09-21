package N3Exe2.Test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Equal_NotEqual_Object{
	
	Person pet;
	Person pet2;
	
	class Person {
		
		String name;

		public Person(String name) {
			this.name = name;
		}
			
		}
	
	@BeforeEach
	public void setTestUp () {
		pet = new Person("Pier");
		pet2 = new Person("Pier");
	}
	
	@DisplayName("Given two identical objectes, check if equal")
	@Test
	public void equalObject () {
	assertThat(pet).isEqualTo(pet2);
	
	}
	
	@DisplayName("Given two objectes, check if not equal")
	@Test
	public void NotEqualObject () {
	assertThat(pet).isNotEqualTo(pet2);
	
	}

}
