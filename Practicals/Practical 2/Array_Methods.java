import java.util.Scanner;

public class Array_Methods {
static void even_Elem(int[] arr, int n) {
	System.out.println("Elements at Even index =");
	for( int i= 0; i< n; i += 2) {
	    System.out.println(arr[i]);
	}
}
static void odd_Elem(int[] arr, int n){
	System.out.println("Elements at odd index =");
	for(int i=1 ;i<n ;i+=2) {
		
		System.out.println(arr[i]);
	}
}
static void reverse(int[] arr, int n) {
	System.out.println("Reversed Array = ");
	for(int i=n-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
}
static void Corner_Ele(int[] arr, int n) {
	System.out.println("The First element is = "+arr[0]);
	System.out.println("The Last element is ="+ arr[n-1]);
}


public static void main(String[]args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter no. of Elements =");
	int n = sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter element");
		a[i]= sc.nextInt();
		
		
	}
	System.out.println("Elements in the array are=");
	for(int i=0;i<n;i++) {
		System.out.println( a[i]);
	}
	int m =a.length;
	even_Elem(a, m); 
	odd_Elem(a,m);
	reverse(a,m);
	Corner_Ele(a,m);
	
}
}
