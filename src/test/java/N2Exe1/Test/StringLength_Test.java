package N2Exe1.Test;

public class StringLength_Test {

}

/*
 * Define un Matcher personalizado para Hamcrest que proporcione el Matcher 
 * de longitud para un String.
 * Queremos utilizar la clase ->FeatureMatcher.
 * Con FeatureMatcher podemos ajustar un Matcher existente, 
 * decidir qué campo del Objeto prueba debe coincidir y proporcionar 
 * un mensaje de error agradable. El constructor de FeatureMatcher tiene 
 * los siguientes argumentos en este orden:
 * 		El matcher que queremos envolver.
 * 		Una descripción de la función que probamos.
 * 		Una descripción del posible mismatch (desajuste).
 * El único método que debemos sobreescribir es featureValueOf (T actual), 
 * que devuelve el valor que se pasará al método match()/matchesSafely(). 
 * Use su comparador personalizado en una prueba 
 * para comprobar si la cadena "Mordor" tiene una longitud de 8.
 * Ajusta la prueba si es necesario.
 */
