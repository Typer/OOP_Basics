package methodsExercises.pr_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/14/16.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int starNum = Integer.valueOf(reader.readLine());
        int endNum = Integer.valueOf(reader.readLine());

        Fibonacci fibonacci = new Fibonacci(starNum,endNum);

        System.out.println(fibonacci.getFibonacciSequence().toString());
    }
}
