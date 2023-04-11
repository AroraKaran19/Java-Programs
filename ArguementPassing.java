// 8. Write a Java program to show call by value & call by reference.

class CallByValue{
    void swap(int a, int b){
        System.out.println("(!) Before Swapping: " + a + ' ' + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("(!) After Swapping: " + a + ' ' + b);
    }
}

class CallByReference{
    int a, b;
    CallByReference(int a, int b){
        this.a = a;
        this.b = b;
    }

    void swap(CallByReference obj){
        System.out.println("(!) Before Swapping: " + obj.a + ' ' + obj.b);
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("(!) After Swapping: " + obj.a + ' ' + obj.b);
    }
}

public class ArguementPassing {
    public static void main(String[] args){
        CallByValue obj1 = new CallByValue();
        obj1.swap(10, 5);
        CallByReference obj2 = new CallByReference(14, 12);
        obj2.swap(obj2);
    }
}
