package oop.excesice;

public class QuestionTwo {
    public static void main(String[] args) {
        /*
        Create an objects by giving following name and following values
        Name = rectangle_1 , length =10, width = 8;
        Name = rectangle_2 , length =15, width = 12;
        Name = rectangle_3 , length =20, width = 10;
        Name = rectangle_4 , length =18, width = 15;
        Name = rectangle_5 , length =20, width = 8;
        */
        Rectangle rectangle_1 = new Rectangle(10, 8);
        Rectangle rectangle_2 = new Rectangle(15, 12);
        Rectangle rectangle_3 = new Rectangle(20, 10);
        Rectangle rectangle_4 = new Rectangle(18, 15);
        Rectangle rectangle_5 = new Rectangle(20, 8);

        /*
        Find the largest rectangle.
         */
        String[] names = {"rectangle_1", "rectangle_2", "rectangle_3", "rectangle_4", "rectangle_5"};

        double[] areas = new double[5];
        areas[0] = rectangle_1.getArea();
        areas[1] = rectangle_2.getArea();
        areas[2] = rectangle_3.getArea();
        areas[3] = rectangle_4.getArea();
        areas[4] = rectangle_5.getArea();

        String largestRectangleName = names[0];
        double largestRectangleSize = areas[0];
        for(int i= 0; i<areas.length; i++){
            if(largestRectangleSize<areas[i]){
                largestRectangleSize = areas[i];
                largestRectangleName = names[i];
            }
        }
        System.out.println(largestRectangleName);
    }
}

/*
 Create a class to represent square
    Name should be Rectangle
    There are properties named(should  be double data type)
    Length
    width
 */
class Rectangle {
    double length;
    double width;

    //Create a constructor to initialize above properties when creating the object.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /*
    Create a method to return the area of the given length and width.
    area = length*width
    */
    double getArea() {
        return length * width;
    }
}