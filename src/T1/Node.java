package T1;

/**
 * Created by Robin on 2017/7/3.
 */
public class Node {
    public int value;
    public Node next;
    public Node(int data){
        this.value = data;

    }
    public static void printCommonPart(Node head1,Node head2){
        System.out.print("Common Part: ");
        while (head1 != null && head2 != null){
            if(head1.value < head2 .value){
                head1 = head1.next;
            }else if(head1.value > head2.value){
                head2 = head2.next;
            }else {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();

    }

    public static void printList(Node node){
        while ( node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();

    }

    public static void main(String [] args){
        Node head1 = new Node(0);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        printList(head1);
        printList(head2);
        printCommonPart(head1,head2);

    }
}
