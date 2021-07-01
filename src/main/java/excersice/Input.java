package excersice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your age :");
        String age = scanner.nextLine();

        System.out.print("enter your address:");
        String address = scanner.nextLine();

        System.out.println("-----result-------");
        System.out.println("Your name is :"+name);
        System.out.println("Your age is  :"+age);
        System.out.print("Your address is :"+address);
    }
}
