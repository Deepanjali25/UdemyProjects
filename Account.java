package Udemy;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    public Account() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("\nUdemy.Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("\nDeposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount <0) {
            System.out.println("\nOnly " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("\nWithdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerNmae() {
        return customerName;
    }
    public void setCustomerNmae(String customerNmae) {
        this.customerName = customerNmae;
    }
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
