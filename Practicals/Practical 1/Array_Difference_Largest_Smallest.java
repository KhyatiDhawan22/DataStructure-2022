
import java.util.Scanner;
public class Array_Difference_Largest_Smallest{
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
//_______________Array Making_______________
		System.out.println("Enter no. of Elements =");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element");
			arr[i]= sc.nextInt();
				
		}
		System.out.println("Elements in the array are=");
		for(int i=0;i<n;i++) {
			System.out.println( arr[i]);
		}	
//_______________Largest and Smallest_______________
		
		int large,small;
		large=small=arr[0];
		for (int i=1;i<n;i++) {
			if(arr[i]> large){
				large=arr[i];
				
			}
			if(arr[i]<small) {
				small=arr[i];	
			}

		}
		System.out.println(large+"is the Largest No.");
		System.out.println( small+"is the Smallest No. ");
		
//_______________Difference_______________
		int a =large-small;
		System.out.println("Diiference is ="+ a);
		}
	}
