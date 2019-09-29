package com.busurca;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Ingredient lettuce = new Ingredient("lettuce",new BigDecimal("0.45"));
        Ingredient tomato = new Ingredient("tomato", new BigDecimal("0.6"));
        Ingredient carrot = new Ingredient("carrot", new BigDecimal("0.5"));
        Ingredient jalapeno = new Ingredient("jalapeno", new BigDecimal("0.85"));
        Ingredient cabbage = new Ingredient("cabbage", new BigDecimal("0.4"));
        Ingredient rucola = new Ingredient("rucola", new BigDecimal("0.55"));
        Ingredient garlic = new Ingredient("garlic", new BigDecimal("0.35"));



        Burger burger = new Burger( "medium rare");
        HealthyBurger healthyBurger = new HealthyBurger();
        DeluxeBurger deluxeBurger = new DeluxeBurger("classic", "well done");

        burger.addIngredient(tomato, jalapeno, lettuce);
        healthyBurger.addIngredient(tomato, carrot, cabbage, rucola, garlic,jalapeno);
        System.out.println(deluxeBurger.orderDetails());

        System.out.println(burger.orderDetails());
        System.out.println(healthyBurger.orderDetails());





    }
}
