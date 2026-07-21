//Q1 Even or odd
public class Ternary_Operator {
    public static void main(String[] args){
        int num=24;
        String result=(num%2==0) ? "Even":"Odd";
          System.out.println(result);
    }
}

//Q2 Eligible to vote
public class Ternary_Operator{
    public static void main(String[] args){
        int age=16;
        String Vote=(age>=18)? "Eligible":"Not Eligible";
        System.out.println(Vote);
    }
}

//Q3 Largest Number
public class Ternary_Operator{
    public static void main(String[] args){
        int a =35;
        int b=18;
        String greatest=(a>b)? "a is greater":"b is greater";
        System.out.println(greatest);
    }
}
//Q4 Pass or Fail
public class Ternary_Operator{
    public static void main(String[] args){
        int marks=40;
        String result=(marks>=40)?"Pass":"Fail";
        System.out.println(result);
    }
}

//Q5 Positive or Negative
public class Ternary_Operator{
    public static void main(String[] args){
        int num=-10;
        String number=(num>0)?"Positive":"Negative";
        System.out.println(number);
    }
}
