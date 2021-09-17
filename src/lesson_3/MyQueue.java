package lesson_3;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 0;
    private int begin;
    private int end;

    //0 1 2 3 4
    //        B
    //    E
    //1 5     8

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }

        return list[begin];
    }

    public void insert(T item) {
        if (isFull()) {
            allocateNewArray(1);
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void allocateNewArray(int startingIndex) {
        int newLength = (size == 0) ? 4 : size * 2;

        T[] newArray = (T[]) new Comparable[newLength];

        if (size > 0) {
            int targetIndex = startingIndex;
            if (end < begin) {
                for (int index = begin; index < list.length; index++) {
                    newArray[targetIndex] = list[index];
                    targetIndex++;
                }
                for (int index = 0; index <= end; index++) {
                    newArray[targetIndex] = list[index];
                    targetIndex++;
                }
            } else {
                for (int index = begin; index <= end; index++) {
                    newArray[targetIndex] = list[index];
                    targetIndex++;
                }
            }
            begin = startingIndex;
            end = targetIndex - 1;
        } else {
            begin = 0;
            end = 0;
        }
        list = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--> [");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]);

            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
