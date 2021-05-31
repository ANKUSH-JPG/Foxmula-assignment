
package assignment2.questions;

/*
using package set to use set operations
*/

import assignment2.set.set;
import java.util.*;

public class q2set {
    public static void main(String args[])
    {
        set set1=new set();
        Scanner read=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1.Add  \t2.Find \t3.Exit");
            int choice=read.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter number :");
                    int value=read.nextInt();
                    set1.addData(value);
                    break;
                case 2:
                    System.out.println("Enter key :");
                    int key=read.nextInt();
                    set1.find(key);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
