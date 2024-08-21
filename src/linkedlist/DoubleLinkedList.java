package linkedlist;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList(){
        this.size = 0;
    }

    public void insertFirstNode(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;



        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void insertLastNode(int value){
        if(head==null){
            insertFirstNode(value);
        }else{
            Node node = new Node(value);
            tail.next = node;
            Node temp = tail;
            tail = node;
            tail.previous = temp;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
        ll.insertFirstNode(1);
        ll.insertFirstNode(5);
        ll.insertFirstNode(2);
        ll.insertFirstNode(3);
        ll.insertLastNode(10);
        ll.display();

        System.out.println("Head = " + ll.head.value);
        System.out.println("Tail = " + ll.tail.value);
    }

    private class Node{

        private int value;
        private Node next;
        private Node previous;

        public Node(int value){
            this.value = value;
        }
        //when next value is also provided
        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

    }
}
