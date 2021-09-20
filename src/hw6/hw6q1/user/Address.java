package hw6.hw6q1.user;

import java.util.Scanner;

public class Address {
    private String[] address = new String[4];

    public String[] getAddress() {
        return address;
    }

    public void setAddress() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the state: ");
        address[0] = input.next();
        System.out.print("Enter the name of the city: ");
        address[1] = input.next();
        System.out.println("Enter the street name: ");
        address[2] = input.next();
        System.out.println("Enter the zip code: ");
        address[3] = String.valueOf(input.nextInt());
    }

}
