package staticMembers.pr_01_SM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/22/16.
 */
public class StudentsMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String input = reader.readLine();
            if (input.equals("End")){
                System.out.println(Student.track);
                break;
            }

            Student student = new Student(input);
        }
    }
}
