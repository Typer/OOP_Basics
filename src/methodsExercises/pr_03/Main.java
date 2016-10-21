package methodsExercises.pr_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/14/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numbers = reader.readLine();
        char lastDigit = numbers.charAt(numbers.length()-1);

        LastDigit lastDigit1 = new LastDigit(lastDigit);

        System.out.println(lastDigit1.getDigitName());
    }
}
