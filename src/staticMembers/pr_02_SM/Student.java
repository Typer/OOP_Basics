package staticMembers.pr_02_SM;

/**
 * Created by typer on 10/22/16.
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;

        StudentGroup.students.add(this.name);
    }
}
