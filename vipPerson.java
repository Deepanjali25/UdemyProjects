package Udemy;

public class vipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;
    public vipPerson() {
        this("Default name", 50000.00, "default@email.com");
    }
    public vipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public vipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }
}
