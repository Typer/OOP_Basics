package methodsExercises.pr_04;

/**
 * Created by typer on 10/14/16.
 */
public class Number {
    private String numbers;

    public Number(String numbers) {
        this.numbers = numbers;
    }

    public String getReversedNumber(){
        char[] num = numbers.toCharArray();
        StringBuilder str = new StringBuilder();

        for (int i = numbers.length()-1; i >= 0 ; i--) {
            str.append(num[i]);
        }

        String result = str.toString();
        return result;
    }
}
