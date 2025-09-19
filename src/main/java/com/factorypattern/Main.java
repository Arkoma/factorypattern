package com.factorypattern;

import com.factorypattern.orders.pizzas.ChicagoPizzaStore;
import com.factorypattern.orders.pizzas.NyPizzaStore;
import com.factorypattern.orders.pizzas.Pizza;
import com.factorypattern.orders.pizzas.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}