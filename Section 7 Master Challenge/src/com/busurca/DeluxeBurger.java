package com.busurca;

import java.math.BigDecimal;

public class DeluxeBurger extends Burger {

    private Ingredient chips;
    private Ingredient drink;

    public DeluxeBurger(String rollType, String meat){
        super("Deluxe", new BigDecimal ("5"), rollType, meat);
        this.chips = new Ingredient("chips", new BigDecimal("1"));
        this.drink = new Ingredient("drink", new BigDecimal("1.5"));
        super.addIngredient(chips, drink);
        this.setTotalPrice(this.getPrice().add(chips.getPrice().add(drink.getPrice())));
    }

    @Override
    public String orderDetails(){
        return this.getName() + " burger with a drink, chips, " + this.getRollType() + " bun and " + this.getMeat() +" meat" +
                "\nfor " + this.getTotalPrice();
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        System.out.println("Cannot add extras to this burger");
    }

    @Override
    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2) {
        System.out.println("Cannot add extras to this burger");
    }

    @Override
    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        System.out.println("Cannot add extras to this burger");
    }

    @Override
    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3, Ingredient ingredient4) {
        System.out.println("Cannot add extras to this burger");
    }
}
