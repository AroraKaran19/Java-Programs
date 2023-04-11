// 5. Write a Java program that creates a class accounts with following details:
//    Instance variables: ac_no., name, ac_name, balance
//    Methods: withdrawal (), deposit (), display ().use constructors to initialize members.

class Accounts{
    int ac_no;
    String name, ac_name;
    double balance;
    Accounts(int ac_no, String name, String ac_name, double balance){
        this.ac_no = ac_no;
        this.name = name;
        this.ac_name = ac_name;
        this.balance = balance;
    }

    void withdrawal(int worth){
        balance -= worth;
        System.out.println("(!) New Balance: "+balance + " (-" + worth + ')');
    }

    void deposit(int worth){
        balance += worth;
        System.out.println("(!) New Balance: "+balance + " (+" + worth + ')');
    }

    void display(){
        System.out.println("(!) Account Information (!)");
        System.out.println("Name: " + name + " Account_Number: " + ac_no + " Account_Name: " + ac_name + " Balance: " + balance);
    }
}

public class AccountDB {
    public static void main(String[] args){
        Accounts ac1 = new Accounts(101, "Rohan", "Savings", 10000);
        ac1.display();
        ac1.deposit(100);
        ac1.withdrawal(150);
    }
}
