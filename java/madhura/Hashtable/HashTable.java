package Hashtable;

import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;
    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key=key;
            this.value=value;
        }
    }

    public HashTable(){
        dataMap = new Node[size];
    }

    public int hash(String key){
        int hash=0;
        char[] keyChars =key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash+asciiValue*23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value){
        int index= hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index]==null){
            dataMap[index]=newNode;
        }else {
            Node temp = dataMap[index];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp !=null){
            if (temp.key==key)return temp.value;
            temp=temp.next;
        }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp!=null){
                allKeys.add(temp.key);
                temp=temp.next;
            }
        }
        return  allKeys;
    }

    public void printTable(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i+":");
            Node temp = dataMap[i];
            while (temp!=null){
                System.out.println("  {"+temp.key+"= "+temp.value+"}");
                temp=temp.next;
            }
        }
    }


}
