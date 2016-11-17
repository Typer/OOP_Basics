package pr_03_Mankind;

/**
 * Created by Typer on 11/10/2016.
 */
public class Worker extends Human {

    private double weekSalary;
    private double dayWorkHours;

    public Worker(String firstName, String secondName, double weekSalary, double dayWorkHours) {
        super(firstName, secondName);
        this.setWeekSalary(weekSalary);
        this.setDayWorkHours(dayWorkHours);
    }

    @Override
    public void setLastName(String lastName) {
        if (lastName.length() < 4){
            throw new IllegalArgumentException(ExceptionMessages.EXPECTED_MORE_THAN_THREE_SYMBOLS);//ok
        }
        super.setLastName(lastName);
    }

    public double getSalaryPerHour(){
        return this.weekSalary/(this.dayWorkHours*7);
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary < 11){
            throw new IllegalArgumentException(ExceptionMessages.EXPECTED_MORE_WEEK_SALARY);
        }
        this.weekSalary = weekSalary;
    }

    private void setDayWorkHours(double dayWorkHours) {
        if (dayWorkHours < 1 || dayWorkHours > 12){
            throw new IllegalArgumentException(ExceptionMessages.EXPECTED_MORE_WORK_HOURS);
        }
        this.dayWorkHours = dayWorkHours;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator())
                .append(String.format("First Name: %s",this.getFirstName()))
                .append(System.lineSeparator())
                .append(String.format("Last Name: %s", this.getLastName()))
                .append(System.lineSeparator())
                .append(String.format("Week Salary: %.2f",this.weekSalary))
                .append(System.lineSeparator())
                .append(String.format("Hours per day: %.2f",this.dayWorkHours))
                .append(System.lineSeparator())
                .append(String.format("Salary per hour: %.2f",this.getSalaryPerHour()));
        return sb.toString();
    }
}
