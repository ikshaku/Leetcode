// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
public class ListNode {
 // *     int val;
 // *     ListNode next;
 // *     ListNode() {}
 // *     ListNode(int val) { this.val = val; }
 // *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public ListNode reverseList(ListNode node) {
  ListNode curr = node;
  ListNode prev = null;
  ListNode forward = null;
  while(curr!=null){
    forward = curr.next;
    curr.next = prev;
    prev = curr;
    curr = forward;
  }
  return prev;
}
  

