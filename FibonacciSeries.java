// 4. Write a Java program to print fibonacci series.
public class FibonacciSeries {
    public static void main(String[] args){
        int no = 10;
        if (no == 0 || no == 1){
            System.out.print(no);
        }
        else{
            int prev = 0, prev1 = 1;
            System.out.print(prev + " " + prev1 + " ");
            int i, result;
            for(i = 1 ; i < 10 ; i++){
                result = prev + prev1;
                System.out.print(result+" ");
                prev = prev1;
                prev1 = result;
            }
        }
    }
}
