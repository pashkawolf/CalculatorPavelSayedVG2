package com.calculator.interfaceimplementations;

import com.calculator.interfaces.CalculatorBasicOperationInterface;

/**
 * Implementing of CalculatorBasicOperationInterface class
 * 
 */

public class CalculatorBasicOperation implements CalculatorBasicOperationInterface{
	/**
	   *Method add. Used to implement metod add by adding first to second Value
	    **/
	@Override
	public double add(double firstValue, double secondValue) {
		return firstValue + secondValue;
	}
	/**
	   *Method sub. Used to implement metod sub by substracting first and second Value
	    **/
	@Override
	public double sub(double firstValue, double secondValue) {
		return firstValue - secondValue;
	}
	/**
	   *Method mul. Used to implement metod mul by multiplate first by second Value
	    **/
	@Override
	public double mul(double firstValue, double secondValue) {
		return firstValue * secondValue;
	}
	/**
	   *Method div. Used to implement metod add by deviding first on second Value
	    **/
	@Override
	public double div(double firstValue, double secondValue) {
		return firstValue / secondValue;
	}
	

}
