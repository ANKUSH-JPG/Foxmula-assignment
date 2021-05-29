
package foxmulaassignment.quadrilateral;

import java.util.*;
import javafx.util.*;
import java.lang.*;


/*
Abstract class quadrilateral for extending other classes like square , rectangle etc....
*/

public abstract class quadrilateral{
    protected Pair<Integer,Integer> p1;
    protected Pair<Integer,Integer> p2;
    protected Pair<Integer,Integer> p3;
    protected Pair<Integer,Integer> p4;

    public abstract void get_area();

}


