
package foxmulaassignment.assignment1;
import javafx.util.*;

import foxmulaassignment.quadrilateral.quadrilateral;
import foxmulaassignment.quadrilateral.square;
import foxmulaassignment.quadrilateral.rectangle;
import foxmulaassignment.quadrilateral.parallelogram;

/*

*/
public class q3quadrilateral {
     public static void main(String args[]) {
        
        quadrilateral quad1=new square(new Pair<Integer,Integer>(0,0),new Pair<Integer,Integer>(10,0),new Pair<Integer,Integer>(10,10),new Pair<Integer,Integer>(0,10)); 

        quad1.get_area();

        quadrilateral quad2=new rectangle(new Pair<Integer,Integer>(0,0),new Pair<Integer,Integer>(10,0),new Pair<Integer,Integer>(10,5),new Pair<Integer,Integer>(0,5)); 

        quad2.get_area();

        quadrilateral quad3=new parallelogram(new Pair<Integer,Integer>(-2,-6),new Pair<Integer,Integer>(4,-6),new Pair<Integer,Integer>(2,-3),new Pair<Integer,Integer>(-4,-3),3); 

        quad3.get_area();
     }
}
