package Day_23;

/*class ListNode
{
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

class solution_of_D23Q2
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode p3 = head;
        while (list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
            {
                p3.next=list1;
                p3=list1;
                list1=list1.next;
            }
            else
            {
                p3.next=list2;
                p3=list2;
                list2=list2.next;
            }
        }
        if(list1!=null)
            p3.next=list1;
        else
            p3.next=list2;

        return head.next;
    }
}

public class Q2_Merge_Two_Sorted_Linked_Lists
{
    public static void main(String[] args)
    {
        ListNode l1e4 = new ListNode(10);
        ListNode l1e3 = new ListNode(8,l1e4);
        ListNode l1e2 = new ListNode(4,l1e3);
        ListNode l1e1 = new ListNode(2,l1e2);

        ListNode l2e6 = new ListNode(14);
        ListNode l2e5 = new ListNode(11,l2e6);
        ListNode l2e4 = new ListNode(6,l2e5);
        ListNode l2e3 = new ListNode(3,l2e4);
        ListNode l2e2 = new ListNode(3,l2e3);
        ListNode l2e1 = new ListNode(1,l2e2);

        solution_of_D23Q2 obj = new solution_of_D23Q2();
        ListNode temp  = obj.mergeTwoLists(l1e1,l2e1);
        while (temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }

    }
}
