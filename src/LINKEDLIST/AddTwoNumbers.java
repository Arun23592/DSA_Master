package LINKEDLIST;

//Define the class node class
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

//Define the solution class containing the addTwoNumbers method
class solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0); // dummy node to serve as the starting point of result list
        ListNode current = dummy; // pointer to build the result list
        int carry = 0;//initialize carry to handle sums greater than 9
        int total = 0;

        while (l1 != null || l2 !=null || carry !=0){
            total = carry;
            if (l1 != null){
                total += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                total += l2.val;
                l2 = l2.next;
            }

            int nums = total % 10;
            carry = total / 10;
            dummy.next = new ListNode(nums);
            dummy = dummy.next;

        }
        return current.next;


    }
}





//deifine the main class to run the example
public class AddTwoNumbers {

    public static void main(String[] args){
        //create two linked lists
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        //Add two numbers
        solution sol = new solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        //print the list
        printList(result);

    }

    //Helper method to print the linked list
    public static void printList(ListNode node){
        while (node != null){
            System.out.print(node.val+ " ");
            node = node.next;
        }
    }
}
