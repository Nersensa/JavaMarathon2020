package day11;

import org.w3c.dom.ls.LSOutput;

public class Warehouse {
    private int countOrder;
    private double balance;

    public String toString() {
        return "Warehouse{" +
                "countOrder = " + countOrder +
                ", balance = " + balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
