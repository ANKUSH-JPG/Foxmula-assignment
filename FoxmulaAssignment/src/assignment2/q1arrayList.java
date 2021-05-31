
package assignment2.questions;

/*
importing package arrayList for basic array list operation
*/
import assignment2.arrayList.arrayList;
import java.util.*;

public class q1arrayList {
    public static void main(String args[])
    {
        arrayList array1=new arrayList();
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
                    array1.addData(value);
                    break;
                case 2:
                    System.out.println("Enter key :");
                    int key=read.nextInt();
                    array1.find(key);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
