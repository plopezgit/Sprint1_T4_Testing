package n1Exe3;

import java.util.Random;

public class OutOfBound {
	
	Random random;
	
	public OutOfBound() {
		random = new Random();
	}

	public void printRandomObject () throws ArrayIndexOutOfBoundsException {
		String[] arrayObj = { "obj1", "obj2", "obj3" };
		System.out.println(arrayObj[random.nextInt(arrayObj.length + arrayObj.length)]);	
	}
	
	public String returnRandomObject () throws ArrayIndexOutOfBoundsException {
		String[] arrayObj = { "obj1" };
		return arrayObj[random.nextInt(arrayObj.length + arrayObj.length)];
	}

}
