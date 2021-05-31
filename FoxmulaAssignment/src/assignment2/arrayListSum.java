
package assignment2.arrayListSum;

/*
  to find a pair in the arraylist whose sum value is equal to value of k 
*/

import java.util.*;
public class arrayListSum {
    private ArrayList<Integer> arr=new ArrayList<Integer>();
    
    public void addData(int value){
        arr.add(value);
    }
    
    public void sum(int k){
        Collections.sort(arr);
        
        int i=0;
        int j=arr.size()-1;
        
        while(i<j)
        {
            if(arr.get(i)+arr.get(j)==k){
                //found
                System.out.println(arr.get(i)+"+"+arr.get(j)+"="+k);
                j--;
            }
            else if(arr.get(i)+arr.get(j)>k)
            {
                //decrement j
                j--;
            }
            else
            {
                //increment i
                i++;
            }
        }
    }
}
