package staticMembers.pr_03_SM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/22/16.
 */
public class TemperatureConverterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] inpuTemperature = reader.readLine().trim().split("\\s+");
            if (inpuTemperature[0].equals("End")){
                break;
            }

            double temperature = Double.parseDouble(inpuTemperature[0]);
            String typeOfTemperature = inpuTemperature[1];

            Temperature temp = null;

            switch (typeOfTemperature){
                case "Fahrenheit":
                    System.out.printf("%.2f Celsius%n",Temperature.getFahrenheit(temperature));
                    break;
                case "Celsius":
                    System.out.printf("%.2f Fahrenheit%n",Temperature.getCelsium(temperature));
                    break;
            }

        }
    }
}
