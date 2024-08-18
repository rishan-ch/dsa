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
