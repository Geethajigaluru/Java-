//Q1
class student{
    String name;
    int marks;
}
public class practice5{
    public static void main(String[] args){
        student s1=new student();
        s1.name="Appu";
        s1.marks=98;
        System.out.println(s1.name);
        if(s1.marks>=90){
            System.out.println("Grade A");
        }
        else if(s1.marks>=75){
            System.out.println("Grade B");
        }
        else if(s1.marks>=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}

//Q2
public class practice5{
    public static void main(String[] args){
        int a=10;
        int b=25;
        int c=15;
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}

//Q3
public class practice5{
    public static void main(String[] args){
        int i=1;
        int even=0;
        int odd=0;
        while(i<=20){
            if(i%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
            i=i+1;
        }
System.out.println("Even numbers: "+even);
System.out.println("Odd numbers: "+odd);
    }
}
    
//Q4
class Employee{
    String name;
    int salary;
}
public class practice5{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.name="Veda";
        e1.salary=250000;
        System.out.println(e1.name);
        if(e1.salary>=50000){
            System.out.println("High salary");
        }
        else if(e1.salary>=30000){
            System.out.println("Average salary");
        }
        else{
            System.out.println("Low salary");
        }
    }
}

//Q5
class Number{
    int number;
}
public class practice5{
    public static void main(String[] args){
        Number n1=new Number();
        n1.number=25;
        if (n1.number > 0) {
            System.out.println("Positive");
        }
        else if (n1.number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        // Check even or odd
        if (n1.number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}