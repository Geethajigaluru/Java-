public class If_else_if {
    public static void main(String[] args){
        int x=5;
        int y=7;
        int z=9;
        if (x>y && x>z){
            System.out.println(x);
        }
        else if (y>x && y>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    
    }
}
//Q1 Student Grade
public class If_else_if{
    public static void main(String[] args){
        int marks=78;
        if (marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=75){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }
    }
}

//Q2 Largest Number
public class If_else_if{
    public static void main(String[] args){
        int a =25;
        int b =40;
        if (a>b){
            System.out.println("a is greater");
        }
        else if(b>a){
            System.out.println("b is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}

//Q3 Age category
public class If_else_if{
    public static void main(String[] arga){
        int age=16;
        if(age<13){
            System.out.println("Child");
        }
        else if(age==13 && age<=19){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }
    }
}
//Q4 Traffic signal
public class If_else_if{
    public static void main(String[] args){
        String signal="Yellow";
        if (signal.equals("Red")){
            System.out.println("Stop");
        }
        else if(signal.equals("Yellow")){
            System.out.println("Get Ready");
        }
        else if(signal.equals("Green")){
            System.out.println("Go");
        }
        else{
            System.out.println("Invalid Signal");
        }
    }
}

//Q5 Number check
public class If_else_if{
    public static void main(String[] args){
        int num=0;
        if (num>0)
            System.out.println("Positive");
        else if(num<0)
            System.out.println("Negative");
        else{
            System.out.println("Zero");
        }
    }
}