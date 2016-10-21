package methodsExercises.pr_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/13/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.valueOf(reader.readLine());
        Family family = new Family();


        for (int i = 0; i < line; i++) {
            String[] input  = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            family.addMember(person);
        }

        System.out.printf("%s %d",family.getOldestMember().getName(),family.getOldestMember().getAge());

    }
}
