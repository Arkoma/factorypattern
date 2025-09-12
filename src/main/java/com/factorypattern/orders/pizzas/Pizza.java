package com.factorypattern.orders.pizzas;

public class Pizza {
    Pizza orderPizza(String type) {
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> new Pizza();
        };

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public void prepare() {
        System.out.println("preparing pizza");
    }

    public void bake() {
        System.out.println("Baking pizza!");
    }

    public void cut() {
        System.out.println("Cutting Pizza");
    }

    public void box() {
        System.out.println("Boxing Pizza");
    }

}
