package BinarySearchTree;

public class BinarySearchTree {
    public Node root;

    public class Node{
        public int value;
        public Node left;
        public Node right;

        private Node(int value){
            this.value=value;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root==null){
            root=newNode;
            return true;
        }
        Node temp = root;
        while (true){
            if (newNode.value==temp.value) return false;
            if (newNode.value<temp.value){
                if (temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }else{
                if (temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }
        }
    }

    public boolean contains(int value){
        if (root==null) return false;
        Node temp = root;
        while (temp!=null){
            if (temp.value>value){
                temp=temp.left;
            } else if (value> temp.value) {
                temp=temp.right;
            }else {
                return true;
            }
        }
        return false;
    }



}
