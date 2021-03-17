/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) 
{
    if(head==null)
        return false;

        Node peter = head;
        Node manyiu = head;
        while (peter!=null && manyiu !=null)
        {
            peter = peter.next.next;
            manyiu = manyiu.next;
            if (peter==manyiu)
                return true;

        }
    return false;
}
