package staticMembers.pr_08_SM;

/**
 * Created by typer on 10/24/16.
 */
public class VolumeCalculator {
    public static double getTriangularPrism(double length, double width, double height){
        return 0.5*length * width * height;
    }

    public static double getCube(double length){
        return length*length*length;
    }

    public static double getCylinder(double radius, double height){
        return 3.14159265359 * Math.pow(radius,2) * height;
    }
}
