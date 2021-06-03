
package assignment3.array;

import java.util.*;
import java.lang.*;
 
public class array {
    private int arr[];
    private int arraySize;
    
    public array(int arraySize){
        
        this.arraySize=arraySize;
        arr=new int[this.arraySize];
    }
    
    public void addToArray(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter "+arraySize+" elements :");
        for(int i=0;i<arraySize;i++)
        {
            int value=scan.nextInt();
            arr[i]=value;
        }
    }
    
    public HashMap<Integer,Integer> frequency(){
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arraySize;i++)
        {
            if(hashMap.get(arr[i])==null)
            {
                hashMap.put(arr[i],1);
            }
            else
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
        }
        
        return hashMap;
    }
    
    public TreeMap<Integer,ArrayList<Integer>> sortByFrequency(){
        HashMap<Integer,Integer> hashMap=this.frequency();
        TreeMap<Integer,ArrayList<Integer>> sortedFrequency=new TreeMap<Integer,ArrayList<Integer>>();
        
        for(int i : hashMap.keySet())
        {
            // i; key
            // hashMap.get(i); value
            if(sortedFrequency.get(hashMap.get(i))==null){
                ArrayList<Integer> a=new ArrayList<Integer>();
                a.add(i);
                sortedFrequency.put(hashMap.get(i),a);
            }
            else{
                sortedFrequency.get(hashMap.get(i)).add(i);
                sortedFrequency.put(hashMap.get(i),sortedFrequency.get(hashMap.get(i)));
            }            
        }
        
        return sortedFrequency;
    }
}
