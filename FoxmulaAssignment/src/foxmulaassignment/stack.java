/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foxmulaassignment.stack;

import foxmulaassignment.node.node;

public class stack {
    
    private node head;
    private node move;
    private int top;
    
    public stack(){
        head=null;
        move=null;
        top=-1;
    }
    
    public void push(int data){
       
        if(top==-1){
            node temp=new node();
            temp.setData(data);
            temp.setNext(null);
            head=temp;
            move=temp;
        }
        else{
            node temp=new node();
            temp.setData(data);
            temp.setNext(null);
            move.setNext(temp);
            move=move.getNext();
        }
        top++;
       
    }
    
    public void pop(){
        
        if(top==-1)
            System.out.println("*********** Stack underflow *********");
        else{
        top--;
        node p=head;
        for(int i=1;i<top;i++){
            p=p.getNext();
        }
        System.out.println("Popped: "+move.getData());
        p.setNext(null);
        move=p;
       }
    }
    
    public void check_empty(){
        if(top==-1)
            System.out.println("****** Stack empty ********* ");
        else
            System.out.println("****** Stack is not empty ********* ");
    }
    public int getSize(){
        return top+1;
    }
}
