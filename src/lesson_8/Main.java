package lesson_8;


import java.util.Random;

public class Main {

    public static void main(String[] args) {


        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        map.put(2, "two");
        map.put(3, "three");
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            map.put(random.nextInt(100), "");
        }
        System.out.println(map);
        System.out.println("Проверка метода удаления  (2,two) = " + map.remove(2, "two"));
        System.out.println("Проверка метода удаления  (3) = " + map.remove(3));
        System.out.println(map);

        LinearProbingHashMap<Integer, String> map2 = new LinearProbingHashMap<>(7);

        map2.put(2, "two");
        map2.put(1, "ony");
        map2.put(10, "many");
        map2.put(9, "yava");
        System.out.println(map2);
        System.out.println("Проверка метода удаления  (2,two) = " + map2.remove(2, "two"));
        System.out.println(map2);
        map2.put(2, "11");
        map2.put(17, "two");
        System.out.println(map2);
    }

}
