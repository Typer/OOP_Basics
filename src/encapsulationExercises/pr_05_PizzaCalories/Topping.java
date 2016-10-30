package encapsulationExercises.pr_05_PizzaCalories;

/**
 * Created by typer on 10/30/16.
 */
public class Topping {
    private String toppingType; //meat, veggies, cheese or a sauce
    private int weight;

    public Topping(String toppingType, int weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setWeight(int weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(
                    String.format("%s weight should be in the range [1..50].",this.toppingType)
            );
        }
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equalsIgnoreCase("meat")
                && !toppingType.equalsIgnoreCase("veggies")
                && !toppingType.equalsIgnoreCase("cheese")
                && !toppingType.equalsIgnoreCase("sauce")) {
            throw new IllegalArgumentException(
                    String.format("Cannot place %s on top of your pizza.",toppingType)
            );
        }
        this.toppingType = toppingType;
    }

    public double getToppingCalories() {
        return (2 * this.weight) * getModification(this.toppingType);
    }

    private double getModification(String type) {
        switch (type.toLowerCase()) {
            case "meat":
                return 1.2;

            case "veggies":
                return 0.8;

            case "cheese":
                return 1.1;

            case "sauce":
                return 0.9;

        }
        return 1;
    }
}
