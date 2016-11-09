package com.calculator.interfaceimplementations;

import com.calculator.interfaces.CalculatorBasicOperationInterface;

public class CalculatorBasicOperation implements CalculatorBasicOperationInterface{

	@Override
	public double add(double firstValue, double secondValue) {
		return firstValue + secondValue;
	}

	@Override
	public double sub(double firstValue, double secondValue) {
		return firstValue - secondValue;
	}

	@Override
	public double mul(double firstValue, double secondValue) {
		return firstValue * secondValue;
	}

	@Override
	public double div(double firstValue, double secondValue) {
		return firstValue / secondValue;
	}
	

}
