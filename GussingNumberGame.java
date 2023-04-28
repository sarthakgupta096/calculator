
import java.util.*;
public class GussingNumber {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
           int max=0;
           int min=50;
          double ran=(int)(Math.random()*(max-min+1)+min);
          while(true)
          {
             System.out.println("enter the no");
             int n=sc.nextInt();
             if(n>ran)
             {
                System.out.println("try small no-------------");
             }
             else if(n<ran)
             System.out.println("try larger no---------------");
             else if(n==ran)
             {
             System.out.println("Congrulation-----------------"); 
               break;
             } 
            }
    }
}
