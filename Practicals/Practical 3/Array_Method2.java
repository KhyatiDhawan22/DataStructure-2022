import java.util.Scanner;
public class Array_Method2{
static void Sum_All(int[] arr, int n) {
	int sum1=0;
	for(int i=0;i<n;i++) {
		sum1=sum1+arr[i];
		
	}
	System.out.println("The sum of all Elements is="+ sum1);
}
static void Sum_alternate(int[] arr, int n) {
	int sum=0;
	
	for(int i=0;i<n;i+=2) {
		sum=sum+arr[i];
	}
	System.out.println("The sum of Alternate elements="+sum);
}
static void getSecondLargest(int[] arr, int n){  
int temp;  
for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j <n; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       System.out.println("The Second largest Element ="+arr[n-2]); 
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
	Sum_All(a,m);
	Sum_alternate(a,m);
	getSecondLargest(a,m);
}
}
