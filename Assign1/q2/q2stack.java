import java.util.*;

class stack{
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

public class q2stack{
    public static void main(String []args) {
    
        stack s1=new stack();
        stack s2=new stack();
        Scanner obj=new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Stack1 \t2. stack2");
            int choice=obj.nextInt();
            System.out.println("1. push \n2. pop \n3. check empty");
            int operation=obj.nextInt();
            if(choice==1)
            {
                switch(operation)
                {
                    case 1:
                         int value=obj.nextInt();
                         s1.push(value);
                         break;
                    case 2:
                         s1.pop();
                         break;
                    default:
                         s1.check_empty();
                         break;
                }
            }
            else
            {
                switch(operation)
                {
                    case 1:
                         int value=obj.nextInt();
                         s2.push(value);
                         break;
                    case 2:
                         s2.pop();
                         break;
                    default:
                         s2.check_empty();
                         break;
                }
            }

            if(s1.s.size()==s2.s.size())
                System.out.println("******* both stacks are equal , size= "+s1.s.size()+" ********");
        }

    }
}