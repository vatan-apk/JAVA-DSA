public class oops{
public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());

    Bankaccount myAcc = new Bankaccount();
    myAcc.setPassword("gmail.com");

}

}  
  

class Pen{
  private   String color;
    
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
this.color= newColor;
    }
    void setTip(int Tip){
this.tip = Tip;
    }
}

class Bankaccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
    password=pwd;
    }
}