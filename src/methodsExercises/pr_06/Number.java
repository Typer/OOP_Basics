package methodsExercises.pr_06;

/**
 * Created by typer on 10/14/16.
 */
public class Number {
    private int number;
    private boolean isPrime;

    public Number() {
        this.number = 0;
        this.isPrime = false;
    }

    public Boolean isNumberPrime(int number) {

this.number = number;
        if (number == 0) {
            isPrime = true;
        } else if (number == 1) {
            isPrime = true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return isPrime = false;
        }
        return isPrime = true;
    }

    public int nextPrimeNumber(int number){
        int nexPrime = 0;
        int counter = number+1;

        while (isNumberPrime(counter) == false){
            counter++;
        }
        return nexPrime = counter;
    }
}
