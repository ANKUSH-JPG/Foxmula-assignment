/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foxmulaassignment.stack;

import java.util.*;

public class stack{
     public Stack<Integer> s=new Stack<Integer>();

     public void push(int n){
            this.s.push(n);
     }
     
     public void pop(){

            this.s.pop();
     }

     public void check_empty(){
            if(this.s.empty())
            {
                System.out.println("Stack is empty");
            }
            else
            {
                System.out.println("Stack is not empty");
            }
     }
}
