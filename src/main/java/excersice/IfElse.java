package excersice;

public class IfElse {
    public static void main(String[] args) {

    }

    /**
     1.Write a method to identify the even and odd numbers
        a.Method name should be findOddEven
        b.One int parameter named number should be in the method
        c.If the number is even, it should be printed “This is an even number” .
        d.Else should print “This is an odd number” .
     */
    static void findOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }

    /**
     2.Write a method named to select voters
         a.Method name should be selectVoters()
         b.Should one int parameter named age (need to give the age)
         c.If age is below or equal 18 (age =>18) should print “You suitable to vote”
         d.Else print “You are not suitable to vote”.
     */
    static void selectVoters(int age) {
        if (age >= 18) {
            System.out.println("You are suitable to vote");
        } else {
            System.out.println("You are not suitable to vote");
        }
    }

    /**
     3.Write a method to show the exam result.
        a.Method name should be examResult
        b.Should be one parameter named marks to add the marks
        c.If( 50 < marks) should print “Congratulations! You had pass the exam”
        d.Else should print “Sorry! You had fail the exam”
     */
    static void examResult(double marks) {
        if (50 <= marks) {
            System.out.println("Congratulations! You had pass the exam");
        } else {
            System.out.println("Sorry! You had fail the exam");
        }
    }

    /**
     4.Write a programme to select the largest number of the given two numbers.
        a.Method name should maxNumber;
        b.Need two parameters named number1, number2
        c.Return the largest number
        d.Write using if else
        e.Write using ternary operator
     */

    static int maxNumber(int number1, int number2){
        if(number1<number2){
            return number2;
        }else {
            return number1;
        }
    }

    static int maxNumberByTernary(int number_1, int number_2){
        return number_1>number_2 ? number_1:number_2;
    }

    /**
     * IF-ELSE-IF
     */

    /**
     1.Write a programme to find rectangle or not for the given length and width
        a.Method name should findRectangle
        b.Parameters names should be height and width
        c.Check height and width have the valid values (height>0 and width>0)
        d.If not parameters valid print “sorry, check the parameters”
        e.If (height == width) it is a square then print “This is a square”
        f.Else (height != width).it is a rectangle then print “This is a rectangle”
     */
    static void findRectangle(double width, double height) {
        if (height <= 0 || width <= 0) {
            System.out.println("sorry, check the parameters");
        } else if (height == width) {
            System.out.println("This is a square");
        } else {
            System.out.println("his is a rectangle");
        }
    }

    /**
     2.Write a method to return the grade when give the mark of the subject
        a.Method name should getGrade.
        b.One parameter named marks needed to take the marks.
            00-45 - F
            45-60 - C
            60-80 - B
            100-80 - A
     */
    static char getGrade(double marks) {
        if (80 <= marks && marks <= 100) {
            return 'A';
        } else if (60 <= marks && marks < 80) {
            return 'B';
        } else if (45 <= marks && marks < 60) {
            return 'C';
        } else {
            return 'F';
        }
    }

    /**
     3.Write a method to return the Phone company when provide the first three digits of the phone number
        a.Method name should findPhoneCompany
        b.One String input
        c.Need to return phone company
            *“077”->”dialog”;
            *“071”->”mobitel”;
            *“075”->”airtel”;
            *“078”->”hutch”;
            *“072”->”etiselat”;
     */
    static String findPhoneCompany(String phoneNumber) {
        if (phoneNumber == "077") {
            return "dialog";
        } else if (phoneNumber == "071") {
            return "mobitel";
        } else if (phoneNumber == "075") {
            return "airtel";
        } else if (phoneNumber == "078") {
            return "hutch";
        } else if (phoneNumber == "072") {
            return "etiselat";
        } else {
            return "wroneg number";
        }
    }

    /**
     4.Write a method named login to check username and password
        a.Method name is login
        b.Two parameters named username and password.
        c.Check the (username==”admin”)
        d.If that username==”admin” is true, print “username is valid” and  able check the password
        e.But if  username==”admin” is false,print “username is not valid” not able to check the password
        f.When checking the password, if password ==”123” true, print “password is correct, login success”.
        g.If  password ==”123”  false,  print “password is not correct, login fail”.
     */
    static void login(String username, String password) {
        if (username == "admin") {
            if (password == "123") {
                System.out.println("password is correct,login success");
            } else {
                System.out.println("password is not correct, login fail");
            }
        } else {
            System.out.println("username is not valid");
        }
    }

}
