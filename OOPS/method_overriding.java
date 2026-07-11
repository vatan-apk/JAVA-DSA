public class method_overriding{
    public static void main(String[] args) {
        Animal sb = new Animal();
        // agar parent class ka function banayaengay toh 
        // parent class ka he function call karega
        sb.eat();
        sb.eat();
    }
}
class Animal {
void eat(){
    System.out.println("eats carbs");
}
}
class Deer extends Animal {
    void eat(){
        System.out.println("eats meat");
    }
}