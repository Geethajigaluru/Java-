class Student{
    int age;
    String name;

    void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args){
        Student s=new Student();

        s.age=10;
        s.name="Geetha";
        s.display();
    }
}

