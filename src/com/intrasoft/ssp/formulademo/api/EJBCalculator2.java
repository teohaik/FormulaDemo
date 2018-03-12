package com.intrasoft.ssp.formulademo.api;

public class EJBCalculator2 implements Calculable {

	@Override
	public Object calculate(String... params) {
		System.out.println("Running EJb 2 calculation...");
		return 300;
	}

}
