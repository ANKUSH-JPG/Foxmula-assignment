
package assignment2.questions;

/*
using class hashSet to implement basic hashset
 */

import java.util.*;
import assignment2.hashSet.hashSet;

public class q3hashSet {
    public static void main(String []args){
        hashSet hs=new hashSet();
        Scanner read=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1.Add  \t2.traverse \t3.Exit");
            int choice=read.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter number :");
                    int value=read.nextInt();
                    hs.addData(value);
                    break;
                case 2:
                    System.out.println("Traverse order :");
                    hs.traverse();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
