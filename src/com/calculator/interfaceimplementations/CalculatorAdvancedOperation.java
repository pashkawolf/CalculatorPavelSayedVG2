package com.calculator.interfaceimplementations;

import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;

public class CalculatorAdvancedOperation implements CalculatorAdvancedOperationsInterface{
	public double cos(double firstValue)
	{
		return Math.cos(firstValue);
	}
	public double sin(double firstValue)
	{
		return Math.sin(firstValue);
	}
	public double sqrt(double firstValue)
	{
		return Math.sqrt(firstValue);
	}
	public double tan(double firstValue)
	{
		return Math.tan(firstValue);
	}
	public double log(int firstValue) {
		return Math.log(firstValue);
	}

}
