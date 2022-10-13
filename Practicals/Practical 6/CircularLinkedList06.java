
//NODE:
import java.util.*;
class Node{
    int data;
    Node next;
    Node(){
        data = 0;
        next = null;
    }
    Node(int d, Node n){
        data = d;
        next = n;
    }
    void setData(int d){
        data = d;
    }
    void setNext(Node n){
        next = n;
    }
    int getData(){
        return data;
    }
    Node getNext(){
        return next;
    }
}

//CIRCULAR LINKED LIST:
import java.util.*;

class CSLinkedList {
    int size;
    Node head;
    Node tail;

    CSLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    void viewList() {
        Node t;
        if (head == null) {
            System.out.println("List empty");
        } else {
            int i = 1;
            System.out.println("LIST: ");
            t = head;
            while (i <= size) {
                System.out.print(t.getData() + ", ");
                t = t.getNext();
                i++;
            }
        }
    }

//	INSERTION
//AT THE BEGINNING 
void insertAtFirst(int d) {
        Node temp;
        temp = head;
        Node n = new Node();
        n.setData(d);
        if (head == null) {
            head = n;
            tail = n;
            head.setNext(n);
        } else {
            n.setNext(head);
            head = n;
            tail.setNext(head);
        }
        size++;
    }

//AT THE END
void insertAtEnd(int d) {
        Node temp;
        temp = head;
        Node n = new Node();
        n.setData(d);
        if (head == null) {
            insertAtFirst(d);
        } else {
            tail.setNext(n);
            n.setNext(head);
            tail = n;
        }
        size++;
    }








//AT A SPECIFIC POSITION
void insertAtPos(int d, int pos) {
        Node temp;
        Node t;
        t = head;
        Node n = new Node();
        if (pos == 1) {
            insertAtFirst(d);
        } else if (pos == size + 1) {
            insertAtEnd(d);
        } else if (pos > 1 && pos < size + 1) {
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            temp = t.getNext();
            n.setData(d);
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        } else {
            System.out.println("Invalid position");
        }
    }

//	DELETION
//AT THE BEGINNING 
void deleteAtFirst() {
        if (head == null)
            System.out.println("List is empty");
        else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.getNext();
            tail.setNext(head);
            size--;
        }
    }




//AT THE END
void deleteAtLast() {
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
            t.setNext(head);
            tail = t;
            size--;
        }
    }

//AT A SPECIFIC POSITION
void deleteAtPos(int pos) {
        if (head == null)
            System.out.println("list is empty");
        else if (pos < 1 || pos > size)
            System.out.println("invalid position");
        else if (pos == 1)
            deleteAtFirst();
        else if (pos == size)
            deleteAtLast();
        else {
            Node t, t1;
            t = head;
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
}





