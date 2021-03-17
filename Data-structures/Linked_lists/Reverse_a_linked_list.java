/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) 
{
        if (head == null)
        return null;
  
    Node node = null;
    while(head != null)
    {
        Node peter = node;
        node = new Node();
        node.data = head.data;
        node.next = peter;
        head = head.next;
    }
    return node;
    
}
