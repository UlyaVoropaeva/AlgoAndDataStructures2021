package lesson_5;

import lesson_4.LinkedQueue;
import lesson_4.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println(recMultiply(5, 5));
        System.out.println(multiply(5, 5));

       // 2. Написать программу «Задача о рюкзаке» с помощью рекурсии.

        Item item1 = new Item("itim_1", 1, 1500);
        Item item2 = new Item("itim_2", 3, 2000);
        Item item3 = new Item("itim_3", 4, 3000);
        Item item4 = new Item("itim_4", 5, 3500);
        Item item5 = new Item("itim_5", 3, 200);
        Item item6 = new Item("itim_6", 2, 300);


        Backpack backpack = new Backpack(6);
        System.out.println(backpack.packagingOfItems(item1,item2,item3,item4,item5,item6));



    }

    //1. Написать программу по возведению числа в степень с помощью рекурсии.

    public static int recMultiply(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return recMultiply(a, n - 1) * a;
    }

    public static int multiply(int a, int n) {
        int exp = 1;
        for (int i = 0; i < n; i++) {
            exp = exp * a;
        }
        return exp;
    }

}
