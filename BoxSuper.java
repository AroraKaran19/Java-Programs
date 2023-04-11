// 10. Create a class box having height, width, depth as the instance variables & calculate its
//     volume. Implement constructor overloading in it. Create a subclass named box_new
//     that has weight as an instance variable. Use super in the box_new class to initialize
//     members of the base class

class Box_new extends Box{
    int weight;
    Box_new(){
        super();
        weight = 15;
    }

    Box_new(int value){
        super(value);
        weight = value;
    }

    Box_new(int height, int width, int depth, int weight){
        super(height, width, depth);
        this.weight = weight;
    }

    double volume(){
        System.out.println("Weight: " + weight);
        return super.volume();
    }
}

class Box{
    int height, width, depth;
    Box(){
        height = width = depth = 15;
    }

    Box(int value){
        height = width = depth = value;
    }

    Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double volume(){
        return height*width*depth;
    }
}

public class BoxSuper {
    public static void main(String[] args){
        Box_new b1 = new Box_new(5);
        double result = b1.volume();
        System.out.println(result);
    }
}
