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
