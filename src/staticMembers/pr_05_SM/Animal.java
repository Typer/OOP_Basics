package staticMembers.pr_05_SM;

/**
 * Created by typer on 10/23/16.
 */
public class Animal {
    private String name;
    private String breed;
    private String heald;

    public Animal(String name, String breed, String heald) {
        this.name = name;
        this.breed = breed;
        this.heald = heald;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getHeald() {
        return heald;
    }
}
