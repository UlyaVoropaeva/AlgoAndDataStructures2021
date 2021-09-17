package lesson_3;

public class Reverses<T> {
    private T[] items;
    private int size = 0;
    private int capacity;
    private int start = items.length - 1;

    public Reverses(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        items = (T[]) new Object[capacity];
    }


    public void reverses(T[] items) {
        MyStack<T> myStack = new MyStack<>(items.length);
        for (int i = 0; i < items.length; i++) {
            myStack.push(items[i]);
        }
        for (int i = 0; i < myStack.size(); i++) {
            System.out.println(myStack.pop());
        }
    }
}
