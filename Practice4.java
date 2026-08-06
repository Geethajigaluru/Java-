//Q1
class Student{
    String name;
    int marks;
}
public class Practice4{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Geetha";
        s1.marks=98;
        System.out.println("Name: "+s1.name);
        System.out.println("Marks: "+s1.marks);
        if(s1.marks>=90){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Grade B");
        }
        }
    }

//Q2
class Rectangle{
    int length;
    int width;
}
public class Practice4{
    public static void main(String[] args){
        Rectangle a=new Rectangle();
        a.length=5;
        a.width=6;
        int area=a.length*a.width;
        System.out.println("Area: "+area);
    if(area>100){
        System.out.println("Large Rectangle");
    }
    else{
        System.out.println("Small Rectangle");
    }
}
}

//Q3
class Employee{
    String name;
    int salary;
}
public class Practice4{
    public static void main(String[] args){
        Employee e=new Employee();
        e.name="Geetha";
        e.salary=1500000;
        int bonus=0;
        if(e.salary>50000){
            bonus=e.salary+5000;
        }
        System.out.println("Employee: "+e.name);
        System.out.println("Updated Salary: "+bonus);
    }
}
    
//Q4
class Number{
    int limit;
}
public class Practice4{
    public static void main(String[] args){
        Number n1=new Number();
        n1.limit=20;
        for(int i=2;i<=n1.limit;i+=2){
            System.out.println(i);
        }
    }
}

//Q5
class Table{
    int number;
}
public class Practice4{
    public static void main(String[] args){
        Table t=new Table();
        t.number=7;
        for(int i=1;i<=10;i++){
            System.out.println(t.number+"x"+i+"="+(t.number*i));
        }
    }
}