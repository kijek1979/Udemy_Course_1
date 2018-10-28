package section_6_oop_part_1.bank_first_challange;

public class CustomerAccountOperation {

    private long operationID;
    private Customer customer;
    private Bank bank;

    public void depositToAccount(long operationID, Customer customer, double quote){

        customer.setAccountBalance(quote);

    }



}
