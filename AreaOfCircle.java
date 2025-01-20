import java.util.*;

public class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        area(num);
    }
    public static void area(int num){
        
        float AreaOfCircle=3.14f*(num*num);
        System.out.println(AreaOfCircle);
    
    }

} 




