package lesson_4;

public class LinkedQueue<T> {
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    public void insert(T item) {
        list.insertLast(item);
    }

    public T remove() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public T peekFront() {
        return list.getFirst();
    }
    public String toStr() {
        return  list.toString();
    }

}