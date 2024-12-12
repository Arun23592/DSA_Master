//package LINKEDLIST;
//
////Define the class node class
//class ListNode{
//    int val;
//    ListNoden next;
//    ListNode(int val){
//        this.val = val;
//    }
//    ListNode(int val, ListNoden next){
//        this.val = val;
//        this.next = next;
//    }
//}
//
////Define the solution class containing the addTwoNumbers method
//class solution{
//    public ListNoden addTwoNumbers(ListNoden l1, ListNoden l2){
//        ListNoden dummy = new ListNoden(0); // dummy node to serve as the starting point of result list
//        ListNoden current = dummy; // pointer to build the result list
//        int carry = 0;//initialize carry to handle sums greater than 9
//        int total = 0;
//
//        while (l1 != null || l2 !=null || carry !=0){
//            total = carry;
//            if (l1 != null){
//                total += l1.val;
//                l1 = l1.next;
//            }
//
//            if (l2 != null){
//                total += l2.val;
//                l2 = l2.next;
//            }
//
//            int nums = total % 10;
//            carry = total / 10;
//            dummy.next = new ListNoden(nums);
//            dummy = dummy.next;
//
//        }
//        return current.next;
//
//
//    }
//}
//
//
//
//
//
////deifine the main class to run the example
//public class AddTwoNumbers {
//
//    public static void main(String[] args){
//        //create two linked lists
//        ListNoden l1 = new ListNoden(2, new ListNoden(4, new ListNoden(3)));
//        ListNoden l2 = new ListNoden(5, new ListNoden(6, new ListNoden(4)));
//
//        //Add two numbers
//        solution sol = new solution();
//        ListNoden result = sol.addTwoNumbers(l1, l2);
//
//        //print the list
//        printList(result);
//
//    }
//
//    //Helper method to print the linked list
//    public static void printList(ListNoden node){
//        while (node != null){
//            System.out.print(node.val+ " ");
//            node = node.next;
//        }
//    }
//}
