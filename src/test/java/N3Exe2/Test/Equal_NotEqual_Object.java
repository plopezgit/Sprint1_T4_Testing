package N3Exe2.Test;

import static org.assertj.core.api.Assertions.*;

public class Equal_NotEqual_Object{
	
	Person pet;
	Person pet2;
	
	class Person {
		
		String name;

		public Person(String name) {
			this.name = name;
		}
			
		}
	
	public void setTestUp () {
		pet = new Person("Pier");
		pet2 = new Person("Pier");
	}
	
	public void equalNotEqualInteger () {
	assertThat(pet).isEqualTo(pet2);
	assertThat(pet).isNotEqualTo(pet2);
	
	}

}
