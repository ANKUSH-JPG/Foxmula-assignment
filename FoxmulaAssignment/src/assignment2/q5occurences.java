
package assignment2.questions;

import java.util.*;
import assignment2.arrayList.arrayList;

public class q5occurences {
    public static void main(String []args)
    {
        
        arrayList array1=new arrayList();
        Scanner read=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1.Add  \t2.Occurences \t3.Exit");
            int choice=read.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter number :");
                    int value=read.nextInt();
                    array1.addData(value);
                    break;
                case 2:
                    System.out.println("Occurences:");
                    array1.occurences();
                    break;
                default:
                    System.exit(0);
            }
        } 
    }
}
