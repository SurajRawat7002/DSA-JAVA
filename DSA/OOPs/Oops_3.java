public class Oops_3 {
    public static void main(String[] args) {
        // ********************Basic syntax for constructor
        // Student s1=new Student("SurajRawat", 18);
        // System.out.println(s1.name);
        // System.out.println(s1.age);


        // ***************Different Types of Constructor
        Student s1=new Student();  //No parameter
        Student s2=new Student("Suraj Rawat"); // With only name parameter
        Student s3=new Student(18); // with only age parameter
        Student s4=new Student("Suraj Rawat", 18); // with both parameter
    }}

//Creating  a Class with Constructor

//  A constructor is called automatically when we create the object

class Student{
    String name;
    int age;

    // *******************Basic constructor
    // Student(){
    //     System.out.println("Constructor is called while oject creation....");
    // }

    // Student(String name, int age){    // Initializing values in name and age using constructor calling 
    //     this.name=name;
    //     this.age=age;
    // }


    //*************Three types of constructor 1. Without paramenter 2. with paramenter 3. copy constructor

    Student(){
        System.out.println("Constructor is called...");
    }

    Student(String name){
        this.name=name;
    }

    Student(int age){
        this.age=age;
    }

    Student(String name , int age){
        this.name=name;
        this.age=age;
    }

}