// You are given the head of a singly linked-list. The list can be represented as:

// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:

// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

// Input: head = [1,2,3,4]
// Output: [1,4,2,3]
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
    public void reorderList(ListNode head) {
        
        
        ListNode head2 = null;
        ListNode slow = head;
        ListNode fast = head;
        
        //finding mid
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        head2 = slow.next;
        
        slow.next = null;
        
        head2=reverse(head2);
        
        //merge
        
        while(head2!=null){
            
            ListNode temp = head.next;
            head.next=head2;
            head2=head2.next;
            head.next.next=temp;
            head=temp;
        }
    
        
    }
    
    private ListNode reverse(ListNode head){
        
        if(head==null){
            return null;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
//             if(forw!=null){
                
//             forw=forw.next;
//             }
        }
        
        return prev;
        
    }
}
 
