import java.util.*;
class BookContainer{
    int top = -1;  //Default top pointing below the Stack
    int limit = 6;  //Static size of the Stack 
    String Container[] = new String[limit]; //Static Stack declaration
    void insertion(String book){//FUnction to insert values into Stack
        if(top == limit-1)//Checking if Container is Full
            System.out.println("\nBook Container is Full...🥲");
        else
        {
            top++; //Increment top, then push value
            Container[top] = book; 
            System.out.println("\n new Book added into container : "+book);
        }    
    }
    void removal()//Pop function to delete the top most element
    {
        if(top == -1)//Checking before deleting if empty
            System.out.println("\nContainer is Empty..😔");
        else{
            System.out.println("\nBook removed from the container is : "+Container[top]);
            top--; // If not empty, moving top to bottom 
        }
    }
    void show() //function to see the top most element
    {
        if(top == -1) //Checking if it is  empty
            System.out.println("\nContainer is Empty. Nothing to see.😔");
        else
             System.out.println("\nTop Most Book in Container is : "+Container[top]);
    }
    void showAllBooks()
    {
        if(top == -1) //Checking if it is  empty
            System.out.println("\nContainer is Empty. Nothing to see.😔");
        else{
            System.out.println("\nBooks in Container are : ");
            for(int i = top ; i >= 0 ; i--) //Display from top to bottom
            {    
                System.out.println("|.."+Container[top]+"..|"); // Access each top value
                top--; //To see the next element, we should delete currrent one
            }

        }
    } 
    void isFull()
    {
        if(top == limit-1)
            System.out.println("\nContainer is Full Currently...");
        else
            System.out.println("\nContainer is not at Full Capacity right now...");                
    }
    void isEmpty()
    {
        if(top == limit-1)
            System.out.println("\nContainer is Empty Currently.....");
        else
            System.out.println("\nContainer is not Empty right now...");
    }
}
public class BookContainerInLibrary {
    public static void main(String avanthiIsGreat[])
    {
        BookContainer s = new BookContainer();
        s.insertion("Java");
        s.insertion("ADSA");
        s.insertion("STACKS by YOU");
        s.isFull();
        s.isEmpty();
        s.insertion("AVIH");
        s.removal();
        s.showAllBooks();
    }
}
