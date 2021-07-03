package excersice;

public class Operators {
    public static void main(String[] args) {
        /**
         * Answers for the operators
         */

        /**
         * Arithmetic Operators
         */
//    1.Add two int variables and print the result
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println(result);

//---------------------------------------------------------------------------------------------

//    2.Add two double value and print the result
        double number1 = 10;
        double number2 = 20;
        double result = number1 + number2;
        System.out.println(result);

//---------------------------------------------------------------------------------------------

//     3.Add one int value and one double and print the result
        int number1 = 10;
        double number2 = 20;
        double result = number1 + number2;
        System.out.println(result);

//---------------------------------------------------------------------------------------------

//      4.Get the difference of 20, and 10 both are ints
        int number1 = 20;
        int number2 = 10;
        int result = number1 - number2;
        System.out.println(result);

//---------------------------------------------------------------------------------------------

        /**
         * 5.int number1 = 50; int number2 =20;
         * number1+number2.
         * number1-number2.
         * number1/number2.
         * number1*number2.
         * number1%number2.
         * Print a,b,c,d,e.
         */
        int number1 = 50;
        int number2 = 20;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);

//---------------------------------------------------------------------------------------------

        /**
         * 6.What are the answers?
         * 10/2;
         * 10/3;
         * 10%2;
         * 10%3;
         * 10/3;
         */

        int result_1 = 10 / 2;
        int result_2 = 10 / 3;
        int result_3 = 10 % 2;
        int result_4 = 10 % 3;
        int result_5 = 10 / 3;
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println(result_5);

        /**
         * The answers
         * 5
         * 3
         * 0
         * 1
         * 3
         */

//---------------------------------------------------------------------------------------------
//      7.What is the answer? int result = 6*4/2; answer is :12
//---------------------------------------------------------------------------------------------
        /**
         * Assignment Operator
         */
        /**
         * 1.Simplify the following expressions using assignment operators. And guess result for a,b,c,d,e
         *      int result = 10;
         * a.result = result + 12;
         * b.result = result - 4;
         * c.result = result / 3;
         * d.result = result * 12;
         * e.result = result % 6;
         */
        int result = 10;
        result += 12;
        result -= 4;
        result /= 3;
        result *= 12;
        result %= 6;

        /**
         * result in a,b,c,d,e
         * a.22
         * b.18
         * c.6
         * d.72
         * e.0
         */
//---------------------------------------------------------------------------------------------
        /**
         * 2.Expand the following expressions. And guess the answer for a,b,c,d,e
         *    int result = 10;
         * a.result += 16;
         * b.result -= 5;
         * c.result /= 3;
         * d.result *= 2;
         * e.result %= 6;
         */
        int result = 10;
        result = result + 16;
        result = result - 5;
        result = result / 3;
        result = result * 2;
        result = result % 6;
        /**
         * Result for a,b,c,d,e
         * a.6
         * b.21
         * c.7
         * d.14
         * e.2
         */
//---------------------------------------------------------------------------------------------
        /**
         * Unary Operators
         * You can see the answers by running the programme
         */
//---------------------------------------------------------------------------------------------
        /**
         * Relational Operators
         * You can see the answers by running the programme
         */
//---------------------------------------------------------------------------------------------
        /**
         * Conditional Operators
         */
//---------------------------------------------------------------------------------------------
        /**
         * 1.Write a programme to identify the numbers between 5 and 9
         * a.Create a variable named number.
         * b.Write a programme to print true if number between 5 and 9 (5<number<9)
         * c.Change the number and check what are the numbers between 5 and 9
         * d.(Answer has given)
         */
        int number = 6; //change this by another number and test it between 5 and 9
        System.out.println(5 < number && number < 9);
//---------------------------------------------------------------------------------------------
        /**
         * 2.Write a programme to check a number is even
         * a.Create a variable named number.
         * b.Check it even. If number is even, will print true
         */
        int number = 1;
        System.out.println(number%2==0);
//---------------------------------------------------------------------------------------------
        /**
         *3.Write a programme to
         * Create a variable named number.
         * Check it can divide by 2 (number%2==0)
         * Check it can divide by 3 (number%3==0)
         * Check it can divide by both 2 and 3
         */
        int number = 18;
        System.out.println(number % 2 == 0);
        System.out.println(number % 3 == 0);
        System.out.println((number % 2 == 0) && (number % 3 == 0));
        System.out.println((number % 2 == 0) || (number % 3 == 0));
    }
}
