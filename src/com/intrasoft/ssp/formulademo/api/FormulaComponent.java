package com.intrasoft.ssp.formulademo.api;

public abstract class FormulaComponent {

	protected ValueType valueType;

	protected Object result;

	public FormulaComponent(){}

	public void addComponent(String id, FormulaComponent component){}

	public void removeComponent(String id, FormulaComponent component){}

	public abstract FormulaComponent getComponent(String id);

	public abstract void evaluate();

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
