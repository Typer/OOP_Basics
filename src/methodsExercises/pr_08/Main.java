package methodsExercises.pr_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/14/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split("\\s+");
        double speed = Double.valueOf(input[0]);
        double fuel = Double.valueOf(input[1]);
        double fuelEconomy = Double.valueOf(input[2]);

        Car car = new Car(speed,fuel, fuelEconomy);



        while (true){
            String[] commands = reader.readLine().trim().split("\\s+");
            if (commands[0].equals("END")){
                break;
            }

            switch (commands[0]) {
                case "Travel":
                    double distance = Double.parseDouble(commands[1]);
                    car.travel(distance);
                    break;

                case "Refuel":
                    double litttres = Double.parseDouble(commands[1]);
                    car.refuel(litttres);
                    break;

                case "Distance":
                    double travelDistance = car.getDistance();
                    System.out.printf("Total distance: %s kilometers %n", travelDistance);
                    break;

                case "Time":
                    double totalTime = car.getTime();
                    int hours = (int) totalTime / 60;
                    int minutes = (int) totalTime % 60;
                    System.out.printf("Total time: %d hours and %d minutes %n", hours, minutes);
                    break;

                case "Fuel":
                    double fuelLeft = car.getFuelAmount();
                    System.out.printf("Fuel left: %s liters", fuelLeft);
                    break;
            }
        }
    }
}
