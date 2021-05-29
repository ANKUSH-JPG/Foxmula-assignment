package foxmulaassignment.quadrilateral;

import java.util.*;
import javafx.util.*;



/*
  extending the abstract class quadrilateral
*/
public class square extends quadrilateral{

    public square(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2,Pair<Integer,Integer> p3,Pair<Integer,Integer> p4){
            super.setPoints(p1, p2, p3, p4);
    }

    public void get_area(){
        ArrayList<Pair<Integer,Integer>> points=super.getPoints();
         System.out.println("Area of square is : "+points.get(1).getKey()*points.get(1).getKey());
    }
    
}