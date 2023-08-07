// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

// Do not modify the linked list.
// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode detectCycle(ListNode head) {
      // ListNode curr = head;
      // Set<ListNode> set = new Set();
      // while(curr!=null){
      //   if(set.contains(curr){
      //     return curr;
      //   }
      //   set.add(curr);
      //   curr=curr.next;
      // }
      // return null;

      //floyds algorithm
      ListNode slow = head;
      ListNode fast = head;
      while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(slow==fast){
          break;
        }
      }
      if(fast==null || fast.next==null){
        return null;
      }
      slow = head;
      while(slow!=fast){
        slow=slow.next;
        fast=fast.next;
      }
      return slow;
    }
}
