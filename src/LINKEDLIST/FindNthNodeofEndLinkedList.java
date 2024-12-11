package LINKEDLIST;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class FindNthNodeofEndLinkedList {

    public ListNode EndOfnthNode(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;

        for (int i=0; i<n; i++){
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args){
        //List = 1->2->3->4->5
        FindNthNodeofEndLinkedList list = new FindNthNodeofEndLinkedList();
        int n = 2;

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


       ListNode nthNode = list.EndOfnthNode(head, n);
       if (nthNode != null){
           System.out.println("The "+ n + "th node from the end is: "+nthNode.val);
       }else {
           System.out.println("The list is shorter than "+n +" nodes.");
       }


    }
}
