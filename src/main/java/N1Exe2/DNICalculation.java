package N1Exe2;

public class DNICalculation {
	
	String DNILetter;
	
	public DNICalculation() {
		DNILetter = "TRWAGMYFPDXBNJZSQVHLCKE";
	}

	public char getDNILetter (int DNINumber) {
		return DNILetter.charAt(DNINumber % 23);
	}

}

/*
 * Crea una clase llamada CalculoDni OK
 * que calcule la letra del DNI al recibir el número como parámetro.
 * Crea una clase jUnit que verifique su correcto funcionamiento, 
 * parametrizándola para que el test reciba un espectro de datos amplio 
 * y valide si el cálculo es correcto para 10 números de DNI predefinidos.
 */
