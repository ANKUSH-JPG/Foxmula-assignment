import java.util.*;
import javafx.util.*;
import java.lang.*;

abstract class quadrilateral{
    protected Pair<Integer,Integer> p1;
    protected Pair<Integer,Integer> p2;
    protected Pair<Integer,Integer> p3;
    protected Pair<Integer,Integer> p4;

    abstract void get_area();

}

class square extends quadrilateral{

    square(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2,Pair<Integer,Integer> p3,Pair<Integer,Integer> p4){
         this.p1=p1;
         this.p2=p2;
         this.p3=p3;
         this.p4=p4;
    }

    void get_area(){
         System.out.println("Area of square is : "+p2.getKey()*p2.getKey());
    }
    
}

class rectangle extends quadrilateral{

    rectangle(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2,Pair<Integer,Integer> p3,Pair<Integer,Integer> p4){
         this.p1=p1;
         this.p2=p2;
         this.p3=p3;
         this.p4=p4;
    }

    void get_area(){
         System.out.println("Area of rectangle is : "+p2.getKey()*p3.getValue());
    }
    
}

class parallelogram extends quadrilateral{

    private int height;

    parallelogram(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2,Pair<Integer,Integer> p3,Pair<Integer,Integer> p4,int h){
         this.p1=p1;
         this.p2=p2;
         this.p3=p3;
         this.p4=p4;
         this.height=h;
    }

    void get_area(){
         System.out.println("Area of parallelogram is : "+Math.abs(p1.getKey()-p2.getKey())*height);
    }
    
}


public class q3shapes{
    public static void main(String args[]) {
        
        quadrilateral q1=new square(new Pair<Integer,Integer>(0,0),new Pair<Integer,Integer>(10,0),new Pair<Integer,Integer>(10,10),new Pair<Integer,Integer>(0,10)); 

        q1.get_area();

        quadrilateral q2=new rectangle(new Pair<Integer,Integer>(0,0),new Pair<Integer,Integer>(10,0),new Pair<Integer,Integer>(10,5),new Pair<Integer,Integer>(0,5)); 

        q2.get_area();

        quadrilateral q3=new parallelogram(new Pair<Integer,Integer>(-2,-6),new Pair<Integer,Integer>(4,-6),new Pair<Integer,Integer>(2,-3),new Pair<Integer,Integer>(-4,-3),3); 

        q3.get_area();
    }
}