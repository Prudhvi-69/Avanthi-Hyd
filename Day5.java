import java.util.*;
class Stack{
    int top = -1;  //Default top pointing below the Stack
    int size = 6;  //Static size of the Stack 
    int Stack[] = new int[size]; //Static Stack declaration
    void push(int val){//FUnction to insert values into Stack
        if(top == size-1)//Checking if Stack is Full
            System.out.println("\nStack Overflow...🥲");
        else//do not write this👆 (x:) and also this line
        {
            top++; //Increment top, then push value
            Stack[top] = val; 
            System.out.println("\n new value pushed into stack : "+val);
        }    
    }
    void pop()//Pop function to delete the top most element
    {
        if(top == -1)//Checking before deleting if empty
            System.out.println("\nStack Underflow..😔");
        else{
            System.out.println("\nelement removed from the Stack is : "+Stack[top]);
            top--; // If not empty, moving top to bottom 
        }
    }
    void peek() //function to see the top most element
    {
        if(top == -1) //Checking if it is  empty
            System.out.println("\nStack is Empty. Nothing to see.😔");
        else
             System.out.println("\nTop Element in Stack is : "+Stack[top]);
    }
    void display()
    {
        if(top == -1) //Checking if it is  empty
            System.out.println("\nStack is Empty. Nothing to see.😔");
        else{
            System.out.println("\nStack values are : ");
            for(int i = top ; i >= 0 ; i--) //Display from top to bottom
            {    
                System.out.println("|.."+Stack[top]+"..|"); // Access each top value
                top--; //To see the next element, we should delete currrent one
            }

        }
    } 
    void isFull()
    {
        if(top == size-1)
            System.out.println("\nStack is Full Currently...");
        else
            System.out.println("\nStack is not at Full Capacity right now...");                
    }
    void isEmpty()
    {
        if(top == size-1)
            System.out.println("\nStack is Empty Currently.....");
        else
            System.out.println("\nStack is not Empty right now...");
    }
}
public class Day5 {
    public static void main(String avanthiIsGreat[])
    {
        Stack s = new Stack();
        s.push(55);
        s.push(71);
        s.push(69);
        s.isFull();
        s.push(83);
        s.pop();
        s.display();
        s.isEmpty();
        s.push(836);
        s.push(927);
        s.push(386);
        s.push(699);
        s.display();
    }
}
