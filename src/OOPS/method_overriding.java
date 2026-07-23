package oops;

public class method_overriding{
    public static void main(String[] args) {
        AnimalDemo sb = new AnimalDemo();
        // agar parent class ka function banayaengay toh 
        // parent class ka he function call karega
        sb.eat();
        sb.eat();
    }
}
class AnimalDemo {
void eat(){
    System.out.println("eats carbs");
}
}
class Deer extends AnimalDemo {
    void eat(){
        System.out.println("eats meat");
    }
}