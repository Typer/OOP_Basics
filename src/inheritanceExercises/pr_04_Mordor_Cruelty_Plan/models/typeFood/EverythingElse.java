package pr_04_Mordor_Cruelty_Plan.models.typeFood;

import pr_04_Mordor_Cruelty_Plan.models.Food;

/**
 * Created by Typer on 11/13/2016.
 */
public class EverythingElse extends Food {
    private String name;
    private int pointOfHappiness;

    public EverythingElse(String name) {
        this.name = name;
        this.pointOfHappiness = -1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPointOfHappiness() {
        return this.pointOfHappiness;
    }
}
