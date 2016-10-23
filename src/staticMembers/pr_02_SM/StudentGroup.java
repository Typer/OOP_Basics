package staticMembers.pr_02_SM;

import java.util.HashSet;

public class StudentGroup {
    public static HashSet<String> students = new HashSet<>();

    public StudentGroup(HashSet<String> students) {
        this.students = students;
    }
}
