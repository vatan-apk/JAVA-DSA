public class interface_demo {
public static void main(String[] args) {
    
}
}
interface chessPlayes{
    void moves();
}

class queen implements chessPlayes{
    public  void moves(){
        System.out.println("up,dowm,left,right,diagonal");
    }
}

class Rock implements chessPlayes {
    public void moves(){
        System.out.println("up,down,right,left");
    }
}

class King implements chessPlayes {
    public void moves(){
        System.out.println("up,down,right,left");
    }
}