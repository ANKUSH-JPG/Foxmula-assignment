
package foxmulaassignment.assignment1;

import foxmulaassignment.time.time; // importing the class Time to add two time objects

public class q1time {
    public static void main(String []args) {
        
        time t1=new time(1,30,25);
        time t2=new time(2,50,1);

        t1.add(t2);
    }
}
