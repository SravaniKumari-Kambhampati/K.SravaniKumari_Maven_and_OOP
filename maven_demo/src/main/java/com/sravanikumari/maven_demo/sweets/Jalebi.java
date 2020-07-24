package com.sravanikumari.maven_demo.sweets;

public class Jalebi extends Sweet{

	public Jalebi() {
		// TODO Auto-generated constructor stub
		setSweetness(0);
		setWeight(0);
	}
	public Jalebi(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}
