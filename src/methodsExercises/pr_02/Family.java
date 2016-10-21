package methodsExercises.pr_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by typer on 10/13/16.
 */
public class Family {
    private List<Person> people;
    private Person oldestPerson;

    public Family() {
        this.people = new ArrayList<>();
    }

    public void addMember(Person member){
        people.add(member);
    }

    public Person getOldestMember(){
        int val = Integer.MIN_VALUE;

        for (Person person : people) {
            if (person.getAge() > val) {
                val = person.getAge();
            }
        }

        for (Person person : people) {
            if (person.getAge() == val){
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

}
