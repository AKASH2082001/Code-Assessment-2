/*1.We have to calculate the area of a rectangle, a square and a circle.
Create an abstract class 'Shape' with three abstract methods namely
'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side
and that of 'CircleArea' is its radius. Now create another class 'Area'
containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea'
for printing the area of rectangle, square and circle respectively.
Create an object of class 'Area' and call all the three methods*/

package com.harman.javaproject;

abstract class Shapes{
    abstract double getparameters();
}
class Rectangle extends Shapes
    {
        double length;
        double breadth;
        Rectangle(double length, double breadth)
        {
            this.length = length;
            this.breadth = breadth;
        }
        double getparameters()
        {
            return length * breadth;
        }
    }
    class Square extends Shapes
    {
        double side;
        Square(double side)
        {
            this.side = side;
        }
        double getparameters()
        {
            return side * side;
        }
    }
    class Circle extends Shapes
    {
        double radius;
        Circle(double radius)
        {
            this.radius = radius;
        }
        double getparameters()
        {
            return (22.0/7.0) * radius * radius;
        }
    }
    class Area {
    public static void main(String arg[]) {
        Rectangle recarea = new Rectangle(10, 2);
        Square sqrarea = new Square(4);
        Circle cirarea = new Circle(2);
        System.out.println("Rectangle Area : " + recarea.getparameters());
        System.out.println("Square Area : " + sqrarea.getparameters());
        System.out.println("Circle Area : " + cirarea.getparameters());
    }
}