package extra;

import comandas.Comanda;
import items.Prices;

import java.util.Optional;

public class SizeLargeExtra extends Extra{
    private Double LARGE_PRICE = Prices.getPrice(LARGE);

    public SizeLargeExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> largeTotal = comanda.itemList().stream()
                .filter(x -> x.extra() == LARGE)
                .map(x -> LARGE_PRICE).reduce(Double::sum);
        largeTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(x-> x.sumExtras(comanda));
    }
}
