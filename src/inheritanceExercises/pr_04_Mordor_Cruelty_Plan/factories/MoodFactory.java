package pr_04_Mordor_Cruelty_Plan.factories;

import pr_04_Mordor_Cruelty_Plan.models.Mood;
import pr_04_Mordor_Cruelty_Plan.models.typeMood.Angry;
import pr_04_Mordor_Cruelty_Plan.models.typeMood.Happy;
import pr_04_Mordor_Cruelty_Plan.models.typeMood.JavaScript;
import pr_04_Mordor_Cruelty_Plan.models.typeMood.Sad;

/**
 * Created by Typer on 11/13/2016.
 */
public class MoodFactory {
    public static Mood getMood(int happinessPoint){
        if (happinessPoint < -5){
            return new Angry();
        }else if (happinessPoint >= -5 && happinessPoint < 0){
            return new Sad();
        }else if (happinessPoint >= 0 && happinessPoint <= 15) {
            return new Happy();
        } else{
            return new JavaScript();
        }
    }
}
