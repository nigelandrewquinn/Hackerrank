/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method.
    Node node = new Node();
    if(position==0){
        node.next = head;
        node.data = data;
        return node;
    }
    node = head;
    while(--position > 0){
        node = node.next;
    }
    Node after = node.next;
    node.next = new Node();
    node.next.data = data;
    node.next.next = after;
    return head;
}
