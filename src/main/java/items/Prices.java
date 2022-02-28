package items;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    private static HashMap<String, Double> prices= new HashMap<String, Double>();
    public static void init_prices() {
        prices.putAll(Map.of(
                "large", 0.5,
                "sauce", 0.5,
                "medium", 0.25,
                "cheese", 0.25));
    }

    public static Double getPrice(String name){
        return prices.get(name);
    }

    public static void display(){
        prices.entrySet().stream().forEach(x -> {
            System.out.println("\t" + x);
        });
    }
}
