package excersice;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

    }
}

/*
මෙම පාඩමේ ඉදලා  එක එක  ප්‍රශ්න වලට class එක බැගින් හදන්නම්.
එතකොට ඔයාට එකේ main method එක run කරාම ලේසියෙන්ම answers බලාගන්න පුළුවන්
 */

/*
1.Create a file named “my_first_file.txt” in any location.
    If creations success need to print ”success”
    If file already exists, need to print “this file already exists”

 */
class Question1 {
    public static void main(String[] args) {
        // import java.io.File කියන එක import වෙලා(import උන සෙට් එක බලන්න  )
        File file = new File("my_first_file.txt");//නම දෙන්න
        try {
            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
2.Do this
    Create a file named “my_second_file.txt” in any location.
    Delete the “my_second_file.txt.
 */
class Question2 {
    public static void main(String[] args) {
        //Create a file named “my_second_file.txt” in any location.
        File file = new File("my_second_file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Delete the “my_second_file.txt.
        if (file.delete()) {
            System.out.println("File Name :" + file.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}

/*
Write a program to print the following information of the “my_first_file.txt” file
    Name
    Absolute path
    Length
    file is writable or not
 */
class Question3{
    public static void main(String[] args) {
        File file = new File("my_first_file.txt");
        System.out.println("file name  :"+file.getName());
        System.out.println("absolute path :"+file.getAbsolutePath());
        System.out.println("size :"+ file.length());
        System.out.println("file is writable or not :"+file.canWrite());
    }
}

/*
FileWriter
 */

/*
1.Do this,
    Create a file named “my_first_write.txt”
    Write “hello world” in this file
    (make sure to close the file using close())
 */
class Question4 {
    public static void main(String[] args) {
        //this is the overriding way
        File file = new File("my_first_write.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello world");
            fileWriter.close();//close the file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Do this,
    Create a file named “my_first_write.txt”
    Write “java is funny” in the file in the above question
    Need to append that text in the file.
    (make sure to close the file using close()
 */
class Question5 {
    public static void main(String[] args) {

        File file = new File("my_first_write.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);//use true for append
            fileWriter.write("java is fun");
            fileWriter.close();//close the file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Scanner
 */

/*
Write a program to read “my_first_write.txt” using Scanner
 */

class Question6 {
    public static void main(String[] args) {

        File file = new File("my_first_write.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
FileReader
 */
/*
1.Write a program to read “my_first_write.txt” using FileReader
 */

class Question7{
    public static void main(String[] args) {
        File file = new File("my_first_file.txt");
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
FileOutputStream
*/

/*
Write a program to write the ‘b’ letter using fileoutputstream(ASCII for b =98)
 */
class Question8{
    public static void main(String[] args){
        try{
            FileOutputStream fileOutputStream =new FileOutputStream("sample.txt");
            fileOutputStream.write(98);
            fileOutputStream.close();
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}


/*
Do this
    Write a program to write the ‘b’ letter using fileoutputstream(ASCII for b =98)
    Write a program to write a string using fileoutputstream
 */
class Question9{
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
            String string = "Sample String";
            byte[] bytes = string.getBytes();//converting string into byte array
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

class Question10{
    public static void main(String args[]) {
        //to read an one character
        try {
            FileInputStream fileInputStream = new FileInputStream("sample.txt");
            int input = fileInputStream.read();
            System.out.print((char) input);
            fileInputStream.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }

        //to read the string
        try {
            FileInputStream fileInputStream = new FileInputStream("sample.txt");
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

class Question11{
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String sentence = "I like java";
        byte[] bytes = sentence.getBytes();
        bufferedOutputStream.write(bytes);//to write the sentence
        bufferedOutputStream.flush();//to flush the stream
        bufferedOutputStream.close();//first need to close bufferedOutputStream
        fileOutputStream.close();//then nee to close fileOutputStream
    }
}

class Question12{
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("sample.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


