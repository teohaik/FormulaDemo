package com.intrasoft.ssp.formulademo.api;

public class EJBCalculator3 implements Calculable {

	@Override
	public Object calculate(String... params) {
		System.out.println("Running EJb 3 calculation...");
		return 600;
	}

}
