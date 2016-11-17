package pr_03_Mankind;

/**
 * Created by Typer on 11/10/2016.
 */
public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String secondName, String facultyNumber) {
        super(firstName, secondName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_FACULTY_NUMBER);//ok
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s",this.getFirstName()))
                .append(System.lineSeparator())
                .append(String.format("Last Name: %s", this.getLastName()))
                .append(System.lineSeparator())
                .append(String.format("Faculty number: %s",this.getFacultyNumber()))
                .append(System.lineSeparator());
        return sb.toString();
    }
}
