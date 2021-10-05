public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(5);
        list.addLast(1);
        list.addLast(4);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(3));
    }
}