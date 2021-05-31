
package assignment2.set;

/*
Basic set operations
 */

import java.util.*;

public class set {
    private Set<Integer> set=new LinkedHashSet<>();
    
    public void addData(int value){
        set.add(value);
    }
    
    public void find(int key){
        if(set.contains(key))
            System.out.println("**** Key found in set **** ");
        else
            System.out.println("No key found !!!");
    }
}
