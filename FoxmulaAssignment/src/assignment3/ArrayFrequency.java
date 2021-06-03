
package assignment3.questions;


import assignment3.array.array;
import java.util.*;

public class ArrayFrequency {
    public static void main(String []args){
        array array1=new array(10);
        
        array1.addToArray();
        
        HashMap<Integer,Integer> result=array1.frequency();
        
        System.out.println(result);
       
    }
}
