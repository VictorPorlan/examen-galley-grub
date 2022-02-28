package comandas;

import extra.Extra;

public interface Ticket {
    public Comanda getOrder();
    public void setChain(Extra extra);
    public Extra getChain();
    public Double total();
    public void sumExtrasCharge();
    public void print();
}
