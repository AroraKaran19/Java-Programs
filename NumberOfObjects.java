// 7. Write a Java program to count the no. of objects created in a program.

class Example{
    static int count = 0;

    Example(){
        count++;
    }

    void Count_Objects(){
        System.out.println(count);
    }
}

public class NumberOfObjects {
    public static void main(String[] args){
        Example e1 = new Example();
        Example e2 = new Example();
        Example e3 = new Example();
        Example e4 = new Example();
        e1.Count_Objects();
    }
}
