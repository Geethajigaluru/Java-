 //Q1
public class Practice2{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=50){
            if(i%2==0){
                sum=sum+i;
            }
            i=i+1;
        }
        System.out.println("Sum of even numbers: "+sum);
    }
}  

//Q2
public class Practice2{
    public static void main(String[] args){
        int[] numbers={5,-2,0,8,-7,4,0,9};
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                positive++;
            }
            else if(numbers[i]<0){
                negative++;
            }
            else{
                zero++;
            }  
        }
            System.out.println("Positive= "+positive);
            System.out.println("Negative= "+negative);
            System.out.println("Zero= "+zero);
            }
            }
            
      
//Q3
public class Practice2{
    public static void main(String[] args) {

        for(int i = 2; i <= 30; i++) {

            int count = 0;

            for(int j = 1; j <= i; j++) {

                if(i % j == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}

//Q4
public class Practice2{
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
  
//Q5
public class Practice2{
    public static void main(String[] args){
        int[] marks={78,95,62,88,91};
        int largest=marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i]>largest){
                largest=marks[i];
            }
        }
    System.out.println("Largest number: "+largest);

    }
}
    