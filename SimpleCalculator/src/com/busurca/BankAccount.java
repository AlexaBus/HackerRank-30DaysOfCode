package com.busurca;

public class BankAccount {

    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(999999999, 0, "NoName", "NoEmail", "NoPhoneNumber");
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, long balance, String customerName, String email, String phoneNumber) {
        System.out.println("Parametrized constructor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(999999999,0,customerName,email,phoneNumber);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(long amount) {
        this.balance += amount;
        System.out.println("Your account balance is now " + balance);
    }

    public void withdrawFunds(long amount) {

        if (balance - amount < 0) {
            System.out.println("Insufficient funds! Available balance is " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Your account balance is now " + this.balance);
        }
    }

}
