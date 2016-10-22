package methodsExercises.pr_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by typer on 10/22/16.
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