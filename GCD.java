package recursion;

import java.util.HashSet;
import java.util.*;
import java.util.Collections;
public class GCD {
    public static void main(String[] args)
    {
        HashSet<Integer> list=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int small=Math.min(x, y);
        for(int i=small;i>=1;i--)
        {
            if(x%i==0 && y%i==0)
            {
                 list.add(i);
            }
        }
             Object obj=Collections.max(list);
             System.out.println(obj);
               



    }
    
}
