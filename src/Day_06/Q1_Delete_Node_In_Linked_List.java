package Day_06;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class solution_of_D6Q1
{
    public void deleteNode(ListNode node)
    {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

public class Q1_Delete_Node_In_Linked_List
{
    /*
        There is a singly-linked list head, and we want to delete a node in it.
        You are given the node to be deleted node. You will not be given access to the first node of head.
        All the values of the linked list are unique, and it is guaranteed that the given node is not the last node in the linked list.
        Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
            > The value of the given node should not exist in the linked list.
            > The number of nodes in the linked list should decrease by one.
            > All the values before node should be in the same order.
            > All the values after node should be in the same order.

            Example 1:
                Input: head = [4,5,1,9], node = 5
                Output: [4,1,9]
                Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
            Example 2:
                Input: head = [4,5,1,9], node = 1
                Output: [4,5,9]
                Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
    */
    public static void main(String[] args)
    {
        ListNode e4 = new ListNode(9);
        ListNode e3 = new ListNode(1);
        ListNode e2 = new ListNode(5);
        ListNode e1 = new ListNode(4);

        e1.next=e2;
        e2.next=e3;
        e3.next=e4;
        e4.next=null;

        solution_of_D6Q1 obj = new solution_of_D6Q1();
        obj.deleteNode(e2);

    }
}
