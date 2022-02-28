package extra;

import comandas.Comanda;
import items.Prices;

import java.util.Optional;

public class SauceExtra extends Extra{
    private Double SAUCE_PRICE = Prices.getPrice(SAUCE);

    public SauceExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> sauceTotal = comanda.itemList().stream()
                .filter(x -> x.extra() == SAUCE)
                .map(x -> SAUCE_PRICE).reduce(Double::sum);
        sauceTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(x-> x.sumExtras(comanda));
    }
}
