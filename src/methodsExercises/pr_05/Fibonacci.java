package methodsExercises.pr_05;

/**
 * Created by typer on 10/14/16.
 */
public class Fibonacci {
    private int num;
    private int start;
    private int end;
    private StringBuilder str;

    public Fibonacci(int star, int end) {
        this.start = star;
        this.end = end;
        this.str = new StringBuilder();
        this.num = 0;
    }

    public StringBuilder getFibonacciSequence() {
        for (int i = start; i < end; i++) {
            str.append(getFibonacci(i) + ", ");
        }
        str.setLength(str.length() - 2);
        return str;
    }

    public long getFibonacci(int num) {
        this.num = num;
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        }

        long f1 = 1, f2 = 1, f3 = 1;
        long fibonacci = 0;

        for (int i = 3; i <= num; i++) {
            fibonacci = f1 + f2;
            f1 = f2;
            f2 = fibonacci;
        }

        return fibonacci;
    }
}
