package excersice;

public class WhileLoop {
    public static void main(String[] args) {

    }

    /**
     * Basics
     */
    //1.Write a method to print  “Java is very funny” 5 times.
    static void print() {
        int count = 0;
        while (count < 5) {
            System.out.println("java is very funny");
            count++;
        }
    }

    //2.Write a method to print 1 to 10.
    static void oneToTen() {
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
        }
    }

    //3.Write a method to get the sum of 1 to five (1+2+3+4+5)
    static void sum() {
        int count = 0;
        int sum = 0;
        while (count < 5) {
            count++;
            sum = sum + count;
        }
        System.out.println(sum);
    }

    //4.Write a method to return the sum of 1 to N (N will be any number).
    static int sum(int number) {
        int count = 0;
        int sum = 0;
        while (count < number) {
            count++;
            sum = sum + count;
        }
        return sum;
    }

    //5.Write a method to print numbers in the given range (need to give the start and end)
    static void print(int start, int end) {
        int count = start;
        while (count <= end) {
            System.out.println(count);
            count++;
        }
    }

    /**
     * 6.Write a method to print the even and odd numbers between 0-20.
     * If the number is even then print “This is even : ”
     * If the number is odd then print “This is even : ”
     */
    static void oddEven() {
        int count = 0;
        while (count <= 20) {
            if (count % 2 == 0) {
                System.out.println("This is an even :" + count);
            } else {
                System.out.println("This is an odd  :" + count);
            }
            count++;
        }
    }

    //7.Modify above method(6) to find in any given range
    static void oddEven(int start, int end) {
        int count = start;
        while (count <= end) {
            if (count % 2 == 0) {
                System.out.println("This is an even :" + count);
            } else {
                System.out.println("This is an odd  :" + count);
            }
            count++;
        }
    }

    /**
     * Write a method to print the first 10 multiples of a given number.
     * Ex. if we select 2 as the given number, we need to print the following result by using the loop.
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
    static void getMultiplies(int number){
        int counter = 1;
        while (counter<=10){
            System.out.println(number +" x "+ counter + " = "+ number*counter);
            counter++;
        }
    }

    /**
     * break
     */
    //1.Write a method to print 0-10 and break it when number is equal to 3
    static void printAndBreak() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }

    /**
     * continue
     */
    //1.Write a method to print 0-10 and continue it when number is equal to 3
    static void printAndContinue() {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

}