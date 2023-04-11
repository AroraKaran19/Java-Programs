// 12. Write a Java program to implement interface. Create an interface named shape having
//     area () & perimeter () as its methods. Create three classes circle, rectangle & square
//     that implement this interface.

interface Shape
{
    void input();
    void area();
}
class Circle implements Shape
{
    int radius = 0;
    double pi = 3.14, area = 0;
    public void input()
    {
        radius = 5;
    }
    public void area()
    {
        area = pi * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Circle
{
    int l = 0, b = 0;
    double area;
    public void input()
    {
        super.input();
        l = 6;
        b = 4;
    }
    public void area()
    {
        super.area();
        area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeInterfaceImplementation {
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        obj.input();
        obj.area();
    }
}
