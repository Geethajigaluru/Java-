public class Switch {
    public static void main(String[] args){
        int n=5;
        switch (n) {
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
            case 7:
               System.out.println("Sunday"); 
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}

//Q1 Day of the week
public class Switch{
    public static void main(String[] args){
        int day=3;
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
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}

//Q2 Calculator
public class Switch{
    public static void main(String[] args){
        int a = 20;
        int b = 10;
        char operator = '+';
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
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
    
//Q3 Grade
public class Switch{
    public static void main(String[] args){
        char grade='B';
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }
    }
}

//Q4 Month Name
public class Switch{
    public static void main(String[] args){
        int month=8;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}

//Q5 Menu Selection
public class Switch{
    public static void main(String[] args){
        int choice=2;
        switch(choice){
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Pasta");
                break;
            case 4:
                System.out.println("Sandwich");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}

