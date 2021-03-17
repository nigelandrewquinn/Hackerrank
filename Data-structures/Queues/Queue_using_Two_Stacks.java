import java.io.*;
import java.util.*;

public class Solution 
{
   public static class Queue
    {
        private int maxSize;
        private long[] queArray;
        private int front;
        int rear;
        int nItems;
    
        public Queue(int s) //constructor
        {
            maxSize = s;
            queArray = new long[maxSize];
            front = 0;
            rear = -1;
            nItems = 0;
        }
        public void insert (long j) //case1
        {
            if(rear == maxSize-1)
                rear = -1;
            queArray[++rear] = j;
            nItems++;
        }
        public long remove() //case2
        {
            long temp = queArray[front++];
            if(front == maxSize)
                front = 0;
            nItems--;
            return temp;
        }
        public void print() //case3
        {
            System.out.println(queArray[front]);
        }
    }
        
    

//1 Enqueue element x into the end of the queue.
//2 Dequeue the element at the front of the queue.
//3 Print the element at the front of the queue.
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        Queue theQueue = new Queue(s);
        int num;
        for( int i = 0; i < s; i++)
        {
            num = scan.nextInt();   
            switch (num)
            { //put item at the end of the queue
                case 1:
                    long j = scan.nextInt();
                    theQueue.insert(j);
                    break;

                //Dequeue the element at the front of the queue    
                case 2:
                    theQueue.remove();
                    break;

                    //Print the element at the front of the queue.    
                case 3: 
                    theQueue.print();
                    break;
            }
        }    
    }
}
