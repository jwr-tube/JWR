package excersice.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        /*
        ඔයාට ExceptionHandling class එකේ object එකක් හදාගෙන ඕනෙම method එකක් call කරන්න පුළුවන්.
        example එකක් විදියට question1() method එක call කරන විදිය දීල තියෙන්නේ
         */
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.question7();
    }

    /*
    Question1
    Handle the following Arithmetic exception
    */
    private void question1() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        try {
            int number = 10 / 0;   //in here will occur an exception
        } catch (ArithmeticException exception) {
            System.out.println("Do not divide by zero");
        }
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
    }

    /*
    Question2
    Handle the following Null pointer exception
    */
    private void question2() {
        String name = null;
        int length = 0;
        try {
            length = name.length();
        } catch (NullPointerException exception) {
            System.out.println("name should not be null");
        }
        System.out.println(length);
    }

    /*
    Question2
    Handle the following ArrayIndexOutOfBoundsException exception
    */
    private void question3() {
        String[] names = {"Arun", "Dinuka", "Sajani"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        try {
            System.out.println(names[3]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index should be in a valid range");
        }
    }

    /*
    Question4
        Create a method to print the length of the given string.
        Pass some values and check if it is working or not.
        Pass the null value as a string(wll happen a null pointer exception).
        Create a method named ‘findLengthHandled’  and write the same logic and handle the null pointer exception
     */
    private void question4() {

        //Pass some values and check if it is working or not.
        findLength("Amani");//will print 5
        findLength("vinu");//will print 4

//        //Pass the null value as a string(wll happen a null pointer exception).
//        findLength(null);

        //Create a method named ‘findLengthHandled’  and write the same logic and handle the null pointer exception
        findLengthHandled(null);
    }

    //Create a method to print the length of the given string.
    private void findLength(String givenString){
        int length = givenString.length();
        System.out.println(length);
    }

    //Create a method to print the length of the given string.
    private void findLengthHandled(String givenString) {
        int length = 0;
        try {
            length = givenString.length();
        } catch (NullPointerException exception) {
            System.out.println("exception handled");
        }
        System.out.println(length);
    }

    private void question5() {
        int[] numbers = new int[2];
        try {
            numbers[0] = 11;
            numbers[1] = 12;
            numbers[2] = 10 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("Don't divide by zero");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index should be in valid range");
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
    }

    /*
    Question5
        Write a method named openAccount to start a child saving account.
        Take age as the parameter.
        If age>18, then throw an IllegalArgumentException
        Add a message in the exception as “Age should be less than 18”
        Check the method y giving the values.
     */
    private void question6() {
        //Check the method y giving the values.
        openAccount(16);
    }

    /*
      Write a method named openAccount to start a child saving account.
      Take age as the parameter.
     */
    private void openAccount(int age){
        //If age>18, then throw an IllegalArgumentException
        if(age>18){
            //Add a message in the exception as “Age should be less than 18”
            throw new IllegalArgumentException("Age should be less than 18");
        }
    }

    /*
    Question5
        Create a custom exception named “AgeException”
        Add a message as “Age need to less than 18”
        Write a method named openChildAccount to start a child saving account.
        Take age as the parameter.
        If age>18, then throw an AgeException
        Check the method by giving the values.
     */
    private void question7() {
        //Check the method by giving the values
        try {
            openChildAccount(19);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    private void openChildAccount(int age) throws AgeException {
        //If age>18, then throw an AgeException
        if(age>18){
            //Add a message in the exception as “Age should be less than 18”
            throw new AgeException();
        }
    }


    private void question8() {

    }

    /*
    -------------------------------Question8-------------------------------------
    Question8
        Handle this by adding an exception to the method signature
     */
    private void findFile() throws IOException {//adding an exception to the method signature
        File file = new File("sample.txt");
        System.out.println("file created");
        writing(file);
    }

    private void writing(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(65);
        System.out.println("file writed");
    }
    //----------------------------Question8--------------------------------------

    /*
    ------------------------------Question9--------------------------------------
    Question9
    Handle this by using try-catch
    */
    private void findFile1() {
        File file = new File("sample.txt");
        System.out.println("file created");
        try {
            writing(file);
        } catch (IOException e) {//Handle this by using try-catch
            e.printStackTrace();
        }
    }

    private void writing1(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(65);
        System.out.println("file writed");
    }
   //------------------------------Question9--------------------------------------


    private void question10() {

    }

}
//Create a custom exception named “AgeException”
class AgeException extends Exception{
    public AgeException() {
        //Add a message as “Age need to less than 18”
        super("Age need to less than 18");
    }
}
