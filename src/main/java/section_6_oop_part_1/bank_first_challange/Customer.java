package section_6_oop_part_1.bank_first_challange;

public class Customer {

    private Integer customerID;
    private String firstName;
    private String lastName;
    private long accountID;
    private double accountBalance;

    public Customer(Integer id, String firstName, String lastName, long accountID, double accountBalance) {
        this.customerID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.accountBalance = accountBalance;
    }




    public Integer getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAccountID() {
        return accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public void setAccountBalance(double accountBalance) {

        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountID=" + accountID +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
