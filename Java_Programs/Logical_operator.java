public class Logical_operator {
    public static void main(String[] args){
        int x=5;
        int y=7;
        int a=8;
        int b=2;
        boolean result1=a>b || x>y;
        boolean result2=a<b && x>y;
        boolean result3=a>b && x<y;
        boolean result4=a<b || x<y;
        boolean result5=a<=b && x>=y;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}


//Q1 AND operator
public class Logical_operator{
    public static void main(String[] args){
        int age=20;
        boolean hasID=true;
        if (age>=18 && hasID){ 
          System.out.println("Allowed");
        } else{
          System.out.println("Not allowed");
        }
    }
}
    
// Q2 OR Operator
public class Logical_operator{
    public static void main(String[] args){
        boolean isHoliday = false;
        boolean isSunday = true;
        if (isHoliday || isSunday){
            System.out.println("Enjoy your day!");
        }
        else{
            System.out.println("Go to work!");
        }
        }
    }

// Q3 Not operator
public class Logical_operator{
    public static void main(String[] args){
        boolean isRainy=false;
        if (!isRainy){
            System.out.println("Let's go for a walk.");
        }
        else{
            System.out.println("Stay at home");
        }
        }
    }

// Q4 Logical operator
public class Logical_operator{
    public static void main(String[] args){
        int marks=85;
        boolean attendance=true;
        if (marks>=40 && attendance){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
        }
        }
    }
