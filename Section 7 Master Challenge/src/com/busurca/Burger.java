package com.busurca;

import java.math.BigDecimal;

public class Burger {

    private String name;
    private BigDecimal price;
    private String rollType;
    private String meat;
    private int noOfIngredients;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;
    private Ingredient ingredient4;
    private BigDecimal totalPrice;


    public Burger(String meat) {
        this.name = "Classic";
        this.price = new BigDecimal("2.5");
        this.rollType = "Basic";
        this.meat = meat;
    }

    public Burger(String name, BigDecimal price, String rollType, String meat) {
        this.name = name;
        this.price = price;
        this.rollType = rollType;
        this.meat = meat;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredient1 = ingredient;
        this.totalPrice = this.price.add(ingredient.getPrice());
        this.noOfIngredients = 1;
    }

    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.totalPrice = this.price.add(ingredient1.getPrice()).add(ingredient2.getPrice());
        this.noOfIngredients = 2;
    }

    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.totalPrice = this.price.add(ingredient1.getPrice()).add(ingredient2.getPrice()).add(ingredient3.getPrice());
        this.noOfIngredients = 3;
    }

    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3, Ingredient ingredient4) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.ingredient4 = ingredient4;
        this.totalPrice = this.price.add(ingredient1.getPrice()).add(ingredient2.getPrice()).add(ingredient3.getPrice()).add(ingredient4.getPrice());
        this.noOfIngredients = 4;
    }

    public String orderDetails() {
        if (noOfIngredients == 0) {
            return this.name + " burger with a " + this.rollType + " bun and " + this.meat + " meat for " + this.price +
                    "\nwith no extras for a total of " + this.totalPrice;
        } else if (noOfIngredients == 1) {
            return this.name + " burger with a " + this.rollType + " bun and " + this.meat + " meat for " + this.price +
                    "\nwith " + this.noOfIngredients + " ingredients: " +
                    "\n     " + this.ingredient1.getName() + " for " + this.ingredient1.getPrice() +
                    "\nfor a total of " + this.totalPrice;
        } else if (noOfIngredients == 2) {
            return this.name + " burger with a " + this.rollType + " bun and " + this.meat + " meat for " + this.price +
                    "\nwith " + this.noOfIngredients + " ingredients: " +
                    "\n     " + this.ingredient1.getName() + " for " + this.ingredient1.getPrice() + " and " +
                    "\n     " + this.ingredient2.getName() + " for " + this.ingredient2.getPrice() +
                    "\nfor a total of " + this.totalPrice;
        } else if (noOfIngredients == 3) {
            return this.name + " burger with a " + this.rollType + " bun and " + this.meat + " meat for " + this.price +
                    "\nwith " + this.noOfIngredients + " ingredients: " +
                    "\n     " + this.ingredient1.getName() + " for " + this.ingredient1.getPrice() + " and " +
                    "\n     " + this.ingredient2.getName() + " for " + this.ingredient2.getPrice() + " and " +
                    "\n     " + this.ingredient3.getName() + " for " + this.ingredient3.getPrice() +
                    "\nfor a total of " + this.totalPrice;
        } else {
            return this.name + " burger with a " + this.rollType + " bun and " + this.meat + " meat for " + this.price +
                    "\nwith " + this.noOfIngredients + " ingredients: " +
                    "\n     " + this.ingredient1.getName() + " for " + this.ingredient1.getPrice() + " and " +
                    "\n     " + this.ingredient2.getName() + " for " + this.ingredient2.getPrice() + " and " +
                    "\n     " + this.ingredient3.getName() + " for " + this.ingredient3.getPrice() + " and " +
                    "\n     " + this.ingredient4.getName() + " for " + this.ingredient4.getPrice() +
                    "\nfor a total of " + this.totalPrice;
        }
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getNoOfIngredients() {
        return noOfIngredients;
    }

    public Ingredient getIngredient1() {
        return ingredient1;
    }

    public Ingredient getIngredient2() {
        return ingredient2;
    }

    public Ingredient getIngredient3() {
        return ingredient3;
    }

    public Ingredient getIngredient4() {
        return ingredient4;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setNoOfIngredients(int noOfIngredients) {
        this.noOfIngredients = noOfIngredients;
    }



    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
