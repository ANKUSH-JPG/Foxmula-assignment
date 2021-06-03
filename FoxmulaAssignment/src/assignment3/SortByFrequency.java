
package assignment3.questions;

import assignment3.array.array;
import java.util.*;

public class SortByFrequency {
    public static void main(String []args){
        array array1=new array(10);
        
        array1.addToArray();
        
        TreeMap<Integer,ArrayList<Integer>> tm=array1.sortByFrequency();
        
        System.out.println(tm);
        
    }
}
