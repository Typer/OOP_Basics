package methodsExercises.pr_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/14/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(reader.readLine());

        Number number = new Number();

        System.out.println(number.nextPrimeNumber(num)+" ,"+number.isNumberPrime(num));
    }
}
