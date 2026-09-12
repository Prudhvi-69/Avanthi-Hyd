class QueueCode{
    int rear = -1; //Initial value of rear is beyond Queue
    int front = 0; //Initial value of front is at the beginning
    int size = 6;  // Max limit of the Queue
    int Queue[] = new int[size]; 
    void enQueue(int value) //Function to push elements into the Queue
    {
        if( rear == size-1 )// When Queue is full, rear is at limit
            System.out.println("\n Queue is Full.... Cannot push more...");
        else{
            rear++; //Move rear to next place behind previous value
            Queue[rear] = value; //Insert value behind the previous value
            System.out.println("\n Value enQueued into the Queue : "+value);
        }
    }
    void deQueue()//Function to remove elements from the Queue
    {
        if( front > rear)
            System.out.println("\n Queue is empty, we cannot deQueue it...");
        else
        {
            System.out.println("\n The element deQueued from Queue is : "+Queue[front]);
            front++;
        }
    }
    void peek(){
        if(front > rear)
            System.out.println("\n Queue is empty, we cannot see anything in it...🥲");
        else
        {
            System.out.println("\n The element at the first in the Queue is : "+Queue[front]);
            front++;
        }
    }
    void display(){
        if(front > rear)
            System.out.println("\n Queue is empty, we cannot see anything in it...🥲");
        else{
            System.out.println("\n Values in the Queue are : \n");
            for( int i = front ; i <= rear ; i++)
            {
                System.out.println(" | "+Queue[front]+" | ");
                front++;
            }
        }            
    }


}
public class QueueCodeSample {
    public static void main(String alphabets[])
        {
            QueueCode q = new QueueCode();
            q.enQueue(111);
            q.enQueue(12654);
            q.enQueue(65435);

        }
        
}
