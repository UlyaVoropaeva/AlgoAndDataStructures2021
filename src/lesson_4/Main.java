package lesson_4;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(25);
        mll.insertFirst(55);
        mll.insertFirst(56);
        mll.insertFirst(55);
        mll.insertFirst(35);

        System.out.println(mll);
        System.out.println(mll.lastIndexOf(55));
        System.out.println(mll.indexOf(55));

        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        System.out.println(queue.peekFront());
        System.out.println(queue.toStr());

        queue.remove();
        System.out.println(queue.peekFront());
        System.out.println(queue.toStr());
        System.out.println(queue.size());


    }
}
