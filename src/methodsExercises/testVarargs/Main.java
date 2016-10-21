package methodsExercises.testVarargs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/15/16.
 */

/*
Create a class Car. Every car has a speed, fuel and fuel economy
(given in the same order on the first line). They should be stored in the class.
Your task is to create a program which executes one of the commands:
  -  Travel <distance> – makes the car travel the specified <distance>
  -  Refuel <liters> – refuels the car with the specified <fuel>
  -  Distance – gets the total travel distance
  -  Time – get the total travel time
  -  Fuel – gets the remaining fuel
  -  END – stops the program
*/


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split("\\s+");

        print(text);
    }

    public static void print(String... text){
        for (String s : text) {
            System.out.println(s);
        }
    }

}
