package foxmulaassignment.quadrilateral;

import java.util.*;
import javafx.util.*;
import java.lang.*;


/*
  extending the abstract class quadrilateral
*/

public class parallelogram extends quadrilateral{

    private int height;

    public parallelogram(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2,Pair<Integer,Integer> p3,Pair<Integer,Integer> p4,int h){
         super.setPoints(p1, p2, p3, p4);
         this.height=h;
    }

    public void get_area(){
         ArrayList<Pair<Integer,Integer>> points=super.getPoints();
         System.out.println("Area of parallelogram is : "+Math.abs(points.get(0).getKey()-points.get(1).getKey())*height);
    }
    
}