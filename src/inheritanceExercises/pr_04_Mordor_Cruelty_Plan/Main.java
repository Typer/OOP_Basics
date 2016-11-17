package pr_04_Mordor_Cruelty_Plan;

import pr_04_Mordor_Cruelty_Plan.models.Gandalf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Typer on 11/13/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
            String[] input = reader.readLine().trim().split("\\s+");

            Gandalf gandalf = new Gandalf();
            gandalf.setFood(input);
            gandalf.setMood();

            System.out.println(gandalf);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
