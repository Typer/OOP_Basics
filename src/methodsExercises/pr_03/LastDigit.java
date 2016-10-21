package methodsExercises.pr_03;

/**
 * Created by typer on 10/14/16.
 */
public class LastDigit {
    private char lastDigit;

    public LastDigit(char lastDigit) {
        this.lastDigit = lastDigit;
    }

    public String getDigitName() {
        String word = null;

        switch (lastDigit) {
            case '1':
                word ="one";
            break;

            case '2':
                word = "two";
            break;

            case '3':
                word = "three";
            break;

            case '4':
                word = "four";
            break;

            case '5':
                word = "five";
            break;

            case '6':
                word = "six";
            break;

            case '7':
                word = "seven";
            break;

            case '8':
                word = "eight";
            break;

            case '9':
                word = "nine";
            break;
        }
        return word;

    }
}
