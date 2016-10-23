package staticMembers.pr_03_SM;

/**
 * Created by typer on 10/23/16.
 */
public class Temperature {

    private double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public static double getFahrenheit(double temperature) {
        return (temperature - 32) / 1.8;
    }

    public static double getCelsium(double temperature) {
        return temperature * 1.8 + 32;
    }
}

