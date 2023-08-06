// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// tc O(n)
// sc O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null){
              return null;
        }
          
        if(head.next==null && n==1){
            return null;
        }
        
        if(head.next==null && n!=1){
            return head;
        }
        
        ListNode curr = head;
        
        int length = 0;
        
        while(curr!=null){
            length++;
            curr = curr.next;    
        }
        
        System.out.print(length);
        
        length = length - n;
        ListNode c1 = new ListNode();
        c1.next=head;
        curr=c1;
        
        while(length>0){
            length--;
            curr=curr.next;
        }
        
        curr.next=curr.next.next;
        
        return c1.next;
    }
}
