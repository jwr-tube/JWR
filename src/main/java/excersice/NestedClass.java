package excersice;

public class NestedClass {
    public static void main(String[] args) {

        /*
         Question 01
              Create an object of the faculty class
              Print the university name
              Print the faculty name
              Print the faculty id
         */
        University.Faculty faculty = new University("University Of Colombo", "01156284692").new Faculty("Medical", "10");
        faculty.printUniversity();//Print the university name
        System.out.println(faculty.getFacultyName());
        System.out.println(faculty.getFacultyId());
    }
}

/**
 Question 01
     Create a class as follows
         class name:- University
         properties
             universityName(string data type)
             universityPhone(string data type)
         Add getters and setters to above properties
         Add a constructor
     Create a method inner class as follows
         method inner class name:Faculty
         properties
             facultyName(string data type)
             facultyId (string data type)
         Add getters and setters to above properties
         Add a constructor
     Create an object of the faculty class
     Print the university name
     Print the faculty name
     Print the faculty id
 */

class University{
    private String universityName;
    private String universityPhone;

    //Add a constructor
    University(String universityName, String universityPhone){
        this.universityName = universityName;
        this.universityPhone = universityPhone;
    }

    //Add getters and setters to above properties
    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityPhone() {
        return universityPhone;
    }

    public void setUniversityPhone(String universityPhone) {
        this.universityPhone = universityPhone;
    }

    class Faculty{
        private String facultyName;
        private String facultyId;

        public Faculty(String facultyName, String facultyId) {
            this.facultyName = facultyName;
            this.facultyId = facultyId;
        }

        public String getFacultyName() {
            return facultyName;
        }

        public void setFacultyName(String facultyName) {
            this.facultyName = facultyName;
        }

        public String getFacultyId() {
            return facultyId;
        }

        public void setFacultyId(String facultyId) {
            this.facultyId = facultyId;
        }

        //Add a method named printUniversity() to print university names inside the faculty.
        public void printUniversity(){
            System.out.println("University name: "+ universityName);
        }
    }
}

/*
Question 02
    Create a class named UniversityStudent
    Add a method named print() to print “I’m an university student”
    Extend this class using anonymous class  and override the print() method
    Override print method as “I’m an undergraduate student”
    Create an object of it. And call this method
 */
class UniversityStudent {
    public void print() {
        System.out.println("I’m an university student");
    }
}

class TestUniversityStudent {
    public static void main(String[] args) {
        /*
        Extend this class using anonymous class  and override the print() method
        Override print method as “I’m an undergraduate student”
         */
        UniversityStudent universityStudent = new UniversityStudent() {
            public void print() {
                System.out.println("I’m an undergraduate student");
            }
        };

        //Create an object of it. And call this method
        universityStudent.print();
    }
}

/*
Question 03
    Create an abstract named Student
    Add an abstract method named show()
    Extend this class using anonymous class  and override the print() method
    Override print method as “I’m an university student”
    Create an object of it. And call this method
 */
abstract class Student{
    public abstract void show();
}

class TestStudent{
    public static void main(String[] args) {
        /*
        Extend this class using anonymous class  and override the print() method
        Override print method as “I’m an university student
         */
        Student student = new Student() {
            @Override
            public void show() {
                System.out.println("I’m an university student");
            }
        };
        //Create an object of it. And call this method
        student.show();
    }
}

/*
Question 04
    Implement the runnable interface using anonymous class and create a object.
    Override the run method to print the “This is an anonymous class of runnable interface.”
 */
class Questions4{
    public static void main(String[] args) {
        //Implement the runnable interface using anonymous class and create a object.
        Runnable myThread = new Runnable() {

            //Implement the runnable interface using anonymous class and create a object.
            @Override
            public void run() {
                System.out.println("This is an anonymous class of runnable interface");
            }
        };
    }
}

/*
Question 05
    Create a method named calculate()
    Create an int variable  named summary and assign 0 for it as initial value.
    Create a class named Calculator inside the calculator() method
    Create a method to add given two int numbers named add()
    Inside the add method, assign the result(addition of the two numbers) to the summary
    Could you be able to assign it without any problem? If there any problem when assigning the value, find the reason for it in internet
 */
//class Questions5{
//
//    //Create a method named calculate()
//    public void calculate(){
//
//        //Create an int variable named summary and assign 0 for it as initial value.
//        int summary = 0;
//
//        //Create a class named Calculator inside the calculator() method
//        class Calculator{
//            //Create a method to add given two int numbers named add()
//            public int add(int number1, int number2){
//                summary = number1+number2;
//                return summary;//there is a compile error? why? find and learn
//            }
//        }
//
//    }
//}


/*
    Create a class named Company
    Create a static String field named companyName and assign “JWR” as the value
    Create a static nested class named Department
    Create a field in the Department, named departmentName and assign “finance” as the value
    Create an static method named advertisement() to print “Few vacancies are available”
    Create a non-static method named show() to print “Today will close at 8 pm”
    Call the advertisement() method and print the value
    Call the show() method and print the value.
    Can access companyName  from advertisement() ?
    Can access companyName  from show() ?
    Can access departmentName  from advertisement() ?
    Can access departmentName  from show() ?
 */

//Create a class named Company
class Company{
    //Create a static String field named companyName and assign “JWR” as the value
    static String companyName = "JWR";

    //Create a static nested class named Department
    static class Department{
        //Create a field in the Department, named departmentName and assign “finance” as the value
        static String departmentName = "finance";

        //Create an static method named advertisement() to print “Few vacancies are available”
        public static void advertisement(){
            System.out.println("Few vacancies are available");
        }

        //Create a non-static method named show() to print “Today will close at 8 pm”
        public void show(){
            System.out.println("Today will close at 8 pm");
        }
    }

    public static void main(String[] args) {
        //Call the advertisement() method and print the value
        Company.Department.advertisement();

        //Call the show() method and print the value.
        Company.Department department = new Company.Department();
        department.show();
    }
}