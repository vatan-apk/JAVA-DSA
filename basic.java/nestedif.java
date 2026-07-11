public class nestedif {
    public static void main(String[] args) {
        boolean isStudent=false;
        boolean isSenior=false;
        double price=9.99;
        if(isStudent){
            if(isSenior){
            System.out.println("You got 10% discount ");
            System.out.println("You got 20% discount ");
            price*=0.7;
            }
            else{
            System.out.println("You got 10% discount ");
            price*=0.9;
            }
            
            
        }else{
            if(isSenior){
                System.out.println("You get a  senior discount of 20%");
                price*=0.8;
            }else{
                System.out.println("you are neither");
                price*=1;

            }

        }
        System.out.println("your total discount is :$"+price);
    }
}
