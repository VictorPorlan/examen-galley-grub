package extra;

import comandas.Comanda;
import items.Item;

import java.util.Optional;

public class Regular extends Extra{
    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> regularTotal = comanda.itemList().stream().map(Item::price).reduce(Double::sum);
        regularTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(x-> x.sumExtras(comanda));
    }
}
