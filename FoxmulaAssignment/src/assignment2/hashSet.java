
package assignment2.hashSet;

/**
 Implementation of hash set
 */

import java.util.*;
public class hashSet {
    private HashSet<Integer> hashset=new HashSet<Integer>();
    
    public void addData(int value){
        hashset.add(value);
    }
    
    public void traverse(){
        for(int i : hashset)
            System.out.println(i);
    }
}
