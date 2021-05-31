
package assignment2.questions;

/*
  importing class arrayListSum to find out the pair sum as k
*/

import java.util.*;
import assignment2.arrayListSum.arrayListSum;

public class q6arrayListSum {
    public static void main(String []args)
    {
        arrayListSum array1=new arrayListSum();
        Scanner read=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1.Add  \t2.Find Pair with sum \t3.Exit");
            int choice=read.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter number :");
                    int value=read.nextInt();
                    array1.addData(value);
                    break;
                case 2:
                    System.out.println("Enter sum :");
                    int key=read.nextInt();
                    array1.sum(key);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
