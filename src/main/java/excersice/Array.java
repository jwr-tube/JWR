package excersice;

public class Array {
    public static void main(String[] args) {

    }

    /**
     1.
        int[] marks = {0,73,20,12};
        a.Write a method to print the values of the following array
        b.Print the length of the array
     */
    static void printArray() {
        int[] marks = {0,73,20,12};

        System.out.println(marks[0]);//to print the first item
        System.out.println(marks[1]);//to print the second item
        System.out.println(marks[2]);//to print the third item
        System.out.println(marks[3]);//to print the fourth item
        System.out.println(marks.length);//to print the length
    }

    /**
     2.
        int[] marks = {0,73,20,12};
        Print the values of that array using a for loop
     */
    static void printArrayUsingForLoop() {
        int[] marks = {0,73,20,12};

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }

    /**
     3.
     int[] marks = {0,73,20,12};
     Print the values of that array using a while loop
     */
    static void printArrayUsingWhileLoop() {
        int[] marks = {0,73,20,12};

        int index = 0;
        while (index<marks.length){
            System.out.println(marks[index]);
            index++;
        }
    }

    /**
    4.
     int[] marks = {0,73,20,12};
     for(int i=0; i<=marks.length; i++){
        System.out.println(marks[i]);
     }
     What is wrong with the above code? Cannot run it.

     Answer:- there is not index match with (marks.length)
     */

    /**
     5.
     int[] marks = {10,73,20,12};
     Write a method to print the sum of this array.
     */
    static void sum() {
        int[] marks = {10,73,20,12};
        int sum = 0;
        for(int i=0; i<marks.length; i++){
            sum += marks[i];
        }
        System.out.println(sum);
    }

    /**
     6.
     int[] marks = {10,73,20,12};
     Write a method to print the average of this array.
     */
    static void average() {
        int[] marks = {10,73,20,12};
        double average = 0;
        for(int i=0; i<marks.length; i++){
            average += marks[i];
        }
        average = average/marks.length;
        System.out.println(average);
    }

    /**
     7.
     int[] numbers= {101,73,120,12,3,6,8};
        Find the minimum number of the  array
     */
    static void minimum() {
        int[] numbers = {101,73,120,12,3,6,8};
        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minNumber> numbers[i] ) {
                minNumber = numbers[i];
            }
        }
        System.out.println(minNumber);
    }

    /**
     8.
     int[] numbers= {101,73,120,12,3,6,8};
     Find the maximum number of the  array
     */
    static void maximum() {
        int[] numbers = {101, 73, 120, 12, 3, 6, 8};
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber= numbers[i];
            }
        }
        System.out.println(maxNumber);
    }

    /**
     9.Write a method to create a string type array to represent the week days. And print the values of the array
     */
    static void weekArrayWayOne() {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i=0; i<weekDays.length; i++){
            System.out.println(weekDays[i]);
        }
    }

    static void weekArrayWayTwo() {
        String[] weekDays = new String[7];
        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";
        for (int i=0; i<weekDays.length; i++){
            System.out.println(weekDays[i]);
        }
    }

    /**
     10.Do following things
     */
    static void task1(){
        //a.Define a string type array named names..
        System.out.println("a.Define a string type array named names..----------------------");
        String[] names = new String[10];
        names[0] = "Amal";
        names[1] = "Sanju";
        names[2] = "Mihiri";
        names[3] = "vinu";
        names[4] = "samantha";
        names[5] = "Dilum";
        names[6] = "Nimesh";
        names[7] = "Pasan";
        names[8] = "Rajapakshe";
        names[9] = "joe";

        //b.print the length of the names array
        System.out.println("b.print the length of the names array----------------------");
        System.out.println(names.length);

        //c.Print the names array
        System.out.println("c.Print the names array----------------------");
        for(int i= 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        //d.Replace the Amal with Nadun
        System.out.println("d.Replace the Amal with Nadun----------------------");
        names[0] = "Nadun";

        System.out.println("e.Print the names array and verify the change in (d)----------------------");
        //e.Print the names array and verify the change in (d)
        for(int i= 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("f.Change the positions of  Dilum and Mihiri(mihiri should in the dilum’s place and dilum should in the mihiri’s place)----------------------");
        //f.Change the positions of  Dilum and Mihiri(mihiri should in the dilum’s place and dilum should in the mihiri’s place)
        String temporary = names[5];
        names[5] = names[2];
        names[2] = temporary;

        //g.Print the names array and verify the change in (f)
        System.out.println("g.Print the names array and verify the change in (f)----------------------");
        for(int i= 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        //h.Print the length of the each names
        System.out.println("h.Print the length of the each names----------------------");
        for(int i= 0; i< names.length; i++){
            System.out.println("name: "+names[i]+", name length :"+names[i].length());
        }

        //i.Define an int type array named nameLength.(length should be same length of names array)
        System.out.println("i.Define an int type array named nameLength.(length should be same length of names array)");
        int[] nameLength = new int[names.length];

        //j.Add the lengths of each name into the nameLength array.
        System.out.println("j.Add the lengths of each name into the nameLength array.");
        for(int i= 0; i< names.length; i++){
            nameLength[i] = names[i].length();
        }

        //k.Print the nameLength array.
        System.out.println("k.Print the nameLength array.");
        for(int i= 0; i< nameLength.length; i++){
            System.out.println(nameLength[i]);
        }
    }

    /**
     * 11.Do following things
     */
    static void task2(){
        //a.Define a string type array named names to represent the following names. Length of the array should be the count of the following names.
        String[] names = new String[5];
        names[0] = "Dumal";
        names[1] = "Joe";
        names[2] = "Samarasekara";
        names[3] = "Ponnamperuma";
        names[4] = "Pavi";

        //b.Print the length of the names array
        System.out.println(names.length);

        //c.Find the shortest name.
        String shortestName = findShortestName(names);
        System.out.println(shortestName);
    }

    static String findShortestName(String[] names) {
        String shortestName = names[0];
        for (int i = 0; i < names.length; i++) {
            if (shortestName.length() > names[i].length()) {
                shortestName = names[i];
            }
        }
        return shortestName;
    }


}
