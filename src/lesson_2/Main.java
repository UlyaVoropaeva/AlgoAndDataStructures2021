package lesson_2;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Selection sort begin");
        Date start = new Date();
        arrayCreator().selectionSort();
        Date finish = new Date();
        System.out.println("Selection sort finished. Time: " + (finish.getTime() - start.getTime()));
        System.out.println();

        System.out.println("Insertion sort begin");
        start = new Date();
        arrayCreator().insertionSort();
        finish = new Date();
        System.out.println("Insertion sort finished. Time: " + (finish.getTime() - start.getTime()));
        System.out.println();

        System.out.println("Optimized bubble sort begin");
        start = new Date();
        arrayCreator().bubbleSortOptimized();
        finish = new Date();
        System.out.println("Optimized bubble sort finished. Time: " + (finish.getTime() - start.getTime()));
        System.out.println();

        System.out.println("Bubble sort begin");
        start = new Date();
        arrayCreator().bubbleSort();
        finish = new Date();
        System.out.println("Bubble sort finished. Time: " + (finish.getTime() - start.getTime()));
    }

    public static MyArrayList<Integer> arrayCreator() {
        Random r = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            mal.add(r.nextInt(10000000));
        }

        return mal;
    }
}
