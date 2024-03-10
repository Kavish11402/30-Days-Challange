package Day_10;
//I am not using this class here because there is a ListNode Class which already exists in the same package
/**class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

class solution_of_D10Q4
{
    public ListNode middleNode(ListNode head)
    {
        int count =0;
        for( ListNode l = head; l!=null; l=l.next )
            count++;
        count = count/2;
        while ( count!=0 )
        {
            head=head.next;
            count--;
        }
        return head;
    }
}

public class Q4_Middle_of_the_Linked_List
{
    /*
        Given the head of a singly linked list, return the middle node of the linked list.
        If there are two middle nodes, return the second middle node.

            Example 1:
                Input: head = [1,2,3,4,5]
                Output: [3,4,5]
                Explanation: The middle node of the list is node 3.

            Example 2:
                Input: head = [1,2,3,4,5,6]
                Output: [4,5,6]
                Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
    */
    public static void main(String[] args)
    {
        solution_of_D10Q4 obj = new solution_of_D10Q4();

        ListNode l6 = new ListNode(6);
        ListNode l5 = new ListNode(5,l6);
        ListNode l4 = new ListNode(4,l5);
        ListNode l3 = new ListNode(3,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        System.out.println(obj.middleNode(l1).val);
    }
}
