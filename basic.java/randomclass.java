import java.util.Random;

public class randomclass {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
                int number2;
        int number1;

        number = random.nextInt(1,8);
                number1 = random.nextInt(1,8);
        number2 = random.nextInt(1,8);

System.out.println(number);
System.out.println(number1);
System.out.println(number2);

boolean ishead;
ishead= random.nextBoolean();
if(ishead){
    System.out.println("Head");
}else{
    System.out.println("False");
}
    }
}
