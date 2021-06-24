package excersice;

public class Methods {
    public static void main(String[] args) {
        /**
         * You can call any method in here
         * පහල තියෙන ඕනෑම method එකක් මෙතන call කරන්න පුළුවන්.
         * සංකීර්න වෙන නිසා මෙතන call කරලා නෑ.
         */
    }

    /**
     *----------
     * Group A (Star patterns)
     *----------
     */

    /**
     * 1.Write a method to print the following star pattern.
     *   Write a method named pattern1
     *   Call pattern1
     */
    static void pattern1(){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }

    /**
     * 2.Write a method to print the following star pattern.
     *   Write a method named pattern2
     *   Call pattern2
     */
    static void pattern2(){
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
    }

    /**
     * 3.Write a method to print the following star pattern.
     *   Write a method named pattern3
     *   Call pattern3
     */
    static void pattern3(){
        System.out.println("*******");
        System.out.println(" ***** ");
        System.out.println("  ***  ");
        System.out.println("   *   ");
    }

    /**
     * ----------
     * Group B (Strings)
     * ----------
     */

    /**
     * 1.Write a method to print your first name
     */
    static void myName(String firstName){
        System.out.println("My first Name is :"+ firstName);
    }

    /**
     * 2.Write a method to print your first name and last name named myFullName
     */
    static void myFullName(String firstName, String lastName){
        System.out.println("My full Name :"+firstName+" "+lastName);
    }

    /**
     * ----------
     * Group C (Mathematics)
     * ----------
     */

    /**
     * 1.Write a function named add to add to numbers.(print the result)
     */
    static void add(int number1, int number2){
        System.out.println(number1+number2);
    }

    /**
     * 2.Write a function named sub to get the difference of two numbers.(print the result)
     */
    static void sub(int number1, int number2){
        System.out.println(number1-number2);
    }

    /**
     * 3.Write a function named mul to multiply two numbers.(print the result)
     */
    static void mul(int number1, int number2){
        System.out.println(number1*number2);
    }

    /**
     * 4.Write method to print the summary of three numbers
     *   a.Method name should be summary
     *   b.Parameter names should be num1,num2, num3
     *   c.Assign the value of the(num1+num2+num3) to a variable name total
     *   d.Print the variable named total.
     */
    static void summary(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        System.out.println(total);
    }

    /**
     * 5.Method name should be average
     *  a.Parameter names should be num1,num2, num3
     *  b.Assign the value of the summary(num1+num2+num3) to a variable named total.
     *  c.Divide total and assign it to again
     *  d.Print the variable named total.
     */
    static void average(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        total = total/3;
        System.out.println(total);
    }

    /**
     * 6.Write a method named area to find the area of a rectangle/square
     *   a.Method name should be area
     *   b.Two number parameters named width and height
     *   c.Calculate the area using parameters (area = width*height)
     *   d.Print the area
     */
    static void area(int width, int height) {
        int area = width * height;
        System.out.print(area);
    }

    /**
     * 7.Write  a method named area to find the area of a rectangle/square
     *  a.Method name should be area
     *  b.Two number parameters named width and height
     *  c.Calculate the area using parameters (area = width*height)
     *  d.Print the area
     */
    static void area(int r){
        int area=(22*r*r)/7 ;
        System.out.println(area);
    }

    /**
     * ----------
     * Group D (Return Values)
     * ----------
     */

    /**
     * 1.Write a programme to return the sum of two numbers.
     *   a.Return the sum of numbers
     *   b.Assign the returned value to another variable named result
     *   c.learn how to choose the type of result(int/double)
     */
    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * 2.Write a programme to return the average of two numbers.
     *   a.Return the average of this numbers
     *   b.Assign the returned value to another variable named average
     *   c.learn how to choose the type of average(int/double)
     */

    static double average(int number1, int number2){
        int sum = number1+number2;
        double average = (double) sum/2;
        return average;
    }

    /**
     * ----------
     * Group E(Method calling )
     * ----------
     */
    /**
     * 1.There is a circle and a square. Need to find the surface area of the gray colored section.
     *   a.Write a method named squareArea to find the area of the square.
     *   b.Write a method named circleArea  to find the area of the circle
     *   c.Write a method named grayArea to find the gray area and call squareArea , circleArea  methods inside the grayArea method
     */

    /**
     *to find the area of the square.
     */
    static double squareArea(double length){
        return length*length;
    }

    /**
     * to find the area of the circle
     */
    static double circleArea(double radius){
        return (22*radius*radius)/7 ;
    }

    /**
     * to find the gray area
     */
    static double grayArea(double radius, double length){
        double circle =circleArea(radius);
        double square = squareArea(length);
        return circle-square;
    }
}




















