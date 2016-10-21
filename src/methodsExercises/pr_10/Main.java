package methodsExercises.pr_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Created by typer on 10/20/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstDate = reader.readLine().trim().split("\\s+");

        int oldYear = Integer.valueOf(firstDate[0]);
        int oldMonth = Integer.valueOf(firstDate[1]);
        int oldDay = Integer.valueOf(firstDate[2]);

        String[] secondDate = reader.readLine().trim().split("\\s+");

        int newYear = Integer.valueOf(secondDate[0]);
        int newMonth = Integer.valueOf(secondDate[1]);
        int newDay = Integer.valueOf(secondDate[2]);

        DateModifier dm = new DateModifier();
        dm.setCalender(oldDay,oldMonth,oldYear,newDay,newMonth,newYear);

        System.out.println(dm.calculateDifference());


    }
}
