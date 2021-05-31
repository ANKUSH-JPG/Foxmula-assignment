
package assignment2.treeSet;

import java.util.*;
public class treeSet {
    private TreeSet<Integer> treeset=new TreeSet<Integer>();
    
    public void addData(int value){
        treeset.add(value);
    }
    
    public void traverse(){
        for(int i : treeset)
            System.out.println(i);
    }
}
