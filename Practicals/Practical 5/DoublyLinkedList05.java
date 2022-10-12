import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
    Node(){
        data = 0;
        next = null;
        prev = null;
    }
    Node(int d, Node n, Node p){
        data = d;
        next = n;
        prev = p;
    }
    void setData(int d){
        data = d;
    }
    void setNext(Node n){
        next = n;
    }
    void setPrev(Node p){
        prev = p;
    }
    int getData(){
        return data;
    }
    Node getNext(){
        return next;
    }
    Node getPrev(){
        return prev;
    }
}
//Doubly Linked List

import java.util.*;

class DLinkedList {
    int size;
    Node head;
    Node tail;

    DLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    void viewList() {
        Node t;
        if (head == null) {
            System.out.println("List empty");
        } else {
            System.out.println("LIST: ");
            t = head;
            while (t != null) {
                System.out.print(t.getData() + ", ");
                t = t.getNext();
            }
            System.out.println("\nREVERSE LIST: ");
            t = tail;
            while (t != null) {
                System.out.print(t.getData() + ", ");
                t = t.getPrev();
            }
        }
    }
//Insert at Front
void insertAtFirst(int d) {
        Node temp;
        temp = head;
        Node n = new Node();
        if (head == null) {
            tail = n;
            head = n;
        } else {
            temp.setPrev(n);
        }
        n.setData(d);
        n.setNext(temp);
        head = n;
        size++;
    }
//Insert at end
void insertAtEnd(int d) {
        Node temp = tail;
        Node n = new Node();
        if (head == null) {
            head = n;
        } else {
            tail.setNext(n);
        }
        n.setData(d);
        n.setPrev(tail);
        tail = n;
        size++;
    }
//Insert at Pos
void insertAtPos(int d, int pos) {
        Node n;
        Node t;
        Node temp;
        t = head;
        n = new Node();
        if (pos == 1) {
            insertAtFirst(d);
        } else if (pos == size+1) {
            insertAtEnd(d);
        } else {
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            temp = t.getNext();
            n.setData(d);
            n.setNext(t.getNext());
            t.setNext(n);
            n.setPrev(t);
            temp.setPrev(n);
            size++;
        }
    }
//Delete at beg
void deleteAtFirst() {
        if (head == null)
            System.out.println("List is empty");
        else {
            head = head.getNext();
            head.setPrev(null);
            size--;
        }
    }

//Delete at end
void deleteAtEnd() {
        if (head == null)
            System.out.println("List is empty");
        else if (size == 1) {
            head = null;
            size--;
        } else {
            Node t;
            t = head;
            for (int i = 1; i < size - 1; i++) {
                t = t.getNext();
            }
            tail = t;
            t.setNext(null);
            size--;
        }
    }
//Delete at pos
public void deleteAtPos(int pos) {
        if (head == null)
            System.out.println("list is empty");
        else if (pos < 1 || pos > size)
            System.out.println("invalid position");
        else if (pos == 1)
            deleteAtFirst();
        else if (pos == size)
            deleteAtEnd();
        else {
            Node t, t1;
            t = head;
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            t1.getNext().setPrev(t);
            size--;
        }
    }
}


