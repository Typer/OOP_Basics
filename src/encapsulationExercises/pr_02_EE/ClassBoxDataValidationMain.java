package encapsulationExercises.pr_02_EE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by typer on 10/26/16.
 */
public class ClassBoxDataValidationMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());


        Class boxClass = Box.class;Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays.asList(fields).stream().filter(f-> Modifier.isPrivate(f.getModifiers())).count());

        try{
            Box box = new Box(length, width, height);
            System.out.println(box);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
