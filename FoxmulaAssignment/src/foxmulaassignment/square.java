package foxmulaassignment.quadrilateral;

import java.util.*;
import javafx.util.*;
import java.lang.*;


/*
  extending the abstract class quadrilateral
*/
public class square extends quadrilateral{

    public square(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2,Pair<Integer,Integer> p3,Pair<Integer,Integer> p4){
         this.p1=p1;
         this.p2=p2;
         this.p3=p3;
         this.p4=p4;
    }

    public void get_area(){
         System.out.println("Area of square is : "+p2.getKey()*p2.getKey());
    }
    
}