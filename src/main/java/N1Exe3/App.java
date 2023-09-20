package N1Exe3;

public class App {

	public static void main(String[] args) {
		OutOfBound outOfBound = new OutOfBound();
		
		try {
			outOfBound.printRandomObject();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Random is out of bounds");
		}
	}

}
