package Day_02;

class ListNode
{
    int val; ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution_of_D2Q2
{
    public void display(ListNode list)
    {
        ListNode temp = list;
        System.out.print("Displaying List => [");
        while (temp!=null)
        {
            System.out.print(temp.val);
            if(temp.next!=null)
                System.out.print(", ");
            temp=temp.next;
        }
        System.out.println("]");
    }

    public void put(ListNode list, int value)
    {
        if(list.val!=-1)
        {
            ListNode l = new ListNode(value);
            while (list.next!=null)
            {
                list=list.next;
            }
            list.next=l;
        }
        else
        {
            list.val=value;
        }
    }

    private int checkDoubleDigit(int sum, ListNode list)
    {
        if( sum/10!=0 ) //Sum is Double digit
        {
            put(list,sum%10);
            return sum/10;
        }
        else
        {
            put(list,sum);
            return 0;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode result = new ListNode(-1);
        int carryBit=0, temp;
        while ( l1!=null && l2!=null )
        {
            temp = (l1.val+l2.val)+carryBit;

            carryBit=checkDoubleDigit(temp,result);


            l1=l1.next;
            l2=l2.next;
        }
        while ( l1!=null || l2!=null )
        {
            if( l1!=null && l2==null )
            {
                temp = l1.val+carryBit;
                carryBit=checkDoubleDigit(temp,result);
                l1=l1.next;
            }
            else
            {
                temp = l2.val+carryBit;
                carryBit=checkDoubleDigit(temp,result);
                l2=l2.next;
            }
        }
        if(carryBit>0)
            put(result,carryBit);
        return result;
    }
}

public class Q2_Add_Two_Numbers
{

    /*
        Example 1:
            Input: l1 = [2,4,3], l2 = [5,6,4]
            Output: [7,0,8]
            Explanation: 342 + 465 = 807.

        Example 2:
            Input: l1 = [0], l2 = [0]
            Output: [0]

        Example 3:
            Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
            Output: [8,9,9,9,0,0,0,1]
    */

    public static void main(String[] args)
    {
        solution_of_D2Q2 obj = new solution_of_D2Q2();

        ListNode l1s7 = new ListNode(9);
        ListNode l1s6 = new ListNode(9,l1s7);
        ListNode l1s5 = new ListNode(9,l1s6);
        ListNode l1s4 = new ListNode(9,l1s5);
        ListNode l1s3 = new ListNode(9,l1s4);
        ListNode l1e2 = new ListNode(9,l1s3);
        ListNode l1Head = new ListNode(9,l1e2);


        ListNode l2e4 = new ListNode(9);
        ListNode l2e3 = new ListNode(9,l2e4);
        ListNode l2e2 = new ListNode(9,l2e3);
        ListNode l2Head = new ListNode(9,l2e2);



        System.out.print("List 1 =>  ");obj.display(l1Head);
        System.out.print("List 2 =>  ");obj.display(l2Head);
        ListNode o = obj.addTwoNumbers(l2Head,l1Head);
        obj.display(o);

    }
}
