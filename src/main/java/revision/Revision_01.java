package revision;

public class Revision_01 {
    public static void main(String[] args) {

    }

    /**
     * 1)
     * Do following things
     * Let's assume two numbers named n and m
     * Write a Method to return the sum of given two numbers(n+m)
     * Write a Method to return the difference of given two numbers(n-m)
     * Write a Method to return the multiplication of given two numbers(n*m)
     * Write a Method to divide and return the for  given two numbers(n/m)
     * Create a method named calculator to do
     * Addition,
     * Deduction
     * Multiplication
     * division
     * To do for a given two numbers using above (a),(b),(c),(d) methods
     * Hint: you can use switch operator for that. Use parameters to select the operators(+, -, /. *)
     */
    //Write a Method to return the sum of given two numbers(n+m)
    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    //Write a Method to return the difference of given two numbers(n-m)
    static int diff(int number1, int number2) {
        return number1 - number2;
    }

    //Write a Method to return the multiplication of given two numbers(n*m)
    static int mul(int number1, int number2) {
        return number1 * number2;
    }

    //Write a Method to divide and return the for  given two numbers(n/m)
    static int div(int number1, int number2) {
        return number1 / number2;
    }

    static double calculator(int number1, char operator, int number2) {
        double answer = 0;
        switch (operator) {
            case '+':
                answer = sum(number1, number2);
                break;
            case '-':
                answer = diff(number1, number2);
                break;
            case '*':
                answer = mul(number1, number2);
                break;
            case '/':
                answer = div(number1, number2);
                break;
            default:
                System.out.println("sorry wrong operation");
        }
        return answer;
    }

    /**
     A palindrome is a word that is the same after the reverse. For example
     LOL,
     MADAM
     AMMA
     POP
     Write a method to identify given string is a palindrome or not
     (Hint: reverse the string and compare with the original word)
     */
    static void findPalindrome(String word) {
        //to reverse the string
        String reversedWord = "";
        for (int i = 0; i < word.length(); i++) {
            reversedWord = reversedWord + word.charAt(word.length() - 1 - i);
        }
        //to compare with the original string
        if(reversedWord.equals(word)){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }

    /**
     Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
     Write a method to find the prime numbers. If the given number is a prime number, print “this is a prime number”. If not that “not a prime number”
     Check with the 2, 3, 5, 7, 11, 13, 17
     */
    static void findPrimeNumber(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    /**
     Write a method to
     Print the length of “happy birthday to you”.
     Keep two spaces at the start and at the end “ happy birthday to you ” and print the length again.
     Use trim() method to remove the unwanted spaces in the (b).
     print the length again.
     */
    static void printLength(){
        //Print the length of “happy birthday to you”
        String sentence = "happy birthday to you";
        System.out.println(sentence.length());

        //Keep two spaces at the start and at the end “ happy birthday to you ”
        sentence = " happy birthday to you ";

        // and print the length again.
        System.out.println(sentence.length());

        //Use trim() method to remove the unwanted spaces in the (b).
        sentence = sentence.trim();

        //print the length again.
        System.out.println(sentence.length());
    }

    /**
     Write a method to count the number of words in a given sentence.(assume that words are separated by the spaces)
     (hint: use split mechanism)
     */
    static int wordCount(String sentences){
        //split by the spaces.
        String[] words = sentences.trim().split(" ");
        return words.length;
    }

    /**
     Write a method to find the words starting with ‘T’.
     If starting with “T” return true. Otherwise return false.
     */
    static boolean findStartingWithT(String word){
        return word.startsWith("T");
    }

    /**
     Write a method to find the words ending with ‘g’
     If ending with “g” return true. Otherwise return false.
     */
    static boolean findEndingWithG(String word){
        return word.endsWith("g");
    }

    /**
     Write a method to find the words starting with ‘T’. and ending with ‘g’
     If starting with “T” and ending with ‘g’ return true. Otherwise return false.
     */
    static boolean findStartingWithTAndEndingWithG(String word) {
        return word.startsWith("T") && word.endsWith("g");
    }

    /**
     Write a method to return the longest word in the given sentence.
     */
    static String findLongestWord(String sentence) {
        String[] words = sentence.trim().split(" ");// used trim method to remove un starting and ending spaces
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    /**
     * Write a method to return the given letter in a given sentence.
     * Ex. if we give the ‘e’ letter in ‘good evening’. Should be return 2
     */
    static int countGivenLetter(String sentence, char letter) {
        int count = 0;
        for(int i =0; i<sentence.length(); i++){
            if(sentence.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}
