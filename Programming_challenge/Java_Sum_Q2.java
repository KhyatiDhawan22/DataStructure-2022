/*An array on N elements is given. 
 * We need to print an array of N elements where the element in the
 *  i^th index of the new array is the sum of all elements in the given
 *   array except the element at index i.*/

import java.util.*;
public class Java_Sum_Q2 {
static void Sum_All(int a[]) {
	int sum=0;
	int m= a.length;
	int arr1[]=new int[m]; //array to store elements where the i^th index is the sum of all elements in the given array except the element at index i.
	for(int i=0;i<m;i++) {
		sum= sum+a[i];	//sum
	}
	for(int i=0;i<m;i++) {
		
			arr1[i]=sum-a[i]; //sum-ith element
	}
	for (int element: arr1) {
        System.out.println(element); 
    }
	
}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no. of Elements =");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element");
			arr[i]= sc.nextInt();
			
			
		}
		
		Sum_All(arr);
	}
	
}
