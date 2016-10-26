package encapsulationExercises.pr_01_EE;

import encapsulationExercises.pr_02_EE.Box;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by typer on 10/25/16.
 */
public class ClassBoxMain {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        Box box = new Box(length,width,height);

        Class boxClass = Box.class;Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays.asList(fields).stream().filter(f-> Modifier.isPrivate(f.getModifiers())).count());


        System.out.println(box);
    }
}
