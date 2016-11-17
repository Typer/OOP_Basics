package pr_04_Mordor_Cruelty_Plan.factories;

import pr_04_Mordor_Cruelty_Plan.models.Food;
import pr_04_Mordor_Cruelty_Plan.models.typeFood.*;

/**
 * Created by Typer on 11/13/2016.
 */
public class FoodFactory {
    public static Food getFood(String name) {
        String food = name.toLowerCase();
        switch (food) {
            case "apple":
                return new Apple(food);

            case "cram":
                return new Cram(food);

            case "honeycake":
                return new HoneyCake(food);

            case "lembas":
                return new Lembas(food);

            case "melon":
                return new Melon(food);

            case "mushrooms":
                return new Mushrooms(food);

            default:
                return new EverythingElse(food);
        }
    }
}
