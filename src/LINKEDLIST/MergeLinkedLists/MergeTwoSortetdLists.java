package LINKEDLIST.MergeLinkedLists;

//Defining the ListNode
class ListNode{
    int val;
    ListsNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoSortetdLists {

        //Method to merge two lists
        public ListsNode mergeTwoLists(ListsNode list1, ListsNode list2){
            if (list1 != null && list2 != null){
                if (list1.val < list2.val){
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                }else {
                    list2.next = mergeTwoLists(list1, list2.next);
                    return list2;
                }
            }
            if (list1 == null) return list2;
            return list1;

        }

        public static void printList(ListsNode node){
            while (node != null){
                System.out.println(node.val + " ");
                node = node.next;
            }
            System.out.println();
        }

        public static void main(String[] args){
            MergeTwoSortetdLists merge = new MergeTwoSortetdLists();

            ListsNode list1 = new ListsNode(1);
            list1.next = new ListsNode(2);
            list1.next.next = new ListsNode(4);

            ListsNode list2 = new ListsNode(1);
            list2.next = new ListsNode(3);
            list2.next.next = new ListsNode(5);

            ListsNode mergedTwoLists = merge.mergeTwoLists(list1, list2);
            printList(mergedTwoLists);




        }
}
