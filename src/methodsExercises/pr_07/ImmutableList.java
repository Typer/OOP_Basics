package methodsExercises.pr_07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by typer on 10/14/16.
 */
public class ImmutableList {
    private List<Integer> collection;

    public ImmutableList(List<Integer> collection) {
        this.collection = new ArrayList<>();
    }

    public ImmutableList getCollection(){
        return new ImmutableList(this.collection);
    }


}
