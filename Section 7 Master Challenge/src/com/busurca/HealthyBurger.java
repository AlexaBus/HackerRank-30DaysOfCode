package com.busurca;

import java.math.BigDecimal;

public class HealthyBurger extends Burger {

    private Ingredient ingredient5;
    private Ingredient ingredient6;


    public HealthyBurger() {
        super("Healthy", new BigDecimal("3"), "brown rye bread", "well done");
    }

    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3, Ingredient ingredient4, Ingredient ingredient5) {
        super.addIngredient(ingredient1, ingredient2, ingredient3, ingredient4);
        this.ingredient5 = ingredient5;
        super.setTotalPrice(this.getPrice().add(ingredient1.getPrice().add(ingredient2.getPrice().add(ingredient3.getPrice().add(ingredient4.getPrice().add(ingredient5.getPrice()))))));
        super.setNoOfIngredients(5);
    }

    public void addIngredient(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3, Ingredient ingredient4, Ingredient ingredient5, Ingredient ingredient6) {
        super.addIngredient(ingredient1, ingredient2, ingredient3, ingredient4);
        this.ingredient5 = ingredient5;
        this.ingredient6 = ingredient6;
        super.setTotalPrice(this.getPrice().add(ingredient1.getPrice().add(ingredient2.getPrice().add(ingredient3.getPrice().add(ingredient4.getPrice().add(ingredient5.getPrice().add(ingredient6.getPrice())))))));
        super.setNoOfIngredients(6);
    }

    @Override
    public String orderDetails() {
        if (this.getNoOfIngredients() == 5) {
            return this.getName() + " burger with a " + this.getRollType() + " bun and " + this.getMeat() + " meat for " + this.getPrice() +
                    "\nwith " + this.getNoOfIngredients() + " ingredients: " +
                    "\n     " + this.getIngredient1().getName() + " for " + this.getIngredient1().getPrice() + " and " +
                    "\n     " + this.getIngredient2().getName() + " for " + this.getIngredient2().getPrice() + " and " +
                    "\n     " + this.getIngredient3().getName() + " for " + this.getIngredient3().getPrice() + " and " +
                    "\n     " + this.getIngredient4().getName() + " for " + this.getIngredient4().getPrice() + " and " +
                    "\n     " + ingredient5.getName() + " for " + ingredient5.getPrice() +
                    "\nfor a total of " + super.getTotalPrice();
        } else {
            return this.getName() + " burger with a " + this.getRollType() + " bun and " + this.getMeat() + " meat for " + this.getPrice() +
                    "\nwith " + this.getNoOfIngredients() + " ingredients: " +
                    "\n     " + this.getIngredient1().getName() + " for " + this.getIngredient1().getPrice() + " and " +
                    "\n     " + this.getIngredient2().getName() + " for " + this.getIngredient2().getPrice() + " and " +
                    "\n     " + this.getIngredient3().getName() + " for " + this.getIngredient3().getPrice() + " and " +
                    "\n     " + this.getIngredient4().getName() + " for " + this.getIngredient4().getPrice() + " and " +
                    "\n     " + this.ingredient5.getName() + " for " + this.ingredient5.getPrice() + " and " +
                    "\n     " + this.ingredient6.getName() + " for " + this.ingredient6.getPrice() +
                    "\nfor a total of " + super.getTotalPrice();
        }
    }
}
