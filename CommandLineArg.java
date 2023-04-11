// 3. Write a Java program to accept command line arguments & print them.
public class CommandLineArg {
    public static void main(String[] args){
        int i;
        for(i = 0 ; i < args.length ; i++){
            System.out.print(args[i]+" ");
        }
    }
}