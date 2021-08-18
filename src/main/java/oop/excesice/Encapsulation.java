package oop.excesice;

public class Encapsulation {
    public static void main(String[] args) {

    }
}


/**
 * Question 01
 */

class Book {
    //Private property: title, author, publisher and price
    private String title;
    private String author;
    private String publisher;
    private double price;

    public Book() {

    }

    //Attribute assignment is realized by construction method
    public Book(String name, String author, String publisher, double price) {
        this.title = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    /*
    The public get/set method is used to access the properties
     */
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private String getName() {
        return title;
    }

    /*
    Both the author and the title are read-only hence removed the setTitle()

    public void setTitle(String title) {
        this.title = title;
    }

    */

    private String getAuthor() {
        return author;
    }

   /*
    Both the author and the title are read-only hence removed the setAuthor()

    private void setAuthor(String author) {
        this.author = author;
    }

    */

    public double getPrice() {
        return this.price;
    }

    //The limited book price must be greater than 10. If it is invalid, you need to give a prompt and force the value to be 10
    public void setPrice(double price) {
        if (price < 10) {
            this.price = 10;
            System.out.println("Price error, forced conversion to 10");
            return;
        }
        this.price = price;
    }

    //Information introduction method, describing all the information of the book
    public void introduce() {
        System.out.println("title:" + title + "，Author:" + author + "，press:" + publisher + "，Price:" + price + "element");
    }
}

/**
 * Question 02
 */
class User {
    private String username;
    private int password;

    public User() {
    }

    public User(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void login() {
        String actual_username = "Admin";
        int actual_password = 1234;
        if (username != null) {//need to check this is null or not. because if it is null, will make a NullPointerException
            if (actual_username.equals(username) && password == actual_password) {
                System.out.println("Login success");
            } else {
                System.out.println("The user name or password is incorrect");
            }
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Mike");
        user.setPassword(123456);
        user.login();
    }
}
