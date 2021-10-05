import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Character> setOne = new TreeSet<>();
        TreeSet<Character> setTwo = new TreeSet<>();
        fill(setOne);
        fill(setTwo);
        System.out.println("first treeSet : " + setOne);
        System.out.println("second treeSet : " + setTwo);
        System.out.println("community : " + community(setOne, setTwo));
        System.out.println("subscript : " + subscript(setOne, setTwo));
    }

    public static void fill(TreeSet<Character> set) {
        Random rand = new Random();
        do {
            if (set.size() < 10)
                set.add((char) (rand.nextInt(26) + 'a'));
        } while (set.size() != 10);
    }

    public static TreeSet<Character> community(TreeSet<Character> setOne, TreeSet<Character> setTwo) {
        TreeSet<Character> tmp = new TreeSet<>();
        tmp.addAll(setOne);
        tmp.addAll(setTwo);
        return tmp;
    }

    public static TreeSet<Character> subscript(TreeSet<Character> setOne, TreeSet<Character> setTwo) {
        TreeSet<Character> newTreeSetOne = new TreeSet<>();
        TreeSet<Character> newTreeSetTwo = new TreeSet<>();
        TreeSet<Character> subscript = new TreeSet<>();
        newTreeSetOne.addAll(setOne);
        newTreeSetTwo.addAll(setTwo);
        for (Character c : newTreeSetOne) {
            if (newTreeSetTwo.contains(c))
                subscript.add(c);
        }
        return subscript;
    }
}
