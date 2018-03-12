package com.intrasoft.ssp.formulademo.api;

import java.util.HashMap;
import java.util.Map;

public class Formula extends FormulaComponent {

	private Map<String, FormulaComponent> componentMap;

	public Formula(){
		componentMap = new HashMap<>();
	}

	@Override
	public FormulaComponent getComponent(String id) {
		return componentMap.get(id);
	}

	@Override
	public void evaluate() {
		System.out.println("Evaluating formula components");
		for(FormulaComponent fc : componentMap.values()){
			fc.evaluate();
		}
	}

	public void addComponent(String id, FormulaComponent component){
		componentMap.put(id, component);
	}

	public void removeComponent(String id, FormulaComponent component){
		componentMap.remove(id);
	}

}
