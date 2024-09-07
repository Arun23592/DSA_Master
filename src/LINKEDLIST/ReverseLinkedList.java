package LINKEDLIST.MergeLinkedLists;
//Defining ListNode
class ListsNode {
    int val;
    ListsNode next;

    ListsNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class ReverseLinkedList {
    // Method to reverse the linked list
    public ListsNode reverseList(ListsNode head){
        ListsNode prev = null;
        ListsNode curr = head;
        while (curr != null){
            ListsNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;

        }
        return prev;
    }

    // Method to print the linked list for testing
    public void printList(ListsNode head){
        ListsNode current = head;
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        ReverseLinkedList reverse = new ReverseLinkedList();

        ListsNode list = new ListsNode(1);
        list.next = new ListsNode(2);
        list.next.next = new ListsNode(3);
        list.next.next.next = new ListsNode(4);
        list.next.next.next.next = new ListsNode(5);

        System.out.println("original list: ");
        reverse.printList(list);

        ListsNode reversedHead= reverse.reverseList(list);

        System.out.println("Reversed List:");
        reverse.printList(reversedHead);
    }
}
