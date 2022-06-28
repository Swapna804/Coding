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
    public static ListNode startingNodeOfCycle(ListNode head){
        if(head==null ||head.next==null)return null;
          ListNode slow=head;
           ListNode fast=head;  
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                
                if(slow==fast)break;
            }
                
                if(fast!=slow)return null;
                
                slow=head;
                fast=fast;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
            return slow;
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)return null;
        ListNode tail=headA;
        while(tail.next!=null)tail=tail.next;
        tail.next=headB;   //modify
        ListNode ans=startingNodeOfCycle(headA);
        tail.next=null;   //unmodify
        return ans;
        
    }
}