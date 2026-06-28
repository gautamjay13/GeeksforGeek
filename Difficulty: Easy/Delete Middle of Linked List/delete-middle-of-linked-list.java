/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        Node slow = head; 
        Node fast = head ; 
        Node prev = head; 
        if (head == null || head.next == null) {
    return null;
}
        while ( fast!=null && fast.next!= null){
            prev = slow ;
            slow = slow.next ; 
            fast = fast.next.next ; 
        }
        prev.next = slow.next ;
        
        return head ;
    }
}