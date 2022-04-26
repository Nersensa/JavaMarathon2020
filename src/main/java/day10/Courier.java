package day10;

import day11.Warehouse;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (warehouse.getBalance() == 1000000) {
            bonus();
            System.out.println("Courier got bonus");
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
    }

    public int getSalary() {
        return salary;
    }
}
