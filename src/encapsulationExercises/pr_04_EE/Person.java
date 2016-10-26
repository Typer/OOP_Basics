package encapsulationExercises.pr_04_EE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by typer on 10/26/16.
 */
public class Person {
    private String name;
    private double money;
    private List<Product> bag;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.length() == 0){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }else{
            this.money = money;
        }
        this.money = money;
    }

    public void addProduct(Product product) {
        if (product.getPrice() > this.money) {
            throw new IllegalArgumentException(" can't afford ");
        }
        bag.add(product);
        this.money -= product.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (bag.size() > 0){
            for (int i = 0; i < bag.size(); i++) {
                str.append(bag.get(i).getProduct());
                str.append(", ");
            }
            str.delete(str.length() - 2, str.length());

            return str.toString();
        }

        return "Nothing bought";
    }
}
