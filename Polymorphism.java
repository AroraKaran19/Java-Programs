// 9. Write a Java program to implement method over ridding & method overloading.

class Example{
    int f;
    Example(int no){
        f = no;
    }

    void printing(){
        System.out.println("Value in Example: " + f);
    }
}

class OverRidding extends Example{
    int a, b;
    OverRidding(int no1, int no2, int no3){
        super(no3);
        a = no1;
        b = no2;
    }

    void printing(){
        super.printing();
        System.out.println("Value in OverRidding: " + a + " " + b);
    }
}

class OverLoading{
    int a, b, c;
    OverLoading(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show(){
        System.out.println("A: " + a + " B: " + b + " C: " + c);
    }

    void show(OverLoading objs){
        System.out.println("A: " + objs.a + " B: " + objs.b + " C: " + objs.c);
    }
}

public class Polymorphism {
    public static void main(String[] args){
        OverRidding ob1 = new OverRidding(15, 10, 13);
        ob1.printing();
        System.out.println();
        OverLoading ob2 = new OverLoading(15, 10, 2);
        OverLoading ob3 = new OverLoading(5, 10, 15);
        ob3.show(ob2);
        ob3.show();
    }
}
