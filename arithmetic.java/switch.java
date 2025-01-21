
import java.util.*;
public class switch{

  public static void main (String args[]){

    // pie r2
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius:");
    
    int radius = sc.nextInt();  //nextFloat  nextDouble  nextString
    // Area of circle 
    float area = 3.14f* (radius * radius );
    // Area of Square
    // float area =  (radius * radius );

    System.out.println("Area of Circle is "+ area);


  }
}


