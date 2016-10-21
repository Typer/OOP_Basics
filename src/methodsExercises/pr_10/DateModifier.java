package methodsExercises.pr_10;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by typer on 10/20/16.
 */
public class DateModifier {

    private Calendar first;
    private Calendar second;

    public DateModifier() {

        this.first = Calendar.getInstance();
        this.second = Calendar.getInstance();

    }


    public void setCalender(int fDay, int fMonth, int fYear,int sDay, int sMonth,int sYear){
        first.set(fYear,fMonth,fDay);
        second.set(sYear,sMonth,sDay);
    }

    public long calculateDifference(){
        Date startDate = first.getTime();
        Date endDate = second.getTime();
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long diffTime = Math.abs(endTime - startTime);
        long diffDays = diffTime / (1000 * 60 * 60 * 24);

        return diffDays;
    }
}