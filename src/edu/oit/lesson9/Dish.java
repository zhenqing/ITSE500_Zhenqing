package edu.oit.lesson9;

public enum Dish {
    GONGBAOJIDING(Meat.PORK);
    private Meat meat;
    private Vegetable[] vegetable;
    private Dish(Meat meat){
        this.meat = meat;
    }
}
