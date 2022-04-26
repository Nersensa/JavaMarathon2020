package day10;

import day11.Warehouse;

public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
        if (warehouse.getCountOrder() == 1500) {
            bonus();
            System.out.println("Picker got bonus");
        }
    }

    @Override
    public void bonus() {
        salary *= 3;
    }

    public int getSalary() {
        return salary;
    }

}
