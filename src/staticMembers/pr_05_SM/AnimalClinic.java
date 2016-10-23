package staticMembers.pr_05_SM;

/**
 * Created by typer on 10/23/16.
 */
public class AnimalClinic {
    public static int patientId;
    public static int healedAnimalsCount;
    public static int rehabilitedAnimalsCount;

    static {
        patientId = 0;
        healedAnimalsCount = 0;
        rehabilitedAnimalsCount = 0;
    }

    public static void healedAnimal(){
        healedAnimalsCount ++;
        patientId++;

    }

    public static void rehabilitedAnimal(){
        rehabilitedAnimalsCount ++;
        patientId++;

    }
}
