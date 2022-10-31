package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    
    public static void result() {
    	Assert.assertEquals(getResult(),"15");
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }

    public static void multiply() {
        ActionManager.click(CalculatorConstants.SEVEN);
        ActionManager.click(CalculatorConstants.MULTIPLY);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void resultMultiply() {
        Assert.assertEquals(getResult(),"56");
    }

    public static void divide() {
        ActionManager.click(CalculatorConstants.SEVEN);
        ActionManager.click(CalculatorConstants.DIVIDE);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void resultdivide() {
        Assert.assertEquals(getResult(),"0875");
    }

    public static void rest() {
        ActionManager.click(CalculatorConstants.SEVEN);
        ActionManager.click(CalculatorConstants.REST);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void resultRest() {
        Assert.assertEquals(getResult(),"1");
    }
}
