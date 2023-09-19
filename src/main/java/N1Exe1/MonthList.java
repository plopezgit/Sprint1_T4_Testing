package N1Exe1;

import java.util.ArrayList;

public class MonthList {
	
	private ArrayList<String> monthList;

	public  MonthList() {
		monthList = new  ArrayList<String>();
	}

	public ArrayList<String> addMonths () {
		monthList.add("Jan");
		monthList.add("Feb");
		monthList.add("Mar");
		monthList.add("Apr");
		monthList.add("May");
		monthList.add("Jun");
		monthList.add("Jul");
		monthList.add("Aug");
		monthList.add("Sep");
		monthList.add("Oct");
		monthList.add("Nov");
		monthList.add("Dic");
		return monthList;
	}

}

/*
 * Crea una clase Java OK
 * que inserte en una lista ordenada los nombres de los meses del año. OK
 * Verifica con jUnit que la lista tiene 12 posiciones, 
 * que no es nula y que en su posición 8 contiene el nombre 'agosto'.
 */ 
