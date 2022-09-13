/*Implement a program to Merge all the arrays and sort in ascending order.
Input:
5 8 4 7
15 32 87 65
2 1 78 91
// 3 - no of arrays to be merged // 4- no of elements in an array
Output: 1 2 4 5 7 8 15 32 65 78 87 91*/

import java.util.*;
public class Java_Merge_Sorting_1 {
	
	static int[] combineArr(int[] arr1, int arr2[] ,int arr3[]) {
		int l1=arr1.length;
		int l2=arr2.length;
		int l3=arr3.length;
		int length=l1+l2+l3;
		int merged_arr[]= new int[l1+l2+l3];
		int pos = 0;  
		for (int element : arr1) //copying elements of first Array using for-each loop  
		{  
		merged_arr[pos] = element;  
		pos++;              //increases position by 1  
		}  
		for (int element : arr2) //copying elements of Second Array using for-each loop  
		{  
		merged_arr[pos] = element;  
		pos++;  
		} 
		for (int element : arr3) //copying elements of third Array using for-each loop  
		{  
		merged_arr[pos] = element;  
		pos++;  
		} 
		System.out.println("The combined Array =");
		for(int i=0;i<length;i++) {
		System.out.print(merged_arr[i]+" ");
		}
		return merged_arr;
		//System.out.println(Arrays.toString(merged_arr));  
		
	} 
	  
	static void Array_Sort(int arr[]){
		System.out.println(" ");
		System.out.println("--SORTED ARRAY--");
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.println(arr[i]);  
		} 
		
	}
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n =4;
		System.out.println("___Enter four elements for first Array___");
		System.out.println(" ");
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element"+i);
			arr[i]= sc.nextInt();
		}
		
		System.out.println("___Enter four Elements  for Second Array___");
		System.out.println(" ");
		
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element"+i);
			arr1[i]= sc.nextInt();
			
	
		}
		System.out.println("___Enter four Elements for Third Array___");
		System.out.println(" ");
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element"+i);
			arr2[i]= sc.nextInt();
			
	
		}
		Array_Sort(combineArr(arr,arr1,arr2));	
	}
}
