package staticMembers.pr_08_SM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] input = reader.readLine().trim().split("\\s+");
            if(input[0].equals("End")){
                break;
            }

            switch(input[0]){
                case "TrianglePrism":
                    System.out.printf("%.3f%n", VolumeCalculator.getTriangularPrism(
                            Double.parseDouble(input[1])
                            ,Double.parseDouble(input[2])
                            ,Double.parseDouble(input[3])));
                    break;

                case "Cube":
                    System.out.printf("%.3f%n", VolumeCalculator.getCube(
                            Double.parseDouble(input[1])));
                    break;

                case "Cylinder":
                    System.out.printf("%.3f%n", VolumeCalculator.getCylinder(
                            Double.parseDouble(input[1])
                            ,Double.parseDouble(input[2])));
                    break;
            }
        }
    }
}