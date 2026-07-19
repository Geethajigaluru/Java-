// Q1 Sum and product
public class Operators{
    public static void main(String[] args){
        int a=12;
        int b=8;
        int sum=a+b;
        int product=a*b;
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
    }
} 

// Q2 Arithmetic operators
public class Operators{
    public static void main(String[] args){
        int num1=25;
        int num2=4;
        int addition=num1+num2;
        int subtraction=num1-num2;
        int multiplication=num1*num2;
        int division=num1/num2;
        int remainder=num1%num2;
        System.out.println("Addition: "+addition);
        System.out.println("Subtraction: "+subtraction);
        System.out.println("Multiplication: "+multiplication);
        System.out.println("Division: "+division);
        System.out.println("Remainder: "+remainder);
    }
}

// Q3 Assignment operator
public class Operators{
    public static void main(String[] args){
        int marks=50;
        marks+=20;
        System.out.println("marks: "+marks);
        marks-=10;
        System.out.println("marks: "+marks);
        marks*=4;
        System.out.println("marks: "+marks);
        marks/=2;
        System.out.println("marks: "+marks);
        marks %=6;
        System.out.println("marks: "+marks);
    }
}

//Q4 Calculate Total
public class Operators{
    public static void main(String[] args){
        int english=85;
        int maths=90;
        int science=80;
        int total=english+maths+science;
        System.out.println("Total: "+total);
        int average=english+maths+science/3;
        System.out.println("Average: "+average);
    }
}

//Q5 Area and perimeters
public class Operators{
    public static void main(String[] args){
        int length=15;
        int width=10;
        int area=length*width;
        int perimeter=2*(length+width);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}