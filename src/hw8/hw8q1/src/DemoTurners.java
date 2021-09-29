public class DemoTurners {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();

        leaf.turn();
        page.turn();
        pancake.turn();
    }
}
