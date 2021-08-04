package excersice;

public class JavaString {
    public static void main(String[] args) {

    }

    /**
     Write a method to print a given string
     */
    static void print(String string){
        System.out.println(string);
    }

    /**
     Write a method to  find the length of a given string
     */
    static void printLength(String string){
        System.out.println(string.length());
    }

    /**
     Write a method to check that given string is empty of not
        Print “string is not empty” if given string is not empty
        Print “string is empty” if given string is empty

     */
    static void checkEmpty(String string){
        if(string.isEmpty()){
            System.out.println("string is empty");
        }else {
            System.out.println("string is not empty");
        }
    }

    /**
     charAt()
     */

    /**
     Write a method to print the first letter of a given string
     */
    static void printFirstLetter(String string) {
        System.out.println(string.charAt(0));
    }

    /**
     Write a method to print the last letter of a given string
     */
    static void printLastLetter(String string) {
        System.out.println(string.charAt(string.length() - 1));
    }

    /**
     Write a method to print the letters of given string
     */
    static void printLetters(String string){
        for (int i = 0; i< string.length(); i++){
            System.out.println(string.charAt(i));
        }
    }

    /**
     Write a method to count number of spaces in a given string
     */
    static void selectSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (letter == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     Write a method to separate ‘0’ and ‘1’ in a given string.
        String givenString = ‘001000110111’;
        String zeroString = ‘000000’;
        String oneString = ‘111111’;
        (create two strings to separate zero and one)
     */
    static void separateOneAndZeros(String string) {
        String oneString = "";
        String zeroString = "";
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (letter == '0') {
                zeroString = zeroString + letter;
            } else {
                oneString = oneString + letter;
            }
        }
        System.out.println("one string  :"+ oneString);
        System.out.println("zero string :"+ zeroString);
    }

    /**
     Write a method to reverse a given string
     */
    static void reverseString(String string) {
        String reveredString = "";
        for (int i = 0; i < string.length(); i++) {
            reveredString = reveredString + string.charAt(string.length() - 1 - i);
        }
        System.out.println(reveredString);
    }

    /**
     ASCII
     */

    /**
     Write a method to print the ascii values of each letters in a given strings
     */
    static void printAscii(String string){
        for(int i=0; i<string.length(); i++){
            char letter = string.charAt(i);
            System.out.println(letter +":"+(int)letter );
        }
    }

    /**
     substring()
     */
    /**
     Consider this string
        String name = “java is very funny”;
        Print “java” using substring.
        Print “is” using substring.
        Print is “funny”
     */
    static void stringSubstring(){
        String name = "java is very funny";

        //Print “java” using substring.
        System.out.println(name.substring(0,5));
        //Print “is” using substring.
        System.out.println(name.substring(5,7));
        //Print is “funny”
        System.out.println(name.substring(13));
    }

    /**
     Consider this string
     String name = "java is very funny";
     What are the output in follows
        System.out.println(name.substring(1,5));
        System.out.println(name.substring(2,10));
        System.out.println(name.substring(0));
        System.out.println(name.substring(5));
     */
    //output
//    i.  ava
//    ii. va is ve
//    iii.java is very funny
//    iv. is very funny


    /**
     * substring
     */

    /**
     String message = "happy new year";

     Check “happy” in the string
     Check “new” in the string
     Check “2020” in the string
     */
    static void printContains(){
        String message = "happy new year";

        //Check “happy” in the string
        System.out.println(message.contains("happy"));
        //Check “new” in the string
        System.out.println(message.contains("new"));
        //Check “2020” in the string
        System.out.println(message.contains("2020"));
    }

    static void printApprovedProjects(){
        String[] projects = {
                "galle project has approved",
                "trinco project has approved",
                "kandy project has rejected",
                "jaffna project has approved",
                "colombo project has rejected",
        };

        for(String project: projects){
            if(project.contains("approved")){
                System.out.println(project);
            }
        }
    }

    /**
     Write a method to  format the date in dd/mm/yyyy format and return it.
        Ex. if we give “25”,”06, “2018”, need to return 25/06/2018
     */
//    public static void main(String[] args) {
//        String date = formatDate("/","25","06","2018");
//        System.out.println(date);
//    }

    static String formatDate(String operator, String... parameters){
        return String.join(operator, parameters);
    }

    /**
     concat
     */

    /**
     Write a method to concat following words
     “Hello”, “world”
     */
    static void stringConcat() {
        String hello = "Hello";
        String world = " World";
        String wish = hello.concat(world);
        System.out.println(wish);
    }

    /**
     Consider following string
     String string = "java is a programming language";
        Replace ‘a’ by ‘o’
        Print it
     */
    static void stringReplacement() {
        String string = "java is a programming language";
//        Replace ‘a’ by ‘o’
        String replaced = string.replace('a','o');
//        Print it
        System.out.println(replaced);
    }

    /**
     Consider the following string
        String string = "java is very funny";

        Split the string(will create a string array)
        Print the length of the splitted string
     */
    static void stringSplitLength() {
        String string = "java is very funny";

        //Split the string(will create a string array)
        String[] split = string.split(" ");

        //Print the length of the splitted string
        System.out.println(split.length);
    }

    /**
     Consider the following string
        String string = "java is very funny";
            Split the string(will create a string array)
            Print the length of the splitted string
            Print the splitted array.
     */
    static void stringSplitArray() {
        String string = "java is very funny";

        //Split the string(will create a string array)
        String[] split = string.split(" ");

        //Print the length of the splitted string
        System.out.println(split.length);

        //Print the splitted array.
        for (String splitedString :split){
            System.out.println(splitedString);
        }
    }

    /**
     indexOf(0
     */
    /**
     Consider the following string
        String string = "java is very funny";
        Print the index of the “is” word.
     */
    static void stringIndexOf() {
        String string = "java is very funny";
        int index = string.indexOf("is");
        System.out.println(index);
    }

    /**
     Consider following string
        String string = "java is very funny";
        Convert this string to upper case and print it
     */
    static void stringToUpperCase() {
        String string = "java is very funny";
        //Convert this string to upper case and print it
        String upper = string.toUpperCase();
        System.out.println(upper);
    }

    /**
     Consider following string
        String string = "JAVA IS VERY FUNNY";
        Convert this string to lower case and print it
     */
    static void stringToLowerCase() {
        String string = "JAVA IS VERY FUNNY";
        String loverCase = string.toLowerCase();
        System.out.println(loverCase);
    }

    /**
     Consider following string
     String string = "JAVA IS VERY FUNNY";
        Print the length
        Trim the string
        Print the length
     */
    static void stringTrim() {
        String string = " JAVA IS VERY FUNNY ";
        //Print the length
        System.out.println(string.length());
        //Trim the string
        String trimed = string.trim();
        //Print the length
        System.out.println(trimed.length());
    }



}
