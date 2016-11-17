package pr_03_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Typer on 11/13/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] inputStudent = reader.readLine().trim().split("\\s+");
            String firstName = inputStudent[0];
            String lastName = inputStudent[1];
            String facNumber =inputStudent[2];

            Student student = new Student(firstName, lastName, facNumber);

            String[] inputWorker = reader.readLine().trim().split("\\s+");
            firstName = inputWorker[0];
            lastName = inputWorker[1];
            double weekSalary = Double.parseDouble(inputWorker[2]);
            double hoursPerDay = Double.parseDouble(inputWorker[3]);

            Worker worker = new Worker(firstName, lastName, weekSalary, hoursPerDay);
            System.out.println(student + "" + worker);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
