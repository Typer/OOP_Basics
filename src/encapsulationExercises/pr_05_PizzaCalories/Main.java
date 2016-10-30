package encapsulationExercises.pr_05_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/30/16.
 */
public class Main {
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            String result = null;

            while (true) {
                String[] input = reader.readLine().split("\\s+");
                if (input[0].equals("END")) {
                    break;
                }

                switch (input[0]) {
                    case "Dough":
                        Dough dough = tryMakeDough(input);
                        result = String.format("%.2f", dough.getCalories());
                        break;
                    case "Topping":
                        Topping topping = tryMakeTopping(input);
                        result = String.format("%.2f", topping.getToppingCalories());
                        break;

                    case "Pizza":
                        Pizza pizza = tryMakePizza(input);
                        result = pizza.toString();
                        break;
                }

                System.out.println(result);
            }
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private static Pizza tryMakePizza(String[] input) throws IOException {
        String name = input[1];
        int numberOfToppings = Integer.parseInt(input[2]);

        Pizza pizza = new Pizza(name, numberOfToppings);

        String[] line = reader.readLine().split("\\s+");
        Dough dough = tryMakeDough(line);
        pizza.setDough(dough);

        for (int i = 0; i < numberOfToppings; i++) {
            String[] toppingsInput = reader.readLine().split("\\s+");
            Topping topping = tryMakeTopping(toppingsInput);
            pizza.addTopping(topping);
        }

        return pizza;

    }

    private static Topping tryMakeTopping(String[] input) {
        String name = input[1];
        int weight = Integer.parseInt(input[2]);

        Topping topping = new Topping(name, weight);
        return topping;
//        return String.format("%.2f", topping.getToppingCalories());
    }

    private static Dough tryMakeDough(String[] input) {
        String flour = input[1];
        String baking = input[2];
        int weight = Integer.parseInt(input[3]);

        Dough dough = new Dough(flour, baking, weight);
        return dough;
    }

}
