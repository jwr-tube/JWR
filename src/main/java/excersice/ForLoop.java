package excersice;

public class ForLoop {

    public static void main(String[] args) {

    }

    //1.Write a method to print  “Java is very funny” 5 times.
    static void print() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java is very funny");
        }
    }

    //2.Write a method to print 1 to 10
    static void oneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //3.Write a method to print the sum of 1 to five (1+2+3+4+5)
    static void sum() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //4.Write a method to return the sum of 1 to N (N will be any number).
    static void sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //5.Write a method to print numbers in the given range (need to give the start and end)
    static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    /**
     Write a method to print the even and odd numbers between 0-20.
       1.If the number is even then print “This is even”
       2.If the number is odd then print “This is even : ”
     */
    static void findOddEven() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even :" + i);
            } else {
                System.out.println("This is odd :" + i);
            }
        }
    }

    //7.Modify above method(6) to find in any given range
    static void findOddEven(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even :" + i);
            } else {
                System.out.println("This is odd :" + i);
            }
        }
    }

    /**
     8.Write a method to print the first 10 multiples of a given number.
     Ex. if we select 2 as the given number, we need to print the following result by using the loop.
     2 x 1 = 2
     2 x 2 = 4
     2 x 3 = 6
     2 x 4 = 8
     2 x 5 = 10
     2 x 6 = 12
     2 x 7 = 14
     2 x 8 = 16
     2 x 9 = 18
     2 x 10 = 20
     */
    static void multiplies(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }
    /**
     * 9.Write a method to print 10 to 1.
     */
    static void tenToOne(){
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
    }
    /**
     * 10.Write a method to show infinite.
     */
    static void infiniteLoop(){
        for(int i=10; i>=1; i++){
            System.out.println(i);
        }
    }

    /**
     * BREAK
     * Write a method to print 0-10 and break it when number is equal to 3
     */
    static void useBrake() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

    /**
     * CONTINUE
     * Write a method to print 0-10 and continue it when number is equal to 3
     */
    static void useContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * NESTED FOR LOOPS
     */

     /**
     1.Write a method to print following output
            *****
            *****
            *****
     */
     static void pattern1() {
         for (int i = 1; i <= 3; i++) {
             for (int j = 1; j <= 5; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }

    /**
     2.Write a method to print following output
     *+*+*
     *+*+*
     *+*+*
     */
    static void pattern2() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    /**
     3.Write a method to print following output
     12345
     12345
     12345
     */
    static void pattern3(){
        for(int i=1; i<=3; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /**
     4.Write a method to print following output
     54321
     54321
     54321
     */
    static void pattern4(){
        for(int i=1; i<=3; i++){
            for(int j = 5; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     5.Write a method to print following multiplication table
     */
    static void multiplicationTable(int end){
        for(int i=1; i<=end; i++){
            for(int j=1; j<=end; j++){
                System.out.print(i*j);
            }
            System.out.println();
        }
    }

    /**
     * START PATTERNS
     */
    /**
     1.Print following star pattern using for loop
     */
    static void starPattern1(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     2.Print following star pattern using for loop
     ****
     ***
     **
     *
     */
    static void starPattern2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //3.Print following star pattern using for loop
    static void starPattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //4.Print following star pattern using for loop
    static void starPattern4(int rows) {
        for (int i = rows; i >= 1; --i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }
            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //5.Print following star pattern using for loop
    static void starPattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*  ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}

