package staticMembers.pr_01_SM;

/**
 * Created by typer on 10/22/16.
 */
public class Student {
    private String name;
    public static int track;

    public Student(String name) {
        this.name = name;
        track ++;
    }
}
