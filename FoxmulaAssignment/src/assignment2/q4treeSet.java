
package assignment2.questions;


import java.util.*;
import assignment2.treeSet.treeSet;

public class q4treeSet {
    
    public static void main(String []args){
        treeSet ts=new treeSet();
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
                    ts.addData(value);
                    break;
                case 2:
                    System.out.println("Traverse order :");
                    ts.traverse();
                    break;
                default:
                    System.exit(0);
            }
        }
   }
}
