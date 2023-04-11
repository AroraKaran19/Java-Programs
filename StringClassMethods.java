// 21. Write a Java program to demonstrate the use of equals(), trim() ,length() , substring(),
//     compareto() of string class

public class StringClassMethods {
    public static void main(String[] args) {
        String str1 = "    hello world   ";
        String str2 = "hello world";
        String str3 = "Hello World";
        String str4 = "world";
        
        // Using equals() method
        System.out.println("Using equals() method:");
        System.out.println(str2.equals(str3)); // false
        System.out.println(str2.equals(str4)); // true
        
        // Using trim() method
        System.out.println("\nUsing trim() method:");
        System.out.println(str1.trim()); // "hello world"
        
        // Using length() method
        System.out.println("\nUsing length() method:");
        System.out.println(str2.length()); // 11
        
        // Using substring() method
        System.out.println("\nUsing substring() method:");
        System.out.println(str2.substring(6));
        
        // Using compareTo() method
        System.out.println("\nUsing compareTo() method:");
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str3.compareTo(str2));
    }
}
