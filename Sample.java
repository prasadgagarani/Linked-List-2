//****INTERSECTION OF TWO LINKED LISTS****

// Time Complexity :O(N);
// Space Complexity :O(1);
// Did this code successfully run on Leetcode :Y
// Any problem you faced while coding this :

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
        //Getting length of A;
        int lenA=0;
        ListNode curr=headA;
        while(curr!=null)
        {
            curr=curr.next;
            lenA++;
        }
        
        //Getting length of B;
        curr=headB;
        int lenB=0;
        while(curr!=null)
        {
            curr=curr.next;
            lenB++;
        }
        
        //whichever is smaller move that and make the lengths equal
        //FOR A
        while(lenA>lenB)
        {
            headA=headA.next;
            lenA--;
        }
        //FOR B
        while(lenA<lenB)
        {
            headB=headB.next;
            lenB--;
        }
        
        //now till both are not equal make them move and you will get the intersection point
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        
        return headA;

        }
    }

// Your code here along with comments explaining your approach
