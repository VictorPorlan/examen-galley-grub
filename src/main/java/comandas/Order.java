package comandas;

import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total = 0.00;
    private List<Item> items = new ArrayList<Item>();

    public Order() {
    }

    @Override
    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        this.items.add(item);
    }

    @Override
    public void addItem(String name, double price, String extra) {
        Item item = new Item(name, price, extra);
        this.items.add(item);
    }

    @Override
    public int size() {
        return itemList().size();
    }

    @Override
    public List<Item> itemList() {
        return this.items;
    }

    @Override
    public Double getTotal() {
        return this.total;
    }

    @Override
    public void updateTotal(Double price) {
        this.total += price;
    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER --- ");
        items.stream().forEach(x -> {
            this.itemDisplay(x);
        });
    }
    private void itemDisplay(Item item){
        System.out.println("\t" + item);
    };
}
