public class for_loop {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            System.out.println("Hi "+i);
        }
    }
}
    
public class for_loop {
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            System.out.println("Hi "+i);
        }
    }
}
    
public class for_loop {
    public static void main(String[] args){
        for(int i=1;i<=5;i++)
        {
            System.out.println("DAY "+i);
            
            for(int j=1;j<=9;j++){
                System.out.println(" "+(j+8)+"-"+(j+9));
            }
        }

    }
}

//Q1
public class for_loop{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }}

//Q2
public class for_loop{
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println("Sum: "+sum);
    }
}

//Q3
public class for_loop{
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println(7+"x"+i+"="+(7*i));
        }
    }
}
    
//Q4
public class for_loop{
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}

//Q5
public class for_loop{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }