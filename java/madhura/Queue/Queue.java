package Queue;

import Linked_List.LinkedList;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length==0){
            first=newNode;
            last=newNode;
        }else{
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    public Node dequeue(){
        if (length==0) return null;
        Node temp = first;
        first=first.next;
        temp.next=null;
        length--;
        if (length==0){
            first=null;
            last=null;
        }
        return temp;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
