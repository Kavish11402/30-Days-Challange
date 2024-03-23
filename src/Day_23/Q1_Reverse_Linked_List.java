package Day_23;
class ListNode
{
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution_of_D23Q1
{
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;

        while (curr != null)
        {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}

public class Q1_Reverse_Linked_List
{
    /*
        Given the head of a singly linked list, reverse the list, and return the reversed list.


            Example 1:
                Input: head = [1,2,3,4,5]
                Output: [5,4,3,2,1]

            Example 2:
                Input: head = [1,2]
                Output: [2,1]

            Example 3:
                Input: head = []
                Output: []
    */
    public static void main(String[] args)
    {
        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4,l5);
        ListNode l3 = new ListNode(3,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);

        solution_of_D23Q1 obj = new solution_of_D23Q1();

        ListNode t = obj.reverseList(l1);
        while (t!=null)
        {
            System.out.println(t.val);
            t=t.next;
        }
    }
}
