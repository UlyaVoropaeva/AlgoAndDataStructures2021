package lesson_3;

public class Main {

    private static int DEFAULT_CAPACITY = 0;

    public static void main(String[] args) {

        String str = "Stack";
        System.out.println(reverseString(str));

        Deque<Integer> myDeque = new Deque<>(DEFAULT_CAPACITY);
        myDeque.insertLeft(10);
        myDeque.insertRight(2);
        myDeque.insertLeft(50);
        myDeque.insertRight(1);
        myDeque.insertLeft(60);


        System.out.println("myDeque");
        System.out.println(myDeque.toString());
        myDeque.removeLeft();
        myDeque.removeRight();

        System.out.println("myDeque");
        System.out.println(myDeque.toString());

        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(5);
        myStack.push(2);
        myStack.push(9);
        myStack.push(1);
        myStack.push(4);

        System.out.println("MyStack");
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println("MyStack");
        System.out.println(myStack.toString());

        MyQueue<Integer> queue = new MyQueue<>();

        queue.insert(3);
        queue.insert(2);
        queue.insert(7);
        queue.insert(4);
        System.out.println("MyQueue");
        System.out.println(queue.toString());


    }

    //Создать программу, которая переворачивает вводимые строки (читает справа налево).
    public static String reverseString(String str) {
        MyStack<Character> stack = new MyStack<>();
        String result = "";
        for (Character character : str.toCharArray()) {
            stack.push(character);
        }
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }
        return result;
    }


}
