//Q1
public class practice1{
    public static void main(String[] args){
        System.out.println("Welcome to Java");
    }
}

//Q2
public class practice1{
    public static void main(String[] args){
        int age=20;
        System.out.println(age);
    }
}
   
//Q3
public class practice1{
    public static void main(String[] args){
        int a=15;
        int b=10;
        System.out.println("Sum: "+(a+b));
    }
}
    
//Q4
public class practice1{
    public static void main(String[] args){
        int a=8;
        System.out.println(a*a*a);
    }
}
    
//Q5
public class practice1{
    public static void main(String[] args){
        int a=25;
        int b=6;
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));
    }
}
    
//Q6
public class practice1{
    public static void main(String[] args){
        int num=18;
        if(num>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        }
    }

//Q7
public class practice1{
    public static void main(String[] args){
        int num=9;
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");

        }
        }
    }
        
//Q8
public class practice1{
    public static void main(String[] args){
        int a=45;
        int b=60;
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}

//Q9
public class practice1{
    public static void main(String[] args){
        int marks=82;
        if(marks>=90){
            System.out.println("Excellent");
        }
        else if(marks>=75){
            System.out.println("Good");
        }
        else if(marks>=50){
            System.out.println("Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}

//Q10
public class practice1{
    public static void main(String[] args){
        int day=4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satuarday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }
}

//Q11
public class practice1{
    public static void main(String[] args){
        int a=20;
        int b=5;
        char operator='*';

        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Operator");   
}

    }
}

//Q12
public class practice1{
    public static void main(String[] args){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}

//Q13
public class practice1{
    public static void main(String[] args){
        int i=20;
        while(i>=1){
            System.out.println(i); 
            i--;
        }
    }
}
    
//Q14
public class practice1{
    public static void main(String[] args){
        int i=2;
        while(i<=20){
            if(i%2==0){
                System.out.println(i);
            }
        i++;
        }
    }
}

//Q15
public class practice1{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum: "+sum);
    }
}
    
//Q16
public class practice1{
    public static void main(String[] args){
        int i=1;
        while(i<=10){
            System.out.println(7+"x"+i+"="+(7*i));
            i++;
        }
    }
}
