package sololearnPoo;

import java.util.Scanner;
import sololearnPoo.Customer;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer(firstName, secondName, age, roomNumber);
        //set customer's data to object here
        customer.saveCustomerInfo();
    }
}
