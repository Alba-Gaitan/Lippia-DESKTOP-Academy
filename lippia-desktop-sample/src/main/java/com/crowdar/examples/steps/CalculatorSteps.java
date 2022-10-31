package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }
    @Then("Result is Fifteen")
    public void result() {
    	CalculatorService.result();
    }

    @When("Seven multiply Eight")
    public void sevenMultiplyEight() {
        CalculatorService.multiply();
    }

    @Then("Result is Fifty six")
    public void resultIsFiftySix() {
        CalculatorService.resultMultiply();
    }

    @When("Seven divide Eight")
    public void twentyEightDivideFour() {
        CalculatorService.divide();
    }

    @Then("Result is zero eighty seven")
    public void resultIsZeroEightyFour() {
        CalculatorService.resultdivide();
    }

    @When("Seven Rest Eight")
    public void sevenRestEight() {
        CalculatorService.rest();
    }

    @Then("Result is minus one")
    public void resultIsMinusOne() {
        CalculatorService.resultRest();
    }
}