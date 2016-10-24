package staticMembers.pr_07_SM;

/**
 * Created by typer on 10/24/16.
 */
public class MathUtil {
    public MathUtil() {
    }

    public static double getSum (double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    public static double getSubstract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public static double getMultiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public static double getDivide(double firstNum, double secondNum) {

        return firstNum / secondNum;
    }

    public static double getPercentage(double firstNum, double secondNum) {
        return firstNum - (firstNum *((100-secondNum)/100));
    }
}
