package hw6.hw6q1;

import java.util.Scanner;

public class Basket {

    private final Scanner input = new Scanner(System.in);
    private Products products;
    private int[] data;

    public Basket() {
        data = new int[1];


        System.out.print("Enter number " + "th: ");


        data[0] = input.nextInt();
    }

    public void add() {
        System.out.print("Enter number of data: ");
        int num = input.nextInt();
        int[] newData = new int[data.length + num];
        System.arraycopy(data, 0, newData, 0, data.length);
        for (int i = data.length; i < data.length + num; i++) {
            System.out.print("Enter number " + (i + 1) + "th: ");
            newData[i] = input.nextInt();
        }
        data = newData;
    }

    public void del() {
        System.out.print("Delete with: [1]index [2]value\nYour choice: ");
        int select = input.nextInt();
        if (select == 1) {
            System.out.print("Enter index of number: ");
            int index = input.nextInt();
            if (index >= 0 && index <= data.length) {
                index--;
                int[] newData = new int[data.length - 1];
                if (index >= 0) System.arraycopy(data, 0, newData, 0, index);
                if (data.length - (index + 1) >= 0)
                    System.arraycopy(data, index + 1, newData, index + 1 - 1, data.length - (index + 1));
                data = newData;
            } else
                System.out.println("Enter the correct number!");
        } else if (select == 2) {
            System.out.print("Enter your number: ");
            int val = input.nextInt();
            int count = 0;
            for (int datum : data)
                if (datum == val)
                    count++;
            if (count == 0)
                System.out.println("This number is not available!");
            else {
                int[] newData = new int[data.length - count];
                for (int i = 0, j = 0; i < data.length; i++)
                    if (data[i] != val) {
                        newData[j] = data[i];
                        j++;
                    }
                data = newData;
            }
        } else
            System.out.println("Enter the correct number!");
    }

    public int[] find() {
        int[] dataFind = new int[1];
        int subject;
        int type;
        System.out.println("SELECT: 1.Book, 2.Electronic, 3.Shoe");
        subject = input.nextInt();
        if (subject == 1) {
            System.out.println("SELECT: 1.books, 2.magazines");
            type = input.nextInt();
            if (type == 1) {
                System.out.println("Enter the desired product number:");
                dataFind = products.getBooks()[input.nextInt()];
            } else {
                System.out.println("Enter the desired product number:");

            }
        } else if (subject == 2) {
            System.out.println("SELECT: 1.televisions, 2.radios");
            type = input.nextInt();
            if (type == 1) {
                System.out.println("Enter the desired product number:");

            } else {
                System.out.println("Enter the desired product number:");

            }
        } else if (subject == 3) {
            System.out.println("SELECT: 1.sports, 2.formals");
            type = input.nextInt();
            if (type == 1) {
                System.out.println("Enter the desired product number:");

            } else {
                System.out.println("Enter the desired product number:");

            }
        }


        System.out.print("Enter your number: ");
        int val = input.nextInt();
        int count = 0;
        System.out.println("Result(s):");
        for (int i = 0; i < data.length; i++)
            if (data[i] == val) {
                System.out.println("Index of " + val + " is: " + (i + 1));
                count++;
            }
        if (count == 0)
            System.out.println("This number is not available!");
    }

    public void print() {
        if (data.length == 0)
            System.out.print("Data: []\n");
        else {
            System.out.print("Data: [");
            for (int i = 0; i < data.length - 1; i++)
                System.out.print(data[i] + ", ");
            System.out.print(data[data.length - 1] + "]\n");
        }
    }

}
