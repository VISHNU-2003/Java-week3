//package linkedlists;
//class Node{
//    int data;
//    Node next;
//    Node(int data)
//    {
//        this.data = data;
//        this.next = null;
//    }
//}
//public class MyLL {
//    static void print(Node head)
//    {
//        while( head != null)
//        {
//            System.out.println(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Node head = new Node(5);
//        Node second = new Node(6);
//        head.next = second;
//        Node third = new Node(7);
//        second.next = third;
//        Node fourth = new Node(8);
//        third.next = fourth;
//        Node fifth = new Node(9);
//        fourth.next = fifth;
////        System.out.println(head.data);
////        System.out.println(head.next.data);
////        System.out.println(head.next.next.data);
////        System.out.println(head.next.next.next.data);
////        System.out.println(head.next.next.next.next.data);
//            Node temp = head;
//        while(temp != null)
//        {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//        System.out.println(temp);
//        //had has become null -> we have misplaced(lost) our head
//        temp = head;
//        while(temp != null)
//        {
//            System.out.println(temp.data);
//            temp = head.next;
//        }
////        System.out.println(head.next.next.next.next.next.next.data);//null.data ->wrong
//
//    }
//}
//chapter 41,42 & 43.
package linkedlists;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;

    }

}
public class MyLL{
    static void print(Node head)
    {
        if(head == null)
        {
            System.out.println("Empty Ll! Nothing to print");
            return;
        }
        while(head != null)//here it is correct to use head as this head is a separate reference variable pointing to the same object4
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    static Node insertAtHead(Node head, int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;

    }
    static Node insertAtEnd(Node head, int data)
    {
        if(head == null) return new Node(data);//explicit handling when linked list is empty
        //create a new node
        Node temp = new Node(data);
        //Find the last element
        Node last = head;
        while(last.next != null )
        {
            last  = last.next;
        }
        last.next = temp;
        temp.next = head;
        head = temp;
        return head;


    }
        static Node deleteLL(Node head)
        {
            return null;
        }
    static Node deleteFromHead(Node head)
    {
        if(head == null)
        {
            System.out.println("Empty LL!! Nothing to delete");
            return null;
        }
        return head.next;
    }
    static void findMiddleElementOld(Node head)
    {
        int len = 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
//        we have found length]
        for(int i =0;i<len/2;i++)
        {
            temp = temp.next;
        }
        //temp points to the middle element
        System.out.println(temp.data);
    }
    static void findMiddleElement(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next!= null && fast!=null)//for odd and even scenarios respectively
        {
            fast = fast.next.next;
            slow = slow.next;
        }
//        slow points to middle element
        System.out.println(slow.data);
    }


    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(6);
        head.next = second;
        Node third = new Node(7);
        second.next = third;
        Node fourth = new Node(8);
        third.next = fourth;
        Node fifth = new Node(9);
        fourth.next = fifth;
//        System.out.println(head.data);
        //System.out.println(head.next.data);
        //System.out.println(head.next.next.data);
        //System.out.println(head.next.next.next.data);
        //System.out.println(head.next.next.next.next.data);

        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp);
        //temp has become null, we should not misplace(lose) our head
//        temp = head;
//        while(temp != null)
//        {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
        print(head);
        print(head);
        // system.out.println(head.next.next.next.next.next.data);//null.data->wrong
//        insertAtHead(head, 4);

        head = insertAtHead(head, 4);
        print(head);
        head = insertAtEnd(head, 10);

        Node head2 = insertAtEnd(null,1);
        print(head2);

        head2 = deleteLL(head2);
        print(head2);

        head2 = insertAtEnd(null, 1);
        print(head2);

        head2 = deleteFromHead(head2);
        print(head2);

        head2 = deleteFromHead(head2);

        findMiddleElement(head);

        head = insertAtEnd(head, 11);
        print(head);

        findMiddleElement(head);
        findMiddleElementOld(head);
    }
}