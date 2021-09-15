package hw6.hw6q1;

public class Electronic {

    private String[] device = new String[4];

    public Electronic(String name, String type, int size, int price) {
        device[0] = String.valueOf(price);
        device[1] = name;
        device[2] = type;
        device[3] = String.valueOf(size);
    }

    public String[] getDevice() {
        return device;
    }
}
