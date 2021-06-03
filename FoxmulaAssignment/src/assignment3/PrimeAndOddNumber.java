
package assignment3.questions;

import java.util.*;
import assignment3.primeAndOdd.primeAndOdd;

public class PrimeAndOddNumber {
    public static void main(String []args){
        primeAndOdd number=new primeAndOdd();
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter a number :");
        number.setNumber(scan.nextInt());
        
        try{
          number.checkNumber();    
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        
    }
}
