package pr_03_Mankind;

/**
 * Created by Typer on 11/10/2016.
 */
public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        if (firstName.charAt(0) < 65 && firstName.charAt(0) > 90){
            throw new IllegalArgumentException(ExceptionMessages.EXPECTED_UPPER_CASE_LETTER_FIRST_NAME);//ok
        }
        if (firstName.length() < 4){
            throw new IllegalArgumentException(ExceptionMessages.EXPECTED_AT_LEAST_FOUR_SYMBOLS);//ok
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        if (lastName.charAt(0) < 65 && lastName.charAt(0) > 90){
            throw new IllegalArgumentException(ExceptionMessages.EXPECTED_UPPER_CASE_LETTER_LAST_NAME);//ok
        }
        if (lastName.length() < 3){
            throw new IllegalArgumentException(ExceptionMessages.EXPECTED_AT_LEAST_THREE_SYMBOLS);//ok
        }
        this.lastName = lastName;
    }
}
