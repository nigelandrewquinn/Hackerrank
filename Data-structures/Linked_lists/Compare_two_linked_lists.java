/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    if(headA == null && headB == null)
        return 1;
    while(headA.next != null && headB.next != null){
        headA = headA.next;
        headB = headB.next;
        if(headA.data!=headB.data)
            return 0;
            
    }
    if(headA.next!=headB.next)
            return 0;
    return 1;
    
    

  
}
