package methodsExercises.pr_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/13/16.
 */
public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        Person person = new Person(name);

        System.out.printf("%s says \"Hello\"!",person.getName());
    }
}
