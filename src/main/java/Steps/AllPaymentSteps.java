package Steps;

import dtu.ws.fastmoney.BankServiceException_Exception;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.acme.Controllers.GeneralController;
import org.acme.Models.Customer;
import org.acme.Services.CallBankAuthService;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllPaymentSteps {


    CallBankAuthService callBankAuthService = new CallBankAuthService();
    GeneralController generalController= new GeneralController();
    public static String accountID;
    @Given("a customer with a bank account with balance {int}")
    public void a_customer_with_a_bank_account_with_balance(Integer int1) throws BankServiceException_Exception {
        accountID=callBankAuthService.CreateOneAccount(new Customer("Amaya","Joshi","cprAmaya",1000.0,"customer"));
        assertTrue(true, "The bank account is created for the customer");

    }
    @And("that the customer is registered with DTU Pay")
    public void that_the_customer_is_registered_with_dtu_pay() throws BankServiceException_Exception {
        generalController.regDtuPayUser(new Customer("Amaya","Joshi","cprAmaya","16887","customer"));
        assertTrue(true, "The customer is registered");
    }
    @Given("a merchant with a bank account with balance {int}")
    public void a_merchant_with_a_bank_account_with_balance(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("that the merchant is registered with DTU Pay")
    public void that_the_merchant_is_registered_with_dtu_pay() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the merchant initiates a payment for {int} kr by the customer")
    public void the_merchant_initiates_a_payment_for_kr_by_the_customer(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the payment is successful")
    public void the_payment_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the balance of the customer at the bank is {int} kr")
    public void the_balance_of_the_customer_at_the_bank_is_kr(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the balance of the merchant at the bank is {int} kr")
    public void the_balance_of_the_merchant_at_the_bank_is_kr(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
