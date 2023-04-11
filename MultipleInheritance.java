// 13. Write a Java program to show multiple inheritance

class Student{
    int rollNumber;
    void getNumber(int n){
        rollNumber = n;
    }
    void putNumber(){
        System.out.println("> Roll Number: " + rollNumber);
    }
}

class Test extends Student{
    float part1, part2;
    void getMarks(float m1, float m2){
        part1 = m1;
        part2 = m2;
    }

    void putMarks(){
        System.out.println("(!) Marks Obtained (!)");
        System.out.println("Part1: " + part1);
        System.out.println("Part2 " + part2);
    }
}

interface Sports {
    float sportWt = 6.0f;
    void putWt();
}

class Results extends Test implements Sports{
    float total;
    public void putWt(){
        System.out.println("Sports Wt: " + sportWt);
    }

    void display(){
        total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total Score: " + total);
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Results r = new Results();
        r.getNumber(56);
        r.getMarks(27.5f, 22.2f);
        r.display();
    }
}
