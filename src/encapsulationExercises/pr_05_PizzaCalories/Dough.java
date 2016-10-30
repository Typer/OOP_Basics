package encapsulationExercises.pr_05_PizzaCalories;

/**
 * Created by typer on 10/30/16.
 */
public class Dough {
    private String flourType;
    private String bakeType;
    private int weight;

    //(2 * grams) * flourType * bakingTechnique = calories per dough weighting grams

    public Dough(String flourType, String bakingTechnique, int weight) {
        this.setFlourType(flourType);
        this.setBakeType(bakingTechnique);
        this.setWeight(weight);
    }

    public double getCalories() {
        return (2 * this.weight) * this.getModification(this.flourType) * this.getModification(this.bakeType);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equalsIgnoreCase("white") && !flourType.equalsIgnoreCase("wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakeType(String bakeType) {
        if (!bakeType.equalsIgnoreCase("crispy") &&
                !bakeType.equalsIgnoreCase("chewy") &&
                !bakeType.equalsIgnoreCase("homemade")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakeType = bakeType;
    }

    private  void setWeight(int weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private Double getModification(String type){
        switch (type.toLowerCase()){
            case "white":
                return 1.5;
            case "wholegrain":
                return 1.0;

            case "crispy":
                return 0.9;

            case "chewy":
                return 1.1;

            case "homemade":
                return 1.0;

            default:
                return 1.0;
        }
    }
}
