package comandas;

import extra.Extra;

public class Receipt implements Ticket{
    private Comanda comanda;
    private Double total = 0.00;
    private Extra extraChain;

    public Receipt(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public Comanda getOrder() {
        return this.comanda;
    }

    @Override
    public void setChain(Extra extraChain) {
        this.extraChain = extraChain;
    }

    @Override
    public Extra getChain() {
        return this.extraChain;
    }

    @Override
    public Double total() {
        if (this.extraChain != null) {
            sumExtrasCharge();
        }
        return this.total;

    }

    @Override
    public void sumExtrasCharge() {
        extraChain.sumExtras(comanda);
        this.total = comanda.getTotal();
    }

    @Override
    public void print() {
        this.comanda.display();
        System.out.println("\t" + "TOTAL ---------> "+ this.total.toString()+ "$");
    }
}
