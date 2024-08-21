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
        if(head==null){
            tail = node;
        }
        node.next = head;
        node.previous = null;
        if(head!=null){
            head.previous = node;
        }

        head = node;
        size+=1;
    }

    public void insertLastNode(int value){
        if(head==null){
            insertFirstNode(value);
        }else{
            Node node = new Node(value);
            node.next = null;
            node.previous = tail;
            tail = node;
            size+=1;
        }
    }

    public void insertAtIndex(int value, int index){
        if(index==0){
            insertFirstNode(value);
        } else if(index==size){
            insertLastNode(value);
        } else{
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = head.next;
            }
            Node node = new Node(value, temp.next,temp);
            temp.next = node;
            node.next.previous = node;


            size += 1;
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

    public void reverseDisplay(){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.value + " <-> ");
            temp = temp.previous;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
        ll.insertFirstNode(3);
        ll.insertFirstNode(2);
        ll.insertFirstNode(0);
        ll.insertAtIndex(1,1);
//        ll.insertFirstNode(3);
//        ll.insertLastNode(10);
//        ll.insertFirstNode(99);
//
        ll.display();
        ll.reverseDisplay();
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
