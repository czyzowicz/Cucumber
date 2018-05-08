import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    Calculator calc = new Calculator();
    int result;

    @Given("^I run calculator application$")
    public void iRunCalculatorApplication() throws Throwable {
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int arg0, int arg1) throws Throwable {
        result = calc.add(arg0,arg1);
    }

    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int arg0) throws Throwable {
        assertEquals(arg0,result);

    }
}