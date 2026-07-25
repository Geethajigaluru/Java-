public class while_loop {
    public static void main(String[] args){
        int i=1;
        while(i<=5){
            System.out.println("Hi "+i);
            int j=1;
            while(j<=3){
                System.out.println("Hello "+j);
                j++;
            }
            i++;
        }
    }
    }

//Q1 numbers frim 1 to 10
public class while_loop{
    public static void main(String[] args){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
    
//Q2 numbers from 10 to 1
public class while_loop{
    public static void main(String[] args){
        int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}

//Q3 even numbers 
public class while_loop{
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

//Q4 odd numbers
public class while_loop{
    public static void main(String[] args){
        int i=1;
        while(i<=19){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}

//Q5
public class while_loop{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=10){
            sum=sum+i;
            i++;

        }
        System.out.println("Sum= "+sum);
    }
}

//Q6 sum of all even numbers
public class while_loop{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=20){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum: "+sum);
        }
    }

//Q7
public class while_loop{
    public static void main(String[] args){
        int i =1;
        while(i<=10){
            System.out.println("7x "+i+" = "+(7*i));
            i++;
        }
    }
}

//Q8
public class while_loop{
    public static void main(String[] args){
        int i=1;
        while(i<=20){
            if(i%3==0){
                System.out.println(i);
            }
            i++;
        }
    }
}

