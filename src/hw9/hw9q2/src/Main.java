import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);

        if (numbers.size() % 2 == 1)
            numbers.remove(numbers.size() - 1);

        int i = numbers.size() - 1;
        do {
            if (numbers.get(i - 1) > numbers.get(i)) {
                numbers.remove(i);
                numbers.remove(i - 1);
            }
            i -= 2;
        } while (i != -1);

        System.out.println(numbers);
    }
}
