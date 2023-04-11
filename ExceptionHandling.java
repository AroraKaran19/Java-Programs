// 14. Write a Java program to implement exception handling. Use try, catch & finally.

public class ExceptionHandling {
    public static void main(String args[]){
    	try{
        	int num = 50/0;
    	}
    	catch(Exception e){
        	System.out.println("Something went wrong!");
    	}
    	finally{
        	System.out.println("Finally block!");
    	}
	}
}
