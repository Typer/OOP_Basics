package pr_04_Mordor_Cruelty_Plan.models;

import pr_04_Mordor_Cruelty_Plan.factories.FoodFactory;
import pr_04_Mordor_Cruelty_Plan.factories.MoodFactory;

import java.util.ArrayList;

/**
 * Created by Typer on 11/13/2016.
 */
public class Gandalf {

    private final int DEFAULT_HAPPINESS_POINT = 0;
    private int happinessPoint;
    private ArrayList<Food> foods;
    private Mood mood;

    public Gandalf() {
        this.happinessPoint = DEFAULT_HAPPINESS_POINT;
        this.foods = new ArrayList<>();
        this.setMood();
    }

    public int getHappinessPoint(){
        return this.happinessPoint;
    }

    private void setPointOhHappiness(){
        for (Food food : foods) {
            this.happinessPoint += food.getPointOfHappiness();
        }
    }

    public void setMood(){
        this.mood = MoodFactory.getMood(this.happinessPoint);
    }

    public void setFood(String... foods){
        for (String food : foods) {
            this.foods.add(FoodFactory.getFood(food));
        }

        if (foods.length >= 1){
            setPointOhHappiness();
        }
    }

    @Override
    public String toString() {
      return String.format("%d%n%s",this.happinessPoint, this.mood);
    }
}
