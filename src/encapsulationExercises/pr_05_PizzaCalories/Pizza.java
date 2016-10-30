package encapsulationExercises.pr_05_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by typer on 10/30/16.
 */
public class Pizza {
    private String name;
    private List<Topping> topping;
    private Dough dough;
    private int toppingCount;

    public Pizza(String name, int toppingCount) {
        this.setName(name);
        this.setToppingCount(toppingCount);
        this.topping = new ArrayList<>();
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Topping topping){
        this.topping.add(topping);
    }


    public double getTotalCalories(){
        double totalCalories = this.dough.getCalories();
        for (Topping topping1 : topping) {
            totalCalories += topping1.getToppingCalories();
        }

        return totalCalories;
    }

    public void setToppingCount(int toppingCount) {
        if (toppingCount > 10 || toppingCount < 0){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppingCount = toppingCount;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f Calories.",this.name, getTotalCalories());
    }

    private void setName(String name){
        if (name == null || name.trim().length() == 0 || name.trim().length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }
}
