
public class Abstract_demo {
 public static void main(String[] args){
 Horse h = new Horse();
 h.walk();
 h.eat();

 Chicken c = new Chicken();
 c.walk();
 c.eat();

 Mustang myHorse = new Mustang();

 }     
}

abstract class Animal {
    String color;
    Animal(){
System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("Animal Eat's");
    }
    abstract void walk();
}

class Horse extends Animal {

    Horse() {
   System.out.println("horse constructor called"); 
    }
    
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horse {

     Mustang() {
        System.out.println("Mustang constructor called");
    }
    
}

class Chicken extends Animal {
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

