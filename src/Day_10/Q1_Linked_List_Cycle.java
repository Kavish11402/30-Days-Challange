package Day_10;

import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution_of_D10Q1
{
    public boolean hasCycle(ListNode head)
    {
        HashMap<ListNode,Integer> map = new HashMap<>();
        while(head!=null)
        {
            if(map.containsKey(head.next))
                return true;
            map.put(head.next,head.val);
            head=head.next;
        }
        return false;
    }
}

public class Q1_Linked_List_Cycle
{
    /*
        Given head, the head of a linked list, determine if the linked list has a cycle in it.
        There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
        Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
        Return true if there is a cycle in the linked list. Otherwise, return false.

            Example 1:
                Input: head = [3,2,0,-4], pos = 1
                Output: true
                Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

            Example 2:
                Input: head = [1,2], pos = 0
                Output: true
                Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

            Example 3:
                Input: head = [1], pos = -1
                Output: false
                Explanation: There is no cycle in the linked list.
   */
    public static void main(String[] args)
    {
        solution_of_D10Q1 obj = new solution_of_D10Q1();
        ListNode l4 = new ListNode(-4);
        ListNode l3 = new ListNode(0);
        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(1);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l2;

        System.out.println(obj.hasCycle(l1));
    }
}
