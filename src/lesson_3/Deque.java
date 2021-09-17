package lesson_3;


import java.util.Arrays;

public class Deque<T extends Comparable<T>> {
    private T[] items;
    private int size = 0;
    private int capacity;
    private int head = 0;
    private int tail = 0;


    public Deque(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity < 0");
        }
        this.capacity = capacity;
        items = (T[]) new Comparable[capacity];

    }

    public void insertLeft(T item) {

        if (items.length == size) {
            allocateNewArray(1);
        }
        if (head > 0) {
            head--;
        } else {
            head = items.length - 1;
        }
        items[head] = item;
        size++;
        if (size == 1) {
            tail = head;
        }
    }

    public void insertRight(T item) {
        if (items.length == size) {
            allocateNewArray(0);
        }
        if (tail == items.length - 1) {
            tail = 0;
        } else {
            tail++;
        }
        items[tail] = item;
        size++;
        if (size == 1) {
            head = tail;
        }
    }

    public T removeLeft() {
        if (size == 0) {
            throw new IllegalArgumentException("The deque is empty");
        }
        T value = items[head];
        for (int i = 0; i < items.length - 1; i++) {
            items[i] = items[i + 1];
        }
        if (head == items.length - 1) {
            head = 0;
        } else {
            head++;
        }
        --size;
        return value;
    }

    public T removeRight() {
        if (size == 0) {
            throw new IllegalArgumentException("The deque is empty");
        }
        T value = items[tail];
        if (tail == 0) {
            tail = items.length - 1;
        } else {
            tail--;
        }
        size--;
        return value;
    }

    public T peekFirst() {
        if (size == 0) {
            throw new IllegalArgumentException("The deque is empty");
        }
        return items[head];
    }

    public T peekLast() {
        if (size == 0) {
            throw new IllegalArgumentException("The deque is empty");
        }
        return items[tail];
    }

    public boolean isFull() {
        return size == items.length;
    }

    private void allocateNewArray(int startingIndex) {
        int newLength = (size == 0) ? 1 : size * 2;

        T[] newArray = (T[]) new Comparable[newLength];

        if (size > 0) {
            int targetIndex = startingIndex;
            if (tail < head) {
                for (int index = head; index < items.length; index++) {
                    newArray[targetIndex] = items[index];
                    targetIndex++;
                }
                for (int index = 0; index <= tail; index++) {
                    newArray[targetIndex] = items[index];
                    targetIndex++;
                }
            } else {
                for (int index = head; index <= tail; index++) {
                    newArray[targetIndex] = items[index];
                    targetIndex++;
                }
            }
            head = startingIndex;
            tail = targetIndex - 1;
        } else {
            head = 0;
            tail = -1;
        }
        items = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--> [");
        for (int i = 0; i < size; i++) {
            sb.append(items[i]);

            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
