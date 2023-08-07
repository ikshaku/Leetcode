// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

// For example, the following two linked lists begin to intersect at node c1:

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         Set<ListNode> nodesInB = new HashSet<ListNode>();

//         while (headB != null) {
//             nodesInB.add(headB);
//             headB = headB.next;
//         }

//         while (headA != null) {
//             // if we find the node pointed to by headA,
//             // in our set containing nodes of B, then return the node
//             if (nodesInB.contains(headA)) {
//                 return headA;
//             }
//             headA = headA.next;
//         }

//         return null;
        
        
        int l1 = 0;
        int l2 = 0;
        
        ListNode curr = headA;
        
        while(curr!=null){
            
            l1++;
            curr=curr.next;
            
        }
        
        curr = headB;
        
        while(curr!=null){
            
            l2++;
            curr=curr.next;
            
        }
        
        while(l1>l2){
            
            l1--;
            headA=headA.next;
            
        }
        
        while(l2>l1){
            
            l2--;
            headB=headB.next;
            
        }
        
        while(headA!=headB){
            
            headA=headA.next;
            headB = headB.next;
            
        }
        
        return headA;
        
    }
}
