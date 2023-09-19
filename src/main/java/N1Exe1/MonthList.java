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
