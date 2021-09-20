package hw6.hw6q1.user;

import hw6.hw6q1.site.Basket;

import java.util.Scanner;

public class User {

    private Scanner input = new Scanner(System.in);
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int mobileNumber;
    private String emailAddress;
    private Address address;
    private Basket basket;

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        System.out.println("Enter userName: ");
        username = input.next();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        System.out.println("Enter password: ");
        password = input.next();
        ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        System.out.println("Enter firstName: ");
        firstName = input.next();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.println("Enter lastName: ");
        lastName = input.next();
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber() {
        System.out.println("Enter mobileNumber: ");
        mobileNumber = input.nextInt();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress() {
        System.out.println("Enter emailAddress: ");
        emailAddress = input.next();
    }

    public void getAddress() {
        System.out.println(address);
    }

    public void setAddress() {
        address.setAddress();
    }
}
