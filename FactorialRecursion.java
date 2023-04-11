// 2. Write a Java program to find out factorial of a number through recursion.
public class FactorialRecursion {
    public static void main(String[] args){
        int i = 10;
        int result = Factorial(i);
        System.out.println("The Factorial of "+i+":"+" "+result);
    }

    static int Factorial(int no){
        if (no == 0 || no == 1){
            return 1;
        }
        else{
            return no*Factorial(no-1);
        }
    }
}
