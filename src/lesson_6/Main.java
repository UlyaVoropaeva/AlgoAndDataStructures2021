package lesson_6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int balanced = 0;
        int quantity = 10000;

        for (int i = 1; i <= quantity; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();

            for (int j = 1; j <= 16; j++) {
                map.put(j,random.nextInt((max - min+1)) + min);

            }
            System.out.println(map.toString());
            map.display();

            if (!map.isBalanced()) {
                balanced++;
                System.out.println("несбалансирован");
            } else {
                System.out.println("сбалансирован");
            }

        }
        double proc = 100.0 * balanced / quantity;

        System.out.println(balanced);
        System.out.println("Процент несбалансированных деревьев: " + proc);
    }



}
