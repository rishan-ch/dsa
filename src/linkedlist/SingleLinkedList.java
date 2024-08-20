package linkedlist;


public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList(){
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
        Node node = new Node(value);
        if(tail==null){
            insertFirstNode(value);
        } else{
            tail.next = node;
            tail = node;
        }
        size += 1;
    }

    public void insertAtIndex(int value, int index){
        if(index==0){
            insertFirstNode(value);
        } else if(index==size){
            insertLastNode(value);
        }else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
        }

    }

    public void deleteFirstNode(){
        if (head == null) {
            System.out.println("linked list is empty");
        }else{
            Node temp = head.next;
            head = temp;
            size-=1;
        }

    }

    public void deleteLastNode(){
        if(size<=1){
            deleteFirstNode();
        }else{
            Node node = head;
            for (int i = 0; i < size; i++) {
                if(node.next.next == null){
                    tail = node;
                    tail.next = null;
                    size-=1;
                } else{
                    node = node.next;
                }
            }
        }

    }

    public void deleteAtIndex(int index){
        if (index == 0){
            deleteFirstNode();
        } else if(index == size){
            deleteLastNode();
        } else{
            Node node = head;
            for (int i = 1; i < index; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.insertFirstNode(9);
        ll.insertFirstNode(1);
        ll.insertFirstNode(4);
        ll.insertFirstNode(2);
        ll.insertFirstNode(6);
        ll.insertFirstNode(7);
        ll.insertLastNode(99);
        ll.insertAtIndex(100,5);
        ll.display();
        ll.deleteFirstNode();
        ll.display();
        ll.deleteLastNode();
        ll.display();
        ll.deleteAtIndex(1);
        ll.display();
    }

    private class Node{
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;
        }
        //when next value is also provided
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
