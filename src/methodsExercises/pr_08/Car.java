package methodsExercises.pr_08;

/**
 * Created by typer on 10/14/16.
 */
public class Car {
    private double speed;
    private double fuelAmount;
    private double fuelEconomy;
    private double distance;
    private double time;

    public Car(double speed, double fuelAmount, double fuelEconomy) {
        this.speed = speed;
        this.fuelAmount = fuelAmount;
        this.fuelEconomy = fuelEconomy;
        this.time = 0;
        this.distance = 0.0;
    }

    public void refuel(double fuel){
        this.fuelAmount += fuel;
    }


    public void travel(double distance){
        double canTravel = (this.fuelAmount * 100) / this.fuelEconomy;
        if (canTravel < distance){
            distance = canTravel;
        }

        double littersAmount =  distance * (this.fuelEconomy  / 100);
        this.fuelAmount -= littersAmount;
        this.distance += distance;
        this.time += (distance / this.speed) * 60;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getTime() {
        return time;
    }
}
