package com.factorypattern.orders.pizzas;

public class Pizza {
    Pizza orderPizza(String type) {
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "greek" -> new GreekPizza();
            default -> new Pizza();
        };

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
