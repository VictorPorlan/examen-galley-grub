package items;

public class Item implements Product{
    private String name;
    private Double price;
    private String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public String name() {
        return name;
    }

    public Double price() {
        return price;
    }

    public String extra() {
        return extra;
    }

    @Override
    public Boolean isRegular() {
        return extra() == null;
    }

    @Override
    public String toString(){
        return isRegular()
                ? name() + "...." + price().toString() + "$"
                : name() + "/w " + extra() + "...." +price().toString() + "$ + " + Prices.getPrice(extra()).toString() + "$";
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object objeto){
        return objeto instanceof Item & ((Item) objeto).name.equals(this.name);
    }
}
