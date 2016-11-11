package com.calculator.interfaceimplementations;

import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;

/**
 * Implementing of CalculatorAdvancedOperationsInterface class
 * 
 */

public class CalculatorAdvancedOperation implements CalculatorAdvancedOperationsInterface{
	
	/**
	   *Method cos. Used to count cos
	    **/
	public double cos(double firstValue)
	{
		return Math.cos(firstValue);
	}

	/**
	   *Method sin. Used to count sin
	    **/
	public double sin(double firstValue)
	{
		return Math.sin(firstValue);
	}

	/**
	   *Method sqrt. Used to count sqrt of number
	    **/
	public double sqrt(double firstValue)
	{
		return Math.sqrt(firstValue);
	}

	/**
	   *Method tan. Used to count tangens
	    **/
	public double tan(double firstValue)
	{
		return Math.tan(firstValue);
	}

	/**
	   *Method log. Used to count logaritm
	    **/
	public double log(double firstValue) {
		return Math.log(firstValue);
	}

}
