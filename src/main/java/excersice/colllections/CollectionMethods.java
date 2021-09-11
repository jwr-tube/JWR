package excersice.colllections;

import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        /*
        ඔයාට CollectionMethods class එකේ object එකක් හදාගෙන ඕනෙම method එකක් call කරන්න පුළුවන්.
        example එකක් විදියට question1() method එක call කරන විදිය දීල තියෙන්නේ
         */
        CollectionMethods collectionMethods = new CollectionMethods();
        collectionMethods.question30();
    }

    /*
    Question 1
        Create a Student type  arrayList named ‘studentList’
        Create  a student object named ‘student’ using Student class.
        Add this object to the array list.
        Print the size of the arraylist
     */
    private void question1() {
        //Create a Student type  arrayList named   ‘studentList’
        List<Student> studentList = new ArrayList<>();

        //Create  a student object named ‘student’ using Student class.
        Student student = new Student("kamal", 10);

        //Add this object to the array list.
        studentList.add(student);

        //Print the size of the arraylist
        int size = studentList.size();
        System.out.println(size);
    }

    /*
    Question 2
        Create a Student type  arrayList named ‘studentList1’
        Create a Student type  arrayList named ‘studentList2’
        Create student objects named ‘student1’, ‘student2’ using the Student class.
        Add them to the ‘studentList1’ array list.
        Print the size of the arraylist
        Add ‘studentList1’ arraylist to the ‘studentList2’.
     */
    private void question2() {
        //Create a Student type  arrayList named ‘studentList1’
        List<Student> studentList1 = new ArrayList<>();

        //Create a Student type  arrayList named ‘studentList2’
        List<Student> studentList2 = new ArrayList<>();

        //Create student objects named ‘student1’, ‘student2’ using the Student class.
        Student student1 = new Student("kamal", 10);
        Student student2 = new Student("namal", 12);

        //Add them to the ‘studentList1’ array list.
        studentList1.add(student1);
        studentList1.add(student2);

        //Print the size of the ‘studentList1’
        int size1 = studentList1.size();
        System.out.println(size1);

        //Print the size of the ‘studentList2’
        int size2 = studentList2.size();
        System.out.println(size2);

        //Add ‘studentList1’ arraylist to the ‘studentList2’.
        studentList2.addAll(studentList1);//use addAll() method
    }

    /*
    Question 3
        Create a Student type  arrayList named   ‘studentList’
        Create student objects named ‘student1’, ‘student2’ using the Student class.
        Add them to the ‘studentList’.
        Print the size of the ‘studentList’
        Clear the ‘studentList’
        Print the size of the ‘studentList’
     */
    private void question3() {
        //Create a Student type  arrayList named   ‘studentList’
        List<Student> studentList = new ArrayList<>();

        //Create student objects named ‘student1’, ‘student2’ using the Student class.
        Student student1 = new Student("kamal", 10);
        Student student2 = new Student("namal", 12);

        //Add them to the ‘studentList’ array list.
        studentList.add(student1);
        studentList.add(student2);

        //Print the size of the ‘studentList1’
        int size1 = studentList.size();
        System.out.println(size1);

        //Clear the ‘studentList’
        studentList.clear();//use clear method

        //Print the size of the ‘studentList1’
        int size2 = studentList.size();
        System.out.println(size2);
    }

    /*
    Question 4
        Create a String type  arrayList named   ‘nameList’
        Add “Amal”  to  the ‘studentList’.
        Add “Vimal”  to  the ‘studentList’.
        Check “Amal”  is in the ‘studentList’. If he is in the list will print true.
        Check “Vimal”  is in the ‘studentList’. If he is in the list will print true.
        Check “vimal”  is in the ‘studentList’. If he is in the list will print true.
     */
    private void question4() {
        //Create a String type  arrayList named   ‘nameList’
        List<String> nameList = new ArrayList<>();

        //Add “Amal”  to  the ‘‘nameList’’.
        nameList.add("Amal");

        //Add “Vimal”  to  the ‘‘nameList’’.
        nameList.add("Vimal");

        //Check “Amal”  is in the ‘‘nameList’’. If he is in the list will print true.
        boolean result1 = nameList.contains("Amal");
        System.out.println(result1);

        //Check “Vimal”  is in the ‘‘nameList’’. If he is in the list will print true.
        boolean result2 = nameList.contains("Vimal");
        System.out.println(result2);

        //Check “vimal”  is in the ‘‘nameList’’. If he is in the list will print true.
        boolean result3 = nameList.contains("vimal");
        System.out.println(result3);
    }

    /*
    Question 5
        Create a String type  arrayList named   ‘nameList’

        Add “Amal”  to  the ‘nameList’.
        Add “Vimal”  to  the ‘nameList’.
        Add “Shanu”  to  the ‘nameList’.
        Add “Dasuni”  to  the ‘nameList’
        Add “Chethini”  to  the ‘nameList’.
        Add “Vimalsha”  to  the ‘nameList’
        Check “Amal”, ”Vimal”, “Shanu” in the ‘nameList’
        Check “Amal”, ”Dilumi”, “Anju” in the ‘nameList’
        Check “amal”, ”vimal”, “shanu” in the ‘nameList’
     */
    private void question5() {
        //Create a String type  arrayList named   ‘nameList’
        List<String> nameList = new ArrayList<>();

        //Add “Amal”  to  the ‘nameList’.
        nameList.add("Amal");

        //Add “Vimal”  to  the ‘nameList’.
        nameList.add("Vimal");

        //Add “Shanu”  to  the ‘nameList’.
        nameList.add("Shanu");

        //Add “Dasuni”  to  the ‘nameList’
        nameList.add("Dasuni");

        //Check “Amal”, ”Vimal”, “Shanu” in the ‘nameList’
        List<String> nameList1 = new ArrayList<>();
        nameList1.add("Amal");
        nameList1.add("Vimal");
        nameList1.add("Shanu");
        boolean result1 = nameList.containsAll(nameList1);
        System.out.println(result1);

        //Check “Amal”, ”Dilumi”, “Anju” in the ‘nameList’
        List<String> nameList2 = new ArrayList<>();
        nameList2.add("Amal");
        nameList2.add("Dilumi");
        nameList2.add("Anju");
        boolean result2 = nameList.containsAll(nameList2);
        System.out.println(result2);

        //Check “amal”, ”vimal”, “shanu” in the ‘nameList’
        List<String> nameList3 = new ArrayList<>();
        nameList3.add("amal");
        nameList3.add("vimal");
        nameList3.add("shanu");
        boolean result3 = nameList.containsAll(nameList3);
        System.out.println(result3);
    }

    /*
    Question 6
        Create a String type  arrayList named   ‘nameList1’
        Add “Amal”  to  the ‘nameList1’.
        Add “Vimal”  to  the ‘nameList1’
        Create a String type  arrayList named   ‘nameList2’
        Add “Amal”  to  the ‘nameList2’.
        Add “Vimal”  to  the ‘nameList2’
        Create a String type  arrayList named   ‘nameList3’
        Add “Dasun”  to  the ‘nameList3’.
        Add “Kamil”  to  the ‘nameList3’
        Check  ‘nameList1’and ‘nameList2’ equals or not.
        Check  ‘nameList1’and ‘nameList3’ equals or not.
     */
    private void question6() {
        //Create a String type  arrayList named   ‘nameList1’
        List<String> nameList1 = new ArrayList<>();

        //Add “Amal”  to  the ‘nameList1’.
        //Add “Vimal”  to  the ‘nameList1’
        nameList1.add("Amal");
        nameList1.add("Vimal");

        //Create a String type  arrayList named   ‘nameList2’
        List<String> nameList2 = new ArrayList<>();

        //Add “Amal”  to  the ‘nameList2’.
        //Add “Vimal”  to  the ‘nameList2’
        nameList2.add("Amal");
        nameList2.add("Vimal");

        //Create a String type  arrayList named   ‘nameList3’
        List<String> nameList3 = new ArrayList<>();

        //Add “Dasun”  to  the ‘nameList3’.
        //Add “Kamil”  to  the ‘nameList3’
        nameList3.add("Dasun");
        nameList3.add("Kamil");

        //Check  ‘nameList1’and ‘nameList2’ equals or not.
        boolean result1 = nameList1.equals(nameList2);
        System.out.println(result1);

        //Check  ‘nameList1’and ‘nameList3’ equals or not.
        boolean result2 = nameList1.equals(nameList3);
        System.out.println(result2);
    }


    /*
    Question 7
        (Use above mentioned student class in the )
        Create a Student type  arrayList named   ‘studentList’
        Create  a student object named ‘student’ using Student class.
        Add this object to the ‘studentList’
        Print the hashcode of the ‘student’
        Print the hashcode of the ‘studentList’
     */
    private void question7() {
        //(Use above mentioned student class in the )
        //Create a Student type  arrayList named ‘studentList’
        List<Student> studentList = new ArrayList<>();

        //Create  a student object named ‘student’ using Student class.
        Student student = new Student("kamal", 10);

        //Add this object to the ‘studentList’
        studentList.add(student);

        //Print the hashcode of the ‘student’
        System.out.println(student.hashCode());

        //Print the hashcode of the ‘studentList’
        System.out.println(studentList.hashCode());
    }

    /*
    Question 8
        (Use above mentioned student class in the )
        Create a Student type  arrayList named   ‘studentList’
        Create  a student object named ‘student’ using Student class.
        Check ‘studentList’ is  empty.
        Add this ‘student’ to the ‘studentList’
        Check ‘studentList’ is  empty.
     */
    private void question8() {
        //(Use above mentioned student class in the )
        //Create a Student type  arrayList named ‘studentList’
        List<Student> studentList = new ArrayList<>();

        //Create  a student object named ‘student’ using Student class.
        Student student = new Student("kamal", 10);

        //Check ‘studentList’ is  empty.
        boolean result1 = studentList.isEmpty();
        System.out.println(result1);

        //Add this object to the ‘studentList’
        studentList.add(student);

        //Check ‘studentList’ is  empty.
        boolean result2 = studentList.isEmpty();
        System.out.println(result2);
    }

    /*
    Question 9
        Create a Student type  arrayList named   ‘studentList’
        Create student objects named, ‘student1’,‘student2’,‘student3’,‘student4’ using the Student class.
        Add them to the ‘studentList’.
        Print the student names using iterator
        Print the student names without using a loop(for loop, foreach)
     */
    private void question9() {
        //Create a Student type  arrayList named   ‘studentList’
        List<Student> studentList = new ArrayList<>();

        //Create student objects named ‘student1’,‘student2’,‘student3’,‘student4’ using the Student class.
        Student student1 = new Student("kamal", 10);
        Student student2 = new Student("Vimal", 12);
        Student student3 = new Student("Sumal", 32);
        Student student4 = new Student("Bimal", 52);

        //Add them to the ‘studentList’ array list.
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        //Print the student names using iterator
        Iterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            String name = student.getStudentName();
            System.out.println(name);
        }

        //Print the student names without using a loop(for loop, foreach)

        //1.for loop
        System.out.println("Pint the names using the for loop");
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i); //use get() to get an element in the array list
            String name = student.getStudentName();
            System.out.println(name);
        }

        //2.for each loop
        System.out.println("Pint the names using the for-each loop");
        for (Student student : studentList) {
            String name = student.getStudentName();
            System.out.println(name);
        }

        //3.while loop
        System.out.println("Pint the names using the while loop");
        int counter = 0;
        while (counter < studentList.size()) {
            Student student = studentList.get(counter); //use get() to get an element in the array list
            String name = student.getStudentName();
            System.out.println(name);
            counter++;
        }

        //4.do while loop
        System.out.println("Pint the names using the do while loop");
        int count = 0;
        do {
            Student student = studentList.get(count); //use get() to get an element in the array list
            String name = student.getStudentName();
            System.out.println(name);
            count++;
        } while (count < studentList.size());
    }

    /*
    Question 10
        Create a String ArrayList named ‘nameList’
        Add ‘One’ to ‘nameList’.
        Add ‘Two’ to ‘nameList’.
        Add ‘Three’ to ‘nameList’.
        Print the size
        Remove ‘Two’.
        Print the size
     */
    private void question10(){
        //Create a String ArrayList named ‘nameList’
        List<String> stringList = new ArrayList<>();

        //Add ‘One’ to ‘nameList’.
        stringList.add("One");

        //Add ‘Two’ to ‘nameList’.
        stringList.add("Two");

        //Add ‘Three’ to ‘nameList’.
        stringList.add("Three");

        //Print the size
        int size1 = stringList.size();
        System.out.println(size1);

        //Remove ‘Two’.
        stringList.remove("Two");

        //Print the size
        int size2 = stringList.size();
        System.out.println(size2);
    }

    /*
    Question11
    Create a String ArrayList named ‘nameList’
        Add ‘One’ to ‘nameList’.
        Add ‘Two’ to ‘nameList’.
        Add ‘Three’ to ‘nameList’.
        Add ‘Four’ to ‘nameList’.
        Add ‘Five’ to ‘nameList’.
        Print the size
        Remove ‘Two’,’Three’,‘four’.
        Print the size
     */
    private void question11(){
        //Create a String ArrayList named ‘nameList’
        List<String> stringList = new ArrayList<>();

        //Add ‘One’ to ‘nameList’.
        stringList.add("One");

        //Add ‘Two’ to ‘nameList’.
        stringList.add("Two");

        //Add ‘Three’ to ‘nameList’.
        stringList.add("Three");

        //Add ‘Four’ to ‘nameList’.
        stringList.add("Four");

        //Add ‘Five’ to ‘nameList’.
        stringList.add("Five");

        //Print the size
        int size1 = stringList.size();
        System.out.println(size1);

        //Remove ‘Two’,’Three’,‘four’.
        List<String> removeList = new ArrayList<>();
        removeList.add("Two");
        removeList.add("Three");
        removeList.add("Four");
        boolean result = stringList.removeAll(removeList);
        System.out.println(result);

        //Print the size
        int size2 = stringList.size();
        System.out.println(size2);
    }

    /*
    Question 12
        Create a String ArrayList named ‘nameList’
        Add ‘One’ to ‘nameList’.
        Add ‘Two’ to ‘nameList’.
        Add ‘Three’ to ‘nameList’.
        Convert it to String array
        Print the length
        Print the first item
     */
    private void question12(){
        //Create a String ArrayList named ‘nameList’
        List<String> stringList = new ArrayList<>();

        //Add ‘One’ to ‘nameList’.
        stringList.add("One");

        //Add ‘Two’ to ‘nameList’.
        stringList.add("Two");

        //Add ‘Three’ to ‘nameList’.
        stringList.add("Three");

        //Convert it to String array
        String[] strings = stringList.toArray(new String[]{});//use empty String array to represent the string output

        //Print the length
        System.out.println(strings.length);

        //Print the first item
        System.out.println(strings[0]);

    }

    /*
    -----------------ArrayList -------------------------------
     */

    /*
    Question 13
    Create a String type array list named nameList.
    Add following values to the nameList.
    Kalana
    Ruwan
    Nimal
    Print the size of the length of
    Print the first name
    Print the last name
     */
    private void question13(){
        //Create a String type array list named nameList.
        List<String> nameList = new ArrayList<>();

        //Add following values to the nameList.
        //Kalana
        //Ruwan
        //Nimal
        nameList.add("Kalana");
        nameList.add("Ruwan");
        nameList.add("Nimal");

        //Print the size of the length of
        System.out.println(nameList.size());

        //Print the first name
        String firstName = nameList.get(0);
        System.out.println(firstName);

        //Print the last name
        String lastName = nameList.get(nameList.size() -1);
        System.out.println(lastName);
    }

    /*
    Question 14
        Create a String type array list named nameList.
        Add following values to the nameList.
        Kalana
        Ruwan
        Nimal
        Print the size of the length of
        Print the elements using for loop
        Print the elements using iterator and while loop
     */
    private void question14(){
        //Create a String type array list named nameList.
        List<String> nameList = new ArrayList<>();

        //Add following values to the nameList.
        //Kalana
        //Ruwan
        //Nimal
        nameList.add("Kalana");
        nameList.add("Ruwan");
        nameList.add("Nimal");

        //Print the size of the length of
        System.out.println(nameList.size());

        //Print the elements using for loop
        System.out.println("print the list using for loop");
        for (int i =0; i< nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        //Print the elements using iterator and while loop
        System.out.println("print the list using for iterator");
        Iterator iterator = nameList.iterator();
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }

    /*
    Question 15
        Create a String type array list named townList.
        Add following values to the townList.
        Kataragama
        Galle
        Matara
        Ampara.
        Sort this List using Collections.sort()
     */
    private void question15(){
        //Create a String type array list named townList.
        List<String> townList = new ArrayList<>();

        //Add following values to the townList.
        //Kataragama
        //Galle
        //Matara
        //Ampara.
        townList.add("Kataragama");
        townList.add("Galle");
        townList.add("Matara");
        townList.add("Ampara");

        //Sort this List using Collections.sort()
        Collections.sort(townList);

        for (int i =0; i< townList.size(); i++) {
            System.out.println(townList.get(i));
        }
    }

    /*
    Question 16
        Create an Integer type arraylist named numberList.
        Add following values to the numberList.
        15, 16, 405, 1, 38
        Sort the values.
        Print the values
     */
    private void question16(){
        //Create an Integer type arraylist named numberList.
        List<Integer> numberList = new ArrayList<>();

        //Add following values to the numberList.
        //15, 16, 405, 1, 38
        numberList.add(15);
        numberList.add(16);
        numberList.add(405);
        numberList.add(38);

        //Sort the values.
        Collections.sort(numberList);

        //Print the values
        for (int i =0; i< numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }
    }


    /*
    Question 17
        Create a String type array list named nameList.
        Add following values to the nameList.
        Kalana
        Ruwan
        Nimal
        Convert this list to a string array named nameArray.
        Print the first item of the nameArray
     */

    private void question17() {
        //Create a String type array list named nameList.
        List<String> nameList = new ArrayList<>();

        //Add following values to the nameList.
        //Kalana
        //Ruwan
        //Nimal
        nameList.add("Kalana");
        nameList.add("Ruwan");
        nameList.add("Nimal");

        //Convert this list to a string array named nameArray.
        String[] nameArray = nameList.toArray(new String[0]);

        //Print the first item of the nameArray
        System.out.println(nameArray[0]);
    }

    /*
    Question 18
        Create a String type array named nameArray.
        Add following values to the nameArray.
        Kalana
        Ruwan
        Nimal
        Convert nameArrayto a list named nameList
     */
    private void question18(){

        //Create a String type array named nameArray.
        String[] nameArray = new String[3];

        //Add following values to the nameArray.
        //Kalana
        //Ruwan
        //Nimal
        nameArray[0] ="Kalana";
        nameArray[1] ="Ruwan";
        nameArray[2] ="Nimal";

        //Convert nameArray to a list named nameList
        List<String> nameList = Arrays.asList(nameArray);
    }

    /*
    Question 19
    Create a String type array named monthArray.
        Check if the monthArray is empty or not.
        Add following values.
        January
        February
        March
        April
        march
        Print the index of “April”
        Print the last index of “March”
        Add “May” as the fifth element in the monthArray.
        Print the monthArray.
        Get a sub list from February to April
        Print this sub array.
        Remove the second element.
        Remove “May”.
    */
    private void question19(){

    //Create a String type arraylist named monthArrayList.
        List<String> monthList = new ArrayList<>();

        //Check if the monthArrayList is empty or not.
        boolean isEmpty = monthList.isEmpty();
        System.out.println(isEmpty);

        //Add following values.
        //January
        //February
        //March
        //April
        //march
        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("march");

        //Print the index of “April”
        int index = monthList.indexOf("April");
        System.out.println(index);

        //Print the last index of “March”
        int lastIndex = monthList.lastIndexOf("March");
        System.out.println(lastIndex);

        //Add “May” as the fifth element in the monthArrayList.
        monthList.add(4, "May");

        //Print the monthArrayList.

        //1)using for loop
        System.out.println("---------------------------using for loop---------------------------");
        for (int i = 0; i<monthList.size(); i++){
            System.out.println(monthList.get(i));
        }
        //2)using for-each loop
        System.out.println("---------------------------using for-each loop---------------------------");
        for (String month:monthList) {
            System.out.println(month);
        }

        //3)using iterator and while loop
        System.out.println("---------------------------using iterator and while loop---------------------------");
        Iterator iterator = monthList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //4)using listIterator and while loop
        System.out.println("---------------------------using listIterator and while loop---------------------------");

        ListIterator listIterator = monthList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //Get a sub list from February to April
        List<String> sublist = monthList.subList(1,5);

        //Print this sub array.
        System.out.println("---------------------------printing the sublist---------------------------");
        for (String item: sublist) {
            System.out.println(item);
        }

        //Remove the second element..
        monthList.remove(2);

        //Remove “May”
        monthList.remove("May");


        for (String month: monthList) {
            System.out.println(month);
        }
    }

    /*
    Question 20
        Create an Integer type arraylist named numberList.
        Add following values
        1,2,3,4,5,6,7,8,9
        Create another Integer type arraylist named oddNumberList.
        Add following values.
        1,3,5,7,9
        Remove oddNumberLis from numberList
     */
    private void question20(){

        //Create an Integer type arraylist named numberList.
        List<Integer> numberList = new ArrayList<>();

        //Add following values
        //1,2,3,4,5,6,7,8,9
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);

        //Create another Integer type arraylist named oddNumberList.
        List<Integer> oddNumberList = new ArrayList<>();

        //Add following values.
        //1,3,5,7,9
        oddNumberList.add(1);
        oddNumberList.add(3);
        oddNumberList.add(5);
        oddNumberList.add(7);
        oddNumberList.add(9);

        //Remove oddNumberLis from numberList
        numberList.remove(oddNumberList);
    }


    /*
    Question 21
        Create an Integer type arraylist named number1.
        Add following values
        1,2,3,4
        Create an Integer type arraylist named number2.
        Add following values
        1,2,3,4
        Check equality of the number1 and number2
        Add 5 for  the number1.
        Check equality of the number1 and number2
     */

    private void question21(){
        //Create an Integer type arraylist named number1.
        List<Integer> number1 = new ArrayList<>();

        //Add following values
        //1,2,3,4
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);

        //Create an Integer type arraylist named number2.
        List<Integer> number2 = new ArrayList<>();

        //Add following values
        //1,2,3,4
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);

        //Check equality of the number1 and number2
        boolean result1 = number1.equals(number2);
        System.out.println(result1);

        //Add 5 for  the number1.
        number1.add(5);

        //Check equality of the number1 and number2
        boolean result2 = number1.equals(number2);
        System.out.println(result2);
    }


    /*
    Question 22
    Create a String type arraylist named fruits
    Add following things
    Banana
    Orange
    apple
    Print the arraylist
    Reverse the array list
    Print the arraylist
     */

    private void question22(){
        //Create a String type arraylist named fruits
        List<String> fruits = new ArrayList<>();

        //Add following things
        //Banana
        //Orange
        //apple
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("apple");

        //Print the arraylist
        System.out.println(fruits);

        //Reverse the array list
        Collections.reverse(fruits);

        //Print the arraylist
        System.out.println(fruits);
    }

    /*
    Question 22
        Create a String type linkedlist named counties
        Add following things
        Sri lanka
        India
        England
        Print it using an iterator.
     */
    private void question23(){
        //Create a String type linkedList named counties
        LinkedList<String> linkedList = new LinkedList<>();

        //Add following things
        //Sri lanka
        //India
        //England
        linkedList.add("Sri lanka");
        linkedList.add("India");
        linkedList.add("England");

        //Print it using an iterator.
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    /*
    Question 24
        Create a String type linkedlist named names
        Add following names
        Jagath
        Amal
        Kamani
        Add ‘Gihan’ as thes second element of the names
        Add ‘Avishka’ as the first name of the names
        Add ‘Binura’ as the last  name of the names
        Print the first element
        Print the last element
        Remove the first element
        Print the size
        Retrieve the first element
        Retrieve and remove the first element
        Print all elements
        Clear the names
     */
    private void question24(){
        //Create a String type linkedlist named names
        LinkedList<String> names = new LinkedList<>();

        //Add following names
        //Jagath
        //Amal
        //Kamani
        names.add("Jagath");
        names.add("Amal");
        names.add("Kamani");

        //Add ‘Gihan’ as the second element of the names
        names.add(1,"Gihan");

        //Add ‘Avishka’ as the first name of the names
        names.addFirst("Avishka");

        //Add ‘Binura’ as the last  name of the names
        names.addLast("Binura");


        //Print the first element
        String first = names.getFirst();
        System.out.println("First Name :"+first);

        String peek = names.peek();
        System.out.println("Peeked first element :"+ peek);

        //Print the last element
        String last = names.getLast();
        System.out.println("Last Name :"+last);

        //Remove the first element
        names.removeFirst();

        //Print the size
        System.out.println(names.size());

        //Retrieve the first element
        System.out.println(names.getFirst());

        //Retrieve and remove the first element
        names.poll();

        //Print all elements
        System.out.println(names);

        //Clear the names
        names.clear();

        System.out.println(names.size());
    }

    /*
    Question 25
        Create a set named namesSet.
        Add following values
        Anura
        Kamal
        Anura
        Janith
        Anura
        Print the size of the namesSet
     */
    private void question25(){
        //Create a set named namesSet.
        Set<String> nameSet = new HashSet<>();

        //Add following values
        //Anura
        //Kamal
        //Anura
        //Janith
        //Anura
        nameSet.add("Anura");
        nameSet.add("Kamal");
        nameSet.add("Anura");
        nameSet.add("Janith");
        nameSet.add("Anura");

        //Print the size of the namesSet
        System.out.println(nameSet.size());
    }

    /*
    Create a set named namesSet1
        Add following values to the namesSet1
        Kalana
        Amith
        Danushka
        Dilan
        Amalka
        Create a set named namesSet2
        Add following values to the namesSet2
        Kalana
        Amith
        Sathish
        koshitha
        Amalka
        Get the union of the two sets.
     */
    private void question26(){
        //Create a set named namesSet1
        Set<String> nameSet1 = new HashSet<>();

        //Add following values to the namesSet1
        //Kalana
        //Amith
        //Danushka
        //Dilan
        //Amalka
        nameSet1.add("Kalana");
        nameSet1.add("Amith");
        nameSet1.add("Danushka");
        nameSet1.add("Dilan");
        nameSet1.add("Amalka");

        //Create a set named namesSet2
        Set<String> nameSet2 = new HashSet<>();

        //Add following values to the namesSet2
        //Kalana
        //Amith
        //Sathish
        //koshitha
        //Amalka
        nameSet2.add("Kalana");
        nameSet2.add("Amith");
        nameSet2.add("Sathish");
        nameSet2.add("koshitha");
        nameSet2.add("Amalka");

        //Get the union of the two sets.
        Set<String> unionSet = new HashSet<>(nameSet1);
        unionSet.addAll(nameSet2);

        System.out.println(nameSet1);
        System.out.println(nameSet2);
        System.out.println(unionSet);
    }


    /*
    Question 27
        Create a set named namesSet1
        Add following values to the namesSet1
        Kalana
        Amith
        Danushka
        Dilan
        Amalka
        Create a set named namesSet2
        Add following values to the namesSet2
        Kalana
        Amith
        Sathish
        koshitha
        Amalka
        Get the intersection of the two sets.
     */
    private void question27(){
        //Create a set named namesSet1
        Set<String> nameSet1 = new HashSet<>();

        //Add following values to the namesSet1
        //Kalana
        //Amith
        //Danushka
        //Dilan
        //Amalka
        nameSet1.add("Kalana");
        nameSet1.add("Amith");
        nameSet1.add("Danushka");
        nameSet1.add("Dilan");
        nameSet1.add("Amalka");

        //Create a set named namesSet2
        Set<String> nameSet2 = new HashSet<>();

        //Add following values to the namesSet2
        //Kalana
        //Amith
        //Sathish
        //koshitha
        //Amalka
        nameSet2.add("Kalana");
        nameSet2.add("Amith");
        nameSet2.add("Sathish");
        nameSet2.add("koshitha");
        nameSet2.add("Amalka");

        //Get the intersection of the two sets.
        Set<String> intersectionSet = new HashSet<>(nameSet1);
        intersectionSet.retainAll(nameSet2);

        System.out.println(nameSet1);
        System.out.println(nameSet2);
        System.out.println(intersectionSet);
    }

    /*
    Question 28
        Create a set named namesSet1
        Add following values to the namesSet1
        Kalana
        Amith
        Danushka
        Dilan
        Amalka
        Create a set named namesSet2
        Add following values to the namesSet2
        Kalana
        Amith
        Sathish
        koshitha
        Amalka
        Get the difference of the two sets.
     */

    private void question28(){
        //Create a set named namesSet1
        Set<String> nameSet1 = new HashSet<>();

        //Add following values to the namesSet1
        //Kalana
        //Amith
        //Danushka
        //Dilan
        //Amalka
        nameSet1.add("Kalana");
        nameSet1.add("Amith");
        nameSet1.add("Danushka");
        nameSet1.add("Dilan");
        nameSet1.add("Amalka");

        //Create a set named namesSet2
        Set<String> nameSet2 = new HashSet<>();

        //Add following values to the namesSet2
        //Kalana
        //Amith
        //Sathish
        //koshitha
        //Amalka
        nameSet2.add("Kalana");
        nameSet2.add("Amith");
        nameSet2.add("Sathish");
        nameSet2.add("koshitha");
        nameSet2.add("Amalka");

        //Get the intersection of the two sets.
        Set<String> intersectionSet = new HashSet<>(nameSet1);
        intersectionSet.removeAll(nameSet2);

        System.out.println(nameSet1);
        System.out.println(nameSet2);
        System.out.println(intersectionSet);
    }

    /*
    Question 29
        Create a treeSet named nameTreeSet.
        Add the following  names.
        Zaheena
        Vinu
        Xavier
        Warun
        Amal
        Print and see(names will sorted in ascending order)
     */
    private void question29(){

        //Create a treeSet named nameTreeSet.
        Set<String> nameTreeSet = new TreeSet<>();

        //Add the following  names.
        //Zaheena
        //Vinu
        //Xavier
        //Warun
        //Amal
        nameTreeSet.add("Zaheena");
        nameTreeSet.add("Vinu");
        nameTreeSet.add("Xavier");
        nameTreeSet.add("Warun");
        nameTreeSet.add("Amal");

        //Print and see(names will sorted in ascending order)
        System.out.println(nameTreeSet);
    }

    /*
    Question 30
        Create a hashmap Map<String, Inger> type named people.
        Put following key value pairs(name and age)
        Name: Sanath, age: 50
        Name: Kamal, age: 26
        Name: Aruni , age: 20
        Get the age of aruni.
        Get the all names of the
        Pint the map
        Check that Disal in the map
        Replace the age of the Sanath from 50 to 35.
     */
    private void question30(){

        //Create a hashmap Map<String, Inger> type named people.
        Map<String, Integer> people = new HashMap<>();

        //Put following key value pairs(name and age)
        //Name: Sanath, age: 50
        //Name: Kamal, age: 26
        //Name: Aruni , age: 20
        people.put("Sanath",50);
        people.put("Kamal", 26);
        people.put("Aruni", 20);

        //Get the age of aruni.
        int aruni_age = people.get("Aruni");
        System.out.println("aruni age :"+aruni_age);

        //Get the all names of the map
        Set<String> keys = people.keySet();
        System.out.println("Keys in the map");
        System.out.println(keys);

        //Pint the map
        System.out.println("keys and values of the map");
        for (Map.Entry<String, Integer> map: people.entrySet()){
            System.out.println(map.getKey()+ " : "+ map.getValue());
        }

        //Check that Disal in the map
        boolean isPresent = people.containsKey("Disal");
        System.out.println("Is Disal present :"+isPresent);

        //Replace the age of the Sanath from 50 to 35.
        people.replace("Sanath", 50,35);

        int sanath_age = people.get("Sanath");
        System.out.println("sanath age :"+sanath_age);
    }

    /*
    Question 31
        Create a hashmap Map<String, Inger> type named people.
        Put following key value pairs(name and age)
        Name: Sanath, age: 50
        Name: Kamal, age: 26
        Name: Aruni , age: 20
        Print the map using the iterator
     */
    private void question31(){
        //Create a hashmap Map<String, Inger> type named people.
        Map<String, Integer> people = new HashMap<>();

        //Put following key value pairs(name and age)
        //Name: Sanath, age: 50
        //Name: Kamal, age: 26
        //Name: Aruni , age: 20
        people.put("Sanath",50);
        people.put("Kamal", 26);
        people.put("Aruni", 20);

        //Print the map using the iterator
        Set keySet = people.entrySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    /*
    Question 32
        Create a hashmap Map<String, Inger> type named people.
        Put following key value pairs(name and age)
        Name: Sanath, age: 50
        Name: Kamal, age: 26
        Name: Aruni , age: 20
        Print the map using the for-loop
     */
    private void question32(){
        //Create a hashmap Map<String, Inger> type named people.
        Map<String, Integer> people = new HashMap<>();

        //Put following key value pairs(name and age)
        //Name: Sanath, age: 50
        //Name: Kamal, age: 26
        //Name: Aruni , age: 20
        people.put("Sanath",50);
        people.put("Kamal", 26);
        people.put("Aruni", 20);

        //Print the map using the for loop
        for (Map.Entry<String,Integer> entry : people.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    /*
    Question 33
        Create a String type vector named notebook to store follwint notes.
        Add following notes to the notebook
        “Go to bank”
        “Do the homeworks”
        “Help to Mom”
        “Wash the clothes”
        “Ready to exam”
        Print the size of the notebook
        Print the capacity of the notebook
        Print the first note
        Replace the third note by “Help to Dad”
        Take the last three note  to a sublist(Vector) named eveningNotes
     */
    private void question33(){
        //Create a String type vector named notebook to store following notes.
        Vector<String> noteBook = new Vector<>();

        //Add following notes to the notebook
        //“Go to bank”
        //“Do the homeworks”
        //“Help to Mom”
        //“Wash the clothes”
        //“Ready to exam”
        noteBook.add("Go to bank");
        noteBook.add("Do the homeworks");
        noteBook.add("Help to Mom");
        noteBook.add("Wash the clothes");
        noteBook.add("Ready to exam");

        //Print the size of the notebook
        System.out.println(noteBook.size());

        //Print the capacity of the notebook
        System.out.println(noteBook.capacity());

        //Print the first note
        System.out.println(noteBook.firstElement());

        //Replace the third note by “Help to Dad”
        noteBook.set(2, "Help to Dad");

        //Take the last three note  to a sublist(Vector) named eveningNotes
        List<String> eveningNotes = noteBook.subList(noteBook.size() -3, noteBook.size());
        System.out.println(eveningNotes);
    }

    /*
    Question 34
        Create a stack named numbers
        Print that it is empty or not?
        Push following numbers.
        120
        136
        182
        103
        Print the top element in the stack.
        Do the pop operation
        Print the top element in the stack.
     */
    private void question34(){
        //Create a stack named numbers
        Stack<Integer> numbers = new Stack<>();

        //Print that it is empty or not?
        System.out.println(numbers.empty());

        //Push following numbers.
        //120
        //136
        //182
        //103
        numbers.push(120);
        numbers.push(136);
        numbers.push(182);
        numbers.push(103);

        //Print the top element in the stack.
        System.out.println(numbers.peek());

        //Do the pop operation
        numbers.pop();

        //Print the top element in the stack.
        System.out.println(numbers.peek());

        System.out.println(numbers);
    }
}

/*
Create a class as follows
    Class name: Student
    Properties: student name, age
    Add getters and setters
    Add a constructors
*/

class Student {
    private String studentName;
    private int age;

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
