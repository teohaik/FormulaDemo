package com.intrasoft.ssp.formulademo.api;

import java.util.function.Consumer;

public class FormulaVariable extends FormulaComponent {

	private Long variableId;

	private String variableName;

	private Calculable calculable;

	Consumer<String[]> calculableMethod;

	private int methodParametersCount;

	public FormulaComponent getComponent(String id){
		return this;
	}

	@Override
	public void evaluate() {
		System.out.println("Evaluating variable: "+variableName);
		super.result = calculable.calculate();
	}

	public Long getVariableId() {
		return variableId;
	}

	public void setVariableId(Long variableId) {
		this.variableId = variableId;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public Calculable getCalculable() {
		return calculable;
	}

	public void setCalculable(Calculable calculable) {
		this.calculable = calculable;
	}

	public int getMethodParametersCount() {
		return methodParametersCount;
	}

	public void setMethodParametersCount(int methodParametersCount) {
		this.methodParametersCount = methodParametersCount;
	}

	public Consumer<String[]> getCalculableMethod() {
		return calculableMethod;
	}

	public void setCalculableMethod(Consumer<String[]> calculableMethod) {
		this.calculableMethod = calculableMethod;
	}
}
