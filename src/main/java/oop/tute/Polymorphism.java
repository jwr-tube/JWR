package oop.tute;

public class Polymorphism {
    private static final String TITLE_MR = "MR";
    private static final String TITLE_MS = "MS";
    private static final String MESSAGE_DOLLAR_PRICE = "Dollar Price";
    private static final String FIXED_DEPOSIT_INTEREST = "Fixed deposit interest";
    private static final String COMPLAIN_PHONE_NUMBER_1 = "01189562355";
    private static final String COMPLAIN_PHONE_NUMBER_2 = "08189562355";
    private static final String COMPLAIN_PHONE_NUMBER_3 = "06189562355";


    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.display();
        screen.display(COMPLAIN_PHONE_NUMBER_2);
        screen.display(TITLE_MS, "Aruni");
        screen.display(MESSAGE_DOLLAR_PRICE, 200);
        screen.display(FIXED_DEPOSIT_INTEREST,9);
    }
}

class Screen {

    /*
    to display the bank details
     */
    public void display() {
        System.out.println("Welcome to JWR Bank");
    }

    /*
       to display the head office contact number
     */
    public void display(String phoneNumber) {
        System.out.println("Please contact " + phoneNumber + " to contact for the complains/suggestions");
    }

    /*
       to display the birthday boy/girl
     */
    public void display(String title, String name) {
        System.out.println("Happy birthday " + title + " " + name);
    }

    /*
    to display to current dollar price, interest for the fixe deposits
     */
    public void display(String message, double value) {
        System.out.println("Current " + message + " is :" + value);
    }

    /*
    to display the closing time
     */
    public void display(int hour, int minute) {
        System.out.println("The bank will closed at " + hour + ":" + minute);
    }
}
