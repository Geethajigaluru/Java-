//Q1
class Student{
    String name;
    int age;
}
public class Main2 {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Veda";
        s1.age=8;
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}

//Q2
class Star{
    String name;
}
public class Main2{
    public static void main(String[] args){
        Star s1=new Star();
        s1.name="Mrugashira";
        System.out.println(s1.name);
        for(int i=1;i<=5;i++){
            System.out.print("*");
        }
    }
}
    
//Q3
class Counter{
    int number;
}
public class Main2{
    public static void main(String[] args){
        Counter c1=new Counter();
        c1.number=5;
        int i=1;
        while(i<=c1.number){
            System.out.println(i);
            i=i+1;
        }
    }
}
    

//Q4
class Table{
    int number;
}
public class Main2{
    public static void main(String[] args){
        Table t=new Table();
        t.number=7;
        for(int i=1;i<=10;i++){
            System.out.println(t.number+"x"+i+"="+(t.number*i));
        }
    }
}
    
//Q5
class Rectangle{
    int rows;
    int columns;
}
public class Main2{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        r1.rows=4;
        r1.columns=6;
        for(int i=1;i<=r1.rows;i++){
            for(int j=1;j<=r1.columns;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    
//Q6
class Triangle{
    int rows;
}
public class Main2{
    public static void main(String[] args){
        Triangle t1=new Triangle();
        t1.rows=5;
        for(int i=1;i<=t1.rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        
    }
}