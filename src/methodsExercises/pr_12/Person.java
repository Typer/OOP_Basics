package methodsExercises.pr_12;

/**
 * Created by typer on 10/22/16.
 */
public class Person{
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return String.format("%s - age: %s, occupation: %s%n",this.name, this.age, this.occupation);
    }
}
