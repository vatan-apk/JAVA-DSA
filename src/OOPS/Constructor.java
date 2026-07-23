package oops;

public class Constructor{
public static void main(String[] args) {
   
    Student s1 = new Student();
    s1.roll = 420;
    s1.name="vatan";
    s1.password = "abx";
    // Student s2 = new Student(s1);
    //s2.password = "xyz";
    s1.marks[0]= 100;
    s1.marks[1]=90;
    s1.marks[2]=80;

    Student s2 = new Student(s1);
    s2.password = "xyz";
    s1.marks[2]=100;
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }
}
 
}  

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        } 
    }

    // Student(Student s1){
    //     this.roll=s1.roll;
    //     this.name=s1.name;
        
    // }
    
    Student(){
       // this.name= name;
       marks = new int[3];
       System.out.println("constructor is called...");
    }
    Student(String name){
        this.name = name;
        System.out.println(name);
    }
 
    Student(int roll) {
        
        this.roll = roll;
        System.out.println(roll);
    }
    
}
  

