// Method is a block of code used to perform a particular task.
/* 
//Q1
class methods{
    static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        checkEvenOdd(10);
    }
}

//Q2
class methods{
    static void greet(){
        System.out.println("Hello, Welcome to Java");
    }
    public static void main(String[] args){
        greet();
    }
}

//Q3
class methods{
    static int square(int n){
        return n*n;
    }
    public static void main(String[] args){
        int result=square(5);
        System.out.println(result);
    }
}
    
//Q4
class methods{
    static int largest(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
}
    public static void main(String[] args){
        int result=largest(25, 40);
        System.out.println(result);
        }
        }
*/

//Q5
class methods{
    static int sum(int n){
        int total=0;
        for(int i=1;i<=n;i++){
            total=total+i;
        }
        return total;
    }
    public static void main(String[] args){
        int result=sum(5);
        System.out.println(result);
    }
}