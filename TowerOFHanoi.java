package recursion;

public class TowerOFHanoi {
    public static void hanoi(int n,String source,String helper,String destination)
    {
         if(n==1)
         {
            System.out.println("traverse  disk from "+n+ " from " +source+" to "+destination);
            return;
         }
         hanoi(n-1,source,destination,helper);
         System.out.println("traverse  disk from "+n+ " from " +source+" to "+destination);
         hanoi(n-1,helper,source,destination);
    }
     public static void main(String[] args)
     {
         int n=3;
         hanoi(n,"s","h","d");
     }
    
}
