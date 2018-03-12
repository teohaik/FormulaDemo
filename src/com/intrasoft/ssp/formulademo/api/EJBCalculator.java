package com.intrasoft.ssp.formulademo.api;

public class EJBCalculator implements Calculable {

	@Override
	public Object calculate(String... params) {
		System.out.println("Running EJb 1 calculation...");
		return 150;
	}

}
