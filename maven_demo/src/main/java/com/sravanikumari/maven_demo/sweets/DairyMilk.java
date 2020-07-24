package com.sravanikumari.maven_demo.sweets;

public class DairyMilk extends Sweet{

	public DairyMilk() {
		// TODO Auto-generated constructor stub
		setSweetness(0);
		setWeight(0);
	}
	public DairyMilk(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}
