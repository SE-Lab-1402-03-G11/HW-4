package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    private int value1;
    private int value2;
    private int result;

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I radical the division of two values$")
    public void iRadicalTheDivisionOfTwoValues() {
        Calculator calculator = new Calculator();
        result = calculator.newOperation(value1, value2);
        System.out.println(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
