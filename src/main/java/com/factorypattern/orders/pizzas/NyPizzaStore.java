package com.factorypattern.orders.pizzas;

public class NyPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
//            case "pepperoni" -> new NYStylePepperoniPizza();
//            case "clam" -> new NYStyleClamPizza();
//            case "veggie" -> new NYStyleVeggiePizza();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
