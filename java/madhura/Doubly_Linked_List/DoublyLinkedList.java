package Doubly_Linked_List;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    public class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value=value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode= new Node(value);
            head=newNode;
            tail=newNode;
            length=1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        length++;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if (index>length || index<0) return false;
        if (index==0){
            prepend(value);
            return true;
        }
        if (index==length){
            append(value);
            return true;
        }
        Node newNode= new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev=before;
        newNode.next=after;
        before.next=newNode;
        after.prev=newNode;
        length++;
        return true;

    }

    public Node remove(int index){
        if (index>=length || index<0) return null;
        if (index==0) return removefirst();
        if (index==length) return removelast();

        Node temp = get(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;

    }

    public Node removelast(){
        if (length==0) return null;
        Node temp=head;
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
        length--;
        if (length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length==0) {
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head.prev=newNode;
            newNode.prev=null;
            head=newNode;
        }
        length++;

    }

    public Node removefirst(){
        if (length==0) return null;
        Node temp=head.next;
        head=null;
        head=temp;
        length--;
        if (length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public Node get(int index){
        if (index>=length || index<0) return null;
        Node temp = head;
        if (index<length/2){
            for (int i = 0; i < index; i++) {
                temp=temp.next;
            }
        }else {
            temp=tail;
            for (int i = length-1; i > index; i--) {
                temp=temp.prev;
            }
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
