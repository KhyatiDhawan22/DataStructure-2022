import java.util.Scanner;

//Node
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
//Doubly linked list
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
        } 
    	else {
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
//Insertion
//Insert at front
void insertAtFirst(int d) {
    Node temp;
    temp = head;
    Node n = new Node();
    if (head == null) {
        tail = n;
        head = n;
    } 
    else {
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
//Insert at position
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
//Deletion 
//Delete at first
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
//Delete from specific Position
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
//Menu Driven_____________________
void display()
 { 
  System.out.println(" Doubly LINKED LIST ");
  System.out.println("1. Insertion at Front");
  System.out.println("2. Insertion at Position");
  System.out.println("3. Insertion at last");
  System.out.println("4. Deletion at First");
  System.out.println("5. Deletion at Last");
  System.out.println("6. Deletion at Position");
 }
}


public class DoublyLinkedList05{
public static void main(String []args){
  Scanner sc = new Scanner(System.in);
  char ch;
  int n,p,q;
  LinkedList list=new LinkedList();
  System.out.println("\t\t\t\t\t\t\tDOUBLY LINKED LIST\t\t\t\t\t");
  do{
	  list.display();
	  System.out.println("Enter the Operation number you want to perform :");
	  n = sc.nextInt();
	  switch(n)
   {
    case 1:
    	System.out.println("Enter the element you want to insert at First :");
    	p = sc.nextInt();
    	list.insertAtFirst(p);
    	break;
     
    case 2:
    	System.out.println("Enter integer element to insert");
    	p = sc.nextInt() ;
    	System.out.println("Enter position");
    	q = sc.nextInt() ;
    	list.insertAtPos(p, q);
    	break;
    case 3:
    	System.out.println("Enter the element you want to insert at Last :");
    	p = sc.nextInt();
    	list.insertAtLast(p);
    	break;
    case 4:
    	list.deleteAtFirst();
    	break;
    case 5:
    	list.deleteAtLast();
    	break;
    case 6:
    	System.out.println("Enter the index from where you want to delete :");
    	q = sc.nextInt();
    	list.deleteAtPos(q);
    	break;
    }
    System.out.println("Linked List :");
    list.viewList();
    System.out.println("\nDo you want to continue (Type y or n) \n");
    ch = sc.next().charAt(0);
} while (ch == 'Y'|| ch == 'y');      
}
}



