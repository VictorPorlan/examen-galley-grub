package extra;

import comandas.Comanda;

import java.util.Optional;

public abstract class Extra {
  final String CHEESE = "cheese";
  final String SAUCE = "sauce";
  final String LARGE = "large";

  Optional<Extra> nextExtra = Optional.empty();

  public Extra(){};

  public void setNextExtra(Extra extra) {
      this.nextExtra = Optional.of(extra);
  }

  public abstract void sumExtras(Comanda comanda);

}
