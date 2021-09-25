package lesson_5;

public class Item {
    private String name;
    private int weight;
    private int price;

    public Item(String name, int weight, int price){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public long getPrice() {
        return price;
    }

    public long getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }


}
