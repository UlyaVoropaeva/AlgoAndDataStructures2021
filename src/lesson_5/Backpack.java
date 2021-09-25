package lesson_5;

import java.util.*;

public class Backpack {

    private final int bagSize;
    private List<Item> setOfItems = null;
    private int price;

    public Backpack(int bagSize) {
        this.bagSize = bagSize;
    }

    public String packagingOfItems(Item... arr) {
        List<Item> list = new ArrayList<>();
        Collections.addAll(list, arr);
        variants(list);


        StringBuilder sb = new StringBuilder();
        sb.append("Предметы: ");
        for (Item value : setOfItems) {
            sb.append(value.getName()).append(" ");
        }
        sb.append("Цена набора: ").append(price);
        return sb.toString();
    }

    private void variants(List<Item> items) {
        if (items.size() > 0) {
            checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newList = new ArrayList<>(items);
            newList.remove(i);
            variants(newList);

        }
    }

    private void checkSet(List<Item> items) {
        if (setOfItems == null) {
            if (variantsWeight(items) <= bagSize) {
                setOfItems = items;
                price = checkPrice(items);
            }
        } else {
            if (variantsWeight(items) <= bagSize && checkPrice(items) > price) {
                setOfItems = items;
                price = checkPrice(items);
            }
        }
    }

    private int variantsWeight(List<Item> items) {
        int weightCheck = 0;
        for (Item item : items) {
            weightCheck += item.getWeight();
        }
        return weightCheck;
    }

    private int checkPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.getPrice();
        }
        return sumPrice;
    }


}
