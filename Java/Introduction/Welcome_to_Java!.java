public class Solution {

    public static void main(String[] args) 
    {
       System.out.println("Hello, World.");
       System.out.println("Hello, Java.");
    }
}
/*
MIDDLE OF QUEUE
package Week8;

import java.util.Scanner;

public class Labv2_MiddleOfQueue {
	  public static void main(String args[] ) throws Exception {
		  Scanner scan=new Scanner(System.in);
			//String to store command
			String command;
			//Creating queue
			Queue myQ = new Queue(20);
			//Creating array
			String array[] = new String[20];

			while(scan.hasNext())
			            {

			        command=scan.nextLine();
			        array=command.split(" ");
			           if(array[0].equalsIgnoreCase("INSERT"))
			               {
			               myQ.insert(array[1]);
			           }
			            else{
								if(!myQ.isEmpty()) //if the string is NOT empty then remove
								{
									myQ.remove();
								}
							}
			    
			        }

	            String QArray[] = new String[myQ.size()]; //Create a string array of size of the queue
				for(int i = 0; i < QArray.length ; i++) //Fill out the array with what's in the queue
				{
					if(!myQ.isEmpty()) // But fill it out only until it is empty
					{
						QArray[i] = myQ.remove(); //Remove item
					}
				}
	        if(QArray.length == 0) //If empty then return "empty"
				{
					System.out.println( "empty");
				}
				else if(QArray.length%2 == 0) // If # of items is even
				{
					int pos = (QArray.length/2)-1; // print the middle closer to the front
					System.out.println(QArray[pos]);
				}
				else //if the # of items is odd
				{
					System.out.println(QArray[QArray.length/2]); //print the item in the middle
				}



		  
	  }

}

package Week8;
import java.util.*;
public class PriorityQueue {
	public static void main(String args[]) 
	{
		Queue1 q = new Queue1(100);

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt())
		{
			int nextIntFound = scan.nextInt();
			q.insert(nextIntFound);
		
		}
		while (!q.isEmpty())
		{
			System.out.println(q.remove());
		}
		
		
		
		
		
		
		
	}
}
*/
//PRIORITY QUEUE
/*
 class Queue1 {
		private int maxSize;
		private int[] queArray;
		private int front;
		private int rear;
		private int nItems;

		public Queue1(int s) { // constructor
			maxSize = s;
			queArray = new int[maxSize];
			front = 0;
			rear = -1;
			nItems = 0;
		}

		public void printQ() {
			System.out.print("\t\tQUEUE Contents: ");
			for (int i = 0; i < nItems; i++) {
				System.out.print("[" + queArray[i] + "]");
			}
			System.out.println("");
		}
		public void insert(int item) {
			
			if (nItems == 0) { // if no items,
				queArray[0] = item; // insert at 0
			} else { // if some items,
				int j = nItems; // start at end

				
				//To change the priority of this queue - just change the > symbol in the queArray[j-1] > item clause
			
				//Less than means that lower numbers have priority 
				while (j > 0 && queArray[j - 1] < item) { // while new item larger
					queArray[j] = queArray[j - 1]; // shift upward
					j--; // decrement j
				}
				queArray[j] = item; // insert it
			}
				
			front = nItems; // NEW LINE OF CODE FOR PRIORITY QUEUE.... 
			nItems++; // increase items
		}

		public int remove() { // take item from front of queue
			int temp = queArray[front]; // get value   
			front--; // We need to move the front back.... 
			if (front == maxSize) { // deal with wraparound
				front = 0;
			}
			nItems--; // one less item
			return temp;
		}

		public int peekFront() { // peek at front of queue
			return queArray[front];
		}

		public boolean isEmpty() { // true if queue is empty
			return (nItems == 0);
		}

		public boolean isFull() { // true if queue is full
			return (nItems == maxSize);
		}

		public int size() { // number of items in queue
			return nItems;
		}
	}
	
*/   

