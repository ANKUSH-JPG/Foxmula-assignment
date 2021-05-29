
package foxmulaassignment.quadrilateral;

import java.util.*;
import javafx.util.*;
import java.lang.*;


/*
Abstract class quadrilateral for extending other classes like square , rectangle etc....
*/

public abstract class quadrilateral{
    private Pair<Integer,Integer> p1;
    private Pair<Integer,Integer> p2;
    private Pair<Integer,Integer> p3;
    private Pair<Integer,Integer> p4;

    public abstract void get_area();
    
    public ArrayList<Pair<Integer,Integer>> getPoints()
    {
        ArrayList<Pair<Integer,Integer>> points=new ArrayList<Pair<Integer,Integer>>(4);
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        
        return points;
    }
    public void setPoints(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2,Pair<Integer,Integer> p3,Pair<Integer,Integer> p4){
            this.p1=p1;
            this.p2=p2;
            this.p3=p3;
            this.p4=p4;
    }

}


