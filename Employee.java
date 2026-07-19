class Employee{
    int ID;
    String name;
    double salary;

    void display(){
        System.out.println("Employee ID: "+ID);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args){
        Employee e=new Employee();
        e.ID=24;
        e.name="Geetha";
        e.salary=1500000;
        e.display();
    }
}
