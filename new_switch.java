public class new_switch{
    public static void main(String[] args){
        String day="Monday";
        switch(day){
            case "Satuarday","Sunday"->System.out.println("6 AM");
            
            case "Monday"->System.out.println("8 AM");
                
            default->System.out.println("7 AM");
                
        }
    }
} 
public class new_switch{
    public static void main(String[] args){
        String month="May";
        String result="";
        switch(month){
            case "January","October"->result="Happy birthday";
            case "March","April"->result="Happy";
            case "May","November"->result="Happiest Birthday";
        }
        System.out.println(result);
    }
}