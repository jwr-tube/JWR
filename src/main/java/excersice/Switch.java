package excersice;

public class Switch {
    public static void main(String[] args) {

    }
//-------------------------------------------------------------------------------------------
    /**
     1.Write a method named calculator to do mathematical operations
        Need to give the two number values named num1, num2  and one operator.
        If provide ‘+’ operator, return num1+num2;
        If provide ‘+’ operator, return num1-num2;
        If provide ‘+’ operator, return num1*num2;
        If provide ‘+’ operator, return num1/num2;
        If operator not provided, will return 0;
     */
    static double calculator(double num1, char operator, double num2) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = 0;
        }
        return result;
    }
//-------------------------------------------------------------------------------------------
    /**
     * 2.Write a method to find the given letter is a vowel or not
        Method name should findVowel
        One parameter named letter needed to given
        If letter belong to (a,e,i,o,u) we can print “This is a vowel”
        If not that we should print “This is not a vowel”0
        No need to think of capital letters. (A,E,I,O,U). Only apply for the simple letters(letter should)
     */
    static void findVowel(char letter){
        switch (letter){
            case 'a':
                System.out.println("This is a vowel");
                break;
            case 'e':
                System.out.println("This is a vowel");
                break;
            case 'i':
                System.out.println("This is a vowel");
                break;
            case 'o':
                System.out.println("This is a vowel");
                break;
            case 'u':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is not a vowel");
        }
    }
//-------------------------------------------------------------------------------------------
    /**
     3.Write a method to print the Phone company when provide the first three digits of the phone number
        Method name should findPhoneCompany
        One String input
        Need to print phone company
        “077”->”dialog”;
        “071”->”mobitel”;
        “075”->”airtel”;
        “078”->”hutch”;
        “072”->”etiselat”;
     */
    static void findPhoneCompany(String phoneNumber){
        switch (phoneNumber){
            case "077":
                System.out.println("dialog");
                break;
            case "071":
                System.out.println("mobitel");
                break;
            case "075":
                System.out.println("airtel");
                break;
            case "078":
                System.out.println("hutch");
                break;
            case "072":
                System.out.println("etiselat");
                break;
            default:
                System.out.println("not a valid phone number");
        }
    }
//-------------------------------------------------------------------------------------------
    /**
     * Java Switch Statement is fall-through - no need answers
     */
//-------------------------------------------------------------------------------------------
    /*
    Nested Switch Statement
    */

    /**
     1.Write a method to online banking
        Method name should banking
        You have two bank accounts (BOC,HNB)
        And you have to deposit and withdraw money.
        Write a nested switch case to select the bank and select the operation(deposit or withdraw)
     */
    static void banking(String bankName, String operation) {
        switch (bankName) {
            case "BOC":
                switch (operation) {
                    case "DEPOSIT":
                        System.out.println("DEPOSIT TO BOC");
                        break;
                    case "WITHDRAW":
                        System.out.println("WITHDRAW FROM BOC");
                        break;
                    default:
                        System.out.println("WRONG OPERATION");
                }
                break;
            case "HNB":
                switch (operation) {
                    case "DEPOSIT":
                        System.out.println("DEPOSIT TO HNB");
                        break;
                    case "WITHDRAW":
                        System.out.println("WITHDRAW FROM HNB");
                        break;
                    default:
                        System.out.println("WRONG OPERATION");
                }
                break;
            default:
                System.out.println("Wrong selection");
        }
    }
}
