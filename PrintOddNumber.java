// 1. Write a Java program to print all odd numbers between 1 to 10
class PrintOddNumber{
    public static void main(String[] args){
        int i;
        for (i = 1 ; i <= 10 ; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}