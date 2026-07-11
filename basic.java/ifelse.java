import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;
        System.out.println("Enter your age : ");
        age=in.nextInt();
        in.nextLine();
        System.out.println("Enter your name : ");
        name= in.nextLine();
        System.out.println("you are a student ?");
        isStudent= in.nextBoolean();
        if(name.isEmpty()){
            System.out.println("he is a gay");
        }else{
            System.out.println("he is a male / female");
        }
        if(age>=18){
            System.out.println("he is an  adult");
        }else if(age<18){
            System.out.println("he is an child");
        }else{
            System.out.println("not born yet!!");
        }
        if(isStudent){
            System.out.println("you are a student !!");
        }else{
            System.out.println("you are not an student !!");
        }
    }
}
