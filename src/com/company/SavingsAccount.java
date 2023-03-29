package com.company;

public class SavingsAccount implements BankProgramV5 {
    private double rate = 0.01;
    private int acctnum;
    private int balance = 0;
    private boolean isforeign = false;

    public int getAccNumber() {
        return 0;
    }


    public int getBalance() {
        return 0;
    }


    public boolean isForeign() {
        return false;
    }


    public void setForeign(boolean isForeign) {

    }
    public void addInterest() {
        balance += (int) (balance * rate);
    }

    public void deposit(int amt) {

    }


    public boolean hasEnoughColleteral(int amt) {
        return balance >= loanamt / 2;
    }

    public String to_String() {
        return "Savings account " + acctnum
                + ": balance=" + balance
                + ", is " + (isforeign ? "foreign" : "domestic")
    }
}
