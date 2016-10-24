package staticMembers.pr_07_SM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/24/16.
 */
public class BasicMath {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] input = reader.readLine().trim().split("\\s+");
            if(input[0].equals("End")){
                break;
            }

            String type = input[0];
            double first = Double.parseDouble(input[1]);
            double second = Double.parseDouble(input[2]);

            switch (type){
                case "Sum":
                    System.out.printf("%.2f%n",MathUtil.getSum(first,second));
                    break;
                case "Multiply":
                    System.out.printf("%.2f%n",MathUtil.getMultiply(first,second));
                    break;
                case "Percentage":
                    System.out.printf("%.2f%n",MathUtil.getPercentage(first,second));
                    break;
                case "Divide":
                    System.out.printf("%.2f%n",MathUtil.getDivide(first,second));
                    break;
                case "Subtract":
                    System.out.printf("%.2f%n",MathUtil.getSubstract(first,second));
                    break;
            }
        }
    }
}
