package oop.excesice;

public class QuestionOne {
    public static void main(String[] args) {

        /*
         Create an object named student1. As following properties
         Name = “rahul”
         Age = 22
         Address = “kandy”
         */
        Student student = new Student("rahul", 22, "kandy");

        //Print his name using getter.
        System.out.println(student.getName());

        //Print his age using a getter.
        System.out.println(student.getAge());

        //Change his name using setter
        student.setName("kamal");

        //Print again using the getter.
        System.out.println(student.getName());

        //Print the length of his address.
        System.out.println(student.getAddress().length());

    }
}


//Write a class  to represent a student.
class Student {
    String name;
    int age;
    String address;

    //Create a constructor according to the above properties
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Add getters and setters to above properties methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
