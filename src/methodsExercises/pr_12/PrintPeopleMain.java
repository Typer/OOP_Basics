package methodsExercises.pr_12;

import com.sun.tools.javac.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by typer on 10/26/16.
 */
public class PrintPeopleMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> person = new ArrayList<>();


        while (true) {
            String[] inputData = reader.readLine().trim().split("\\s+");
            if (inputData[0].equals("END")) {
                break;
            }

            person.add(new Person(
                    inputData[0],
                    Integer.parseInt(inputData[1]),
                    inputData[2]
            ));
        }

        person.stream().sorted((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge())).forEach(System.out::print);
    }
}
