import java.util.Scanner;
public class Array_Searching{
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
//_______________Searching_____________
		System.out.println("--SEARCHING--");
		System.out.println("Element to be found");//Searching
		int flag=0;
		int ele= sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				flag++;
				System.out.println("element found! at index" + i);
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Not Found");
			
		}
	}
}
