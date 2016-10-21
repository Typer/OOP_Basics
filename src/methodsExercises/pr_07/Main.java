package methodsExercises.pr_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by typer on 10/14/16.
 */
public class Main {
    public static void main(String[] args) {
//            Class listClass = ImmutableList.class;
//            java.lang.reflect.Field[] fields = listClass.getDeclaredFields();
//            if (fields.length < 1) {
//                throw new ClassFormatException();
//            }
//            Method method = listClass.getDeclaredMethods()[0];
//            System.out.println(method.getReturnType().getSimpleName());
//        test

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        ImmutableList newList = new ImmutableList(list);
        System.out.println(newList.getCollection());
//        list.stream().forEach(System.out::println);
    }
}

//    public void givenUsingTheJdk_whenUnmodifiableListIsCreated_thenNotModifiable() {
//        List<String> list = new ArrayList<String>(Arrays.asList("one", "two", "three"));
//        List<String> unmodifiableList = Collections.unmodifiableList(list);
//        unmodifiableList.add("four");
//    }
