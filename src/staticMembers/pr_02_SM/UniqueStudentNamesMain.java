package staticMembers.pr_02_SM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UniqueStudentNamesMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String input = reader.readLine();
            if (input.equals("End")){
                break;
            }

            Student student = new Student(input);
        }

        System.out.println(StudentGroup.students.size());
    }
}
