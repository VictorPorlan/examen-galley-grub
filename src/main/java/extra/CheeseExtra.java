package extra;

import comandas.Comanda;
import items.Prices;

import java.util.Optional;

public class CheeseExtra extends Extra{
    private Double CHEESE_PRICE = Prices.getPrice(CHEESE);

    public CheeseExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> cheeseTotal = comanda.itemList().stream()
                .filter(x -> x.extra() == CHEESE)
                .map(x -> CHEESE_PRICE).reduce(Double::sum);
        cheeseTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(x-> x.sumExtras(comanda));
    }
}
