// 6. Write a Java program to implement constructor overloading. 

class Box{
    double height, width, depth;
    Box(){
        height = width = depth = 10;
    }

    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box(double value){
        height = width = depth = value;
    }

    double volume(){
        return height*width*depth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args){
        Box b1 = new Box();
        double result = b1.volume();
        System.out.println("> Volume of Box: " + result);
        Box b2 = new Box(15);
        result = b2.volume();
        System.out.println("> Volume of Box: " + result);
        Box b3 = new Box(10, 15, 8);
        result = b3.volume();
        System.out.println("> Volume of Box: " + result);
    }
}
