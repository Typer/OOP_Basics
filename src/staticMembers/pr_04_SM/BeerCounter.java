package staticMembers.pr_04_SM;

/**
 * Created by typer on 10/23/16.
 */
public class BeerCounter {
    public static int beerInStock;
    public static int beersDrankCount;

    static {
        beerInStock = 0;
        beersDrankCount = 0;
    }

    public static void buyBeer(int bottlesCount){
       beerInStock += bottlesCount;
    }

    public static void drinkBeer(int bottlesCount){
        beerInStock -= bottlesCount;
        beersDrankCount += bottlesCount;
    }
}
