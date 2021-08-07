package excersice;

public class MultiDementionalArrays {
    public static void main(String[] args) {

    }

    //1.Create an int type 2d array to represent the 3 students marks.
    static void create2DArray() {
        //way 1
        int[][] marks1 = {{75, 56, 89, 12, 30}, {45, 36, 89, 82, 30}, {75, 56, 29, 30, 18}};

        //way 2
        int[][] marks2 = new int[3][5];
        marks2[0] = new int[]{75, 56, 89, 12, 30};
        marks2[1] = new int[]{45, 36, 89, 82, 30};
        marks2[2] = new int[]{75, 56, 29, 30, 18};
    }

    /**
     * 2.Print this 2d array
     * int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
     */
    static void printNumberArray() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i<numbers.length ; i++){
            for (int j = 0; j< numbers[i].length; j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }

    /**
     3.Print this 2d array
     String[][] names = {{"one", "two", "three"}, {"four", "five", "six"}, {"seven","eight","nine"}};
     */
    static void printNamesArray(){
        String[][] names = {{"one", "two", "three"}, {"four", "five", "six"}, {"seven","eight","nine"}};
        for (int i = 0; i<names.length ; i++){
            for (int j = 0; j< names[i].length; j++){
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     *4.Write a method to print the given int type 2d array. And check it with this array
     *int[][] num = {{1,2,3},{3,4,8}};
     */
    static void printArray(int[][] numbers){
        for (int i =0; i< numbers.length; i++){
            for (int j =0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }

    /**
     5.
     Those are the marks for the three students in the past term test.
     Write a method to return an array to represent the sum of each student.
      The marks array as follows
      double[][] marks = new double[3][5];
      marks[0] = new double[]{45.5, 16, 78, 92, 61};
      marks[1] = new double[]{91, 86, 78, 52, 69};
      marks[2] = new double[]{41, 66, 78, 32, 62};
     */
    static double[] getSum(double[][] numbers){
        double[] total = new double[numbers.length];
        for(int i=0; i<numbers.length; i++){
            double sum = 0;
            for(int j=0; j<numbers[i].length; j++){
                sum = sum+ numbers[i][j];
            }
            total[i] = sum;
        }
        return total;
    }

    static void printSum(){
        double[][] marks = new double[3][5];
        marks[0] = new double[]{45.5, 16, 78, 92, 61};
        marks[1] = new double[]{91, 86, 78, 52, 69};
        marks[2] = new double[]{41, 66, 78, 32, 62};
        double[] sum = getSum(marks);

        for (int i=0; i<sum.length; i++){
            System.out.println(sum[i]);
        }
    }

    /**
     Write a method to
     int[] numbers = {10,23,15,18,9};
     Copy above array to below array
     int[] copies = new int[numbers.length];
     Print the both arrays and see the difference
     */
    static void copyArray() {
        int[] numbers = {10,23,15,18,9};
        int[] copies = new int[numbers.length];

        for (int i=0; i< numbers.length; i++){
            copies[i] = numbers[i];
        }

        System.out.println("the numbers array");
        //to print the numbers array
        for (int i=0; i< numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        //to print the copies array
        System.out.println("\nthe copied array");
        for (int i=0; i< copies.length; i++){
            System.out.print(copies[i]+" ");
        }
    }

    /**
     Write a method to
     int[] numbers = {10,23,15,18,9};
     Create below array using above array(below array elements created multiply by two of the above arrays elements)
     int[] multiplyByTwo = {20,46,30,36,18};
     Print the both arrays and see the difference
     */
    static void multiplyByTwo() {
        int[] numbers = {10,23,15,18,9};
        int[] multiplyByTwo = new int[numbers.length];

        for (int i=0; i<numbers.length; i++){
            multiplyByTwo[i] = numbers[i]*2;
        }

        //to print the numbers array
        System.out.println("the numbers array");
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        //to print the multiplyByTwo array
        System.out.println("\nthe multiplyByTwo array");
        for (int i=0; i<multiplyByTwo.length; i++){
            System.out.print(multiplyByTwo[i]+" ");
        }
    }

    /**
     Write a method to
     int[][] numbers = {{9, 8, 5, 1}, {1, 5, 7, 9}, {9, 6, 3, 8}};
     Copy above array to below array
     int[][] copies = new int[numbers.length][numbers[0].length];
     Print the both arrays and see the difference
     */
    static void copyTwoDimensionalArray() {
        int[][] numbers = {{9, 8, 5, 1}, {1, 5, 7, 9}, {9, 6, 3, 8}};
        int[][] copies = new int[numbers.length][numbers[0].length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                copies[i][j] = numbers[i][j];
            }
        }

        //to print the numbers array
        System.out.println("the numbers array");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        //to print the copies array
        System.out.println("\nthe copies array");
        for (int i = 0; i < copies.length; i++) {
            for (int j = 0; j < copies[i].length; j++) {
                System.out.print(copies[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     Write a method to
     int[][] numbers = {{2, 1, 0, 3}, {1, 4, 3, 4}, {1, 2, 3, 0}};
     Create below array using above array(below array elements created multiply by two of the above arrays elements)
     int[][] mult = {{4, 2, 0, 6}, {2, 8, 6, 8}, {2, 4, 6, 0}};
     Print the both arrays and see the difference
     */
    static void multiply() {
        int[][] numbers = {{2, 1, 0, 3}, {1, 4, 3, 4}, {1, 2, 3, 0}};
        int[][] mult = new int[numbers.length][numbers[0].length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                mult[i][j] = numbers[i][j]*2;
            }
        }

        //to print the numbers array
        System.out.println("the numbers array");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        //to print the multiply array
        System.out.println("\nthe mult array");
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
