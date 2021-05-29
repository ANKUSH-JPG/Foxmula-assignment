
package foxmulaassignment.assignment1;
import java.util.*;
import foxmulaassignment.stack.stack; // importing stack for performing stack operations


public class q2stack {
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
                         System.out.println(s1.getSize());
                         break;
                }
            }

            if(s1.getSize()==s2.getSize())
                System.out.println("******* both stacks are equal , size= "+s1.getSize()+" ********");
        }

    }
}
