import java.util.Scanner;
//Node_____________________
class Node{
	private int data;
	private Node next;

 public Node(){
	 data = 0;
     next = null;
  }
 public Node(int d,Node n){
     data = d;
     next = n;
  }
 public void setData(int d){
     data = d;
  }

 public void setNext(Node n){
     next = n;
  }     

 public int getData(){
     return data;
  }

 public Node getNext(){
     return next;
  }
}
//Singly Linked list_____________________
class LinkedList{
	private int size;
	private Node start;
	public LinkedList()
	{
     size = 0;
     start = null;
     }

 public boolean isEmpty(){
	 if (start==null)
		 return true;
     else
    	 return false;
  }
 
 public int getListSize()
  {
     return size;
  }

public void viewList(){
	Node t;
    t=start;
    if(isEmpty())
    {
    	System.out.println("list is empty");
    }
    else
    {
    	for(int i = 1; i <= size; i++)
        {
           System.out.println("" + t.getData());
           t = t.getNext();
        }
     }
  }
 //Insert at the beginning_____________________
  public void insertAtFirst(int val){
     Node n;
     n = new Node();
     n.setData(val);
     n.setNext(start);
     start = n;
     size++;
  }
//Insert at the end_____________________
  public void insertAtLast(int val){
     Node n,t;
     n = new Node();
     n.setData(val);
     t = start;
     if (t == null)
        start = n;
     else{
        while(t.getNext() != null)
           t = t.getNext();
           t.setNext(n);
           n.setNext(null);
        }
     size++;
  }
 //Insert at a specific Position_____________________
  public void insertAtPos(int val,int pos){
	  if (pos == 1)
		  insertAtFirst(val);
	  else if (pos == size+1)
		  insertAtLast(val);
	  else if (pos>1 && pos <= size)
	  {
		  Node n;
		  Node t;
		  n = new Node(val,null);
		  t = start;
		  for (int i = 1; i < pos-1; i++) {
			  t = t.getNext();
			  n.setNext(t.getNext());
			  t.setNext(n);
			  size++;
		  }
     
		  }
      } 
  //DELETION//
  //Delete from the Front_____________________
 public void deleteAtFirst(){
	 if (start==null) {
		 System.out.println("List is empty");
	 }
     else
     {
    	 start=start.getNext();
         size--;
      }
 }
 //Delete from the last_____________________
public void deleteAtLast(){
	if (start==null) {
         System.out.println("List is empty");
	}
    else if (size==1)
    { 
    	start=null;
        size--;
    }
        else
         {
          Node t; 
          t = start;
          for(int i=1;i<size-1;i++) 
           { 
            t=t.getNext();
           }
           t.setNext(null);
           size--;
           }
        } 
//Delete from a specific Position_____________________
      public void deleteAtPos(int pos){
          if (start==null)
           System.out.println("list is empty");
          else if(pos<1 || pos>size)
           System.out.println("invalid position");
          else if(pos==1)
           deleteAtFirst();
          else if(pos==size)
           deleteAtLast();
          else 
           {
            Node t,t1;
            t=start;
            for(int i=1; i<pos-1;i++)
             { 
              t=t.getNext();
             }
            t1=t.getNext();
            t.setNext(t1.getNext());
            size--;
            }
           }
 //Menu Driven_____________________
    void display()
     { 
      System.out.println(" SINGLY LINKED LIST ");
      System.out.println("1. Insertion at Front");
      System.out.println("2. Insertion at Position");
      System.out.println("3. Insertion at last");
      System.out.println("4. Deletion at First");
      System.out.println("5. Deletion at Last");
      System.out.println("6. Deletion at Position");
     }
  }
 
 
 public class LinkedList04{
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      char ch;
      int n,p,q;
      LinkedList list=new LinkedList();
      System.out.println("\t\t\t\t\t\t\tSINGLY LINKED LIST\t\t\t\t\t");
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
