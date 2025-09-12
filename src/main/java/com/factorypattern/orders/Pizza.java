package com.factorypattern.orders;

public class Pizza {
    Pizza orderPizza() {
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    private void prepare() {
        System.out.println("preparing pizza");
    }

    private void bake() {
        System.out.println("Baking pizza!");
    }

    private void cut() {
        System.out.println("Cutting Pizza");
    }

    private void box() {
        System.out.println("Boxing Pizza");
    }

}
