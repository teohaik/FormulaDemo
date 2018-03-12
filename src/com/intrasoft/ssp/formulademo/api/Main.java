package com.intrasoft.ssp.formulademo.api;

public class Main {


	public static void main(String...args){

		FormulaVariable fc1 = new FormulaVariable();
		FormulaVariable fc2 = new FormulaVariable();
		FormulaVariable fc3 = new FormulaVariable();

		FormulaComponent formula1 = new Formula();

		Calculable ejbCalculator = new EJBCalculator();
		Calculable ejbCalculator2 = new EJBCalculator2();
		Calculable ejbCalculator3 = new EJBCalculator3();

		fc1.setCalculable(ejbCalculator);
		fc1.setCalculableMethod(ejbCalculator::calculate);
		fc1.setVariableId(101l);
		fc1.setVariableName("workingDays");
		fc1.setMethodParametersCount(0);

		fc2.setCalculable(ejbCalculator2);
		fc2.setCalculableMethod(ejbCalculator2::calculate);
		fc2.setVariableId(102l);
		fc2.setVariableName("flightHours");
		fc2.setMethodParametersCount(2);

		fc3.setCalculable(ejbCalculator3);
		fc3.setCalculableMethod(ejbCalculator3::calculate);
		fc3.setVariableId(103l);
		fc3.setVariableName("danceHours");
		fc3.setMethodParametersCount(1);

		formula1.addComponent("v1",fc1);
		formula1.addComponent("v2",fc2);
		formula1.addComponent("v3",fc3);

		formula1.evaluate();

		System.out.println("Variable values: ");

		System.out.println(fc1.result);
		System.out.println(fc2.result);
		System.out.println(fc3.result);

		System.out.println("Formula values: ");

		System.out.println(formula1.result);
	}
}
