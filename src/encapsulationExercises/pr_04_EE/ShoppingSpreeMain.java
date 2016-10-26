package encapsulationExercises.pr_04_EE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by typer on 10/26/16.
 */
public class ShoppingSpreeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstRow = reader.readLine().trim().split("[;,=]");
        String[] secondRow = reader.readLine().trim().split("[;,=]");
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        int currentIndex = 0;
        int prodictIndex = 0;

        try {

            for (int i = 0; i < firstRow.length / 2; i++) {
                people.add(new Person(firstRow[currentIndex], Double.parseDouble(firstRow[currentIndex + 1])));
                currentIndex += 2;
            }

            for (int i = 0; i < secondRow.length / 2; i++) {
                products.add(new Product(secondRow[prodictIndex], Double.parseDouble(secondRow[prodictIndex + 1])));
                prodictIndex += 2;
            }
        }catch (IllegalArgumentException ioe){
            System.out.println(ioe.getMessage());
        }

        while (true) {
            String[] input = reader.readLine().trim().split("\\s+");
            if (input[0].equals("END")) {
                break;
            }

            for (Person person : people) {
                if (input[0].equals(person.getName())) {
                    for (Product product : products) {
                        if (input[1].equals(product.getProduct())) {
                            try {
                                person.addProduct(product);
                                System.out.printf("%s bought %s%n", person.getName(), product.getProduct());
                            } catch (IllegalArgumentException ioe) {
                                System.out.printf(person.getName() + ioe.getMessage() + product.getProduct() + "%n");
                            }
                        }
                    }
                }
            }
        }

        for (Person person : people) {
            System.out.printf("%s - %s%n",person.getName(), person);
        }
    }
}
