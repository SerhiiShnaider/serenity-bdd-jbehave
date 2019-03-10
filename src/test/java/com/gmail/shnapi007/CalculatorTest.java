package com.gmail.shnapi007;

import com.gmal.shnapi007.Calculator;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class CalculatorTest {

  Calculator calculator;
  int sum;


  @Given("Claculator")
  public void create() {
    calculator = new Calculator();
  }

  @When("Add <num1> and <num2>")
  public void add(@Named("num1") int a, @Named("num2") int b) {
    sum = calculator.add(a, b);
  }

  @When("Subtract <num1> and <num2>")
  public void subtract(@Named("num1") int a, @Named("num2") int b) {
    sum = calculator.subtract(a, b);
  }

  @When("Multiply <num1> and <num2>")
  public void multiply(int num1, int num2) {
    sum = calculator.multiply(num1, num2);
  }

  @When("Divide <num1> and <num2>")
  public void divide(int num1, int num2) {
    sum = calculator.divide(num1, num2);
  }

  @Then("Rezult is <rez>")
  public void validate(int rez) {
    Assert.assertEquals(sum, rez);
  }

}
