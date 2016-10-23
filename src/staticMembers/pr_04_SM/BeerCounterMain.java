package staticMembers.pr_04_SM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by typer on 10/23/16.
 */
public class BeerCounterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] input = reader.readLine().trim().split("\\s+");
            if (input[0].equals("End")){
                break;
            }

            int buyBeers = Integer.parseInt(input[0]);
            int drinkBeers = Integer.parseInt(input[1]);

            BeerCounter.buyBeer(buyBeers);
            BeerCounter.drinkBeer(drinkBeers);
        }

        System.out.printf("%d %d",BeerCounter.beerInStock,BeerCounter.beersDrankCount);
    }
}
