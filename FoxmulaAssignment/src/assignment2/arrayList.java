
package assignment2.arrayList;

/*
Array lists to check the element is present or not
*/

import java.util.*;

public class arrayList {
    private ArrayList<Integer> arr=new ArrayList<Integer>();
    
    public void addData(int value){
        arr.add(value);
    }
    
    public void find(int key){
        if(arr.contains(key))
            System.out.println("Key found in Array list at index:"+arr.indexOf(key));
        else
            System.out.println("No key found !!!");
    }
    
    public void occurences(){
         HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
         
         for(int value: arr)
         {
             if(hm.get(value)==null)
                 hm.put(value,1);
             else{
                 hm.put(value,hm.get(value)+1);
             }
         }
         
         for(Map.Entry<Integer, Integer> element : hm.entrySet()){
             System.out.println(element.getKey()+":"+element.getValue());
         }
    }
    

}
