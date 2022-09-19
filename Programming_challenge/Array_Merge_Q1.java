/*/*Implement a program to Merge all the arrays and sort in ascending order.
Input:
5 8 4 7
15 32 87 65
2 1 78 91
// 3 - no of arrays to be merged // 4- no of elements in an array
Output: 1 2 4 5 7 8 15 32 65 78 87 91*/
import java.util.Scanner;

public class Array_Merge_{
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("No. of array");
        int noOfArrays = sc.nextInt();
        System.out.println("No. of ele");
        int noOfElements = sc.nextInt();
        
        int totalElements = noOfArrays*noOfElements;
        
        
        int[] finalArray = new int[totalElements];
        
//First loop____________________________________________
        int[] counter = new int[noOfArrays];
        for(int i=0;i<noOfArrays;i++){
            counter[i] = i* noOfElements; 
        }
        
//Second loop___________________________________________
        for(int n:counter){
            for(int j=0;j<noOfElements;j++){
            	System.out.println("enter element");
                finalArray[n+j] = sc.nextInt();
            }
        }  
        sc.close();
        
//Third loop____________________________________________
        for(int i=0;i<totalElements;i++){
            System.out.print(finalArray[i] + " ");}
        
//Fourth loop___________________________________________       
        for(int i=0;i<totalElements;i++){
            for(int j=i;j<totalElements;j++){
                if(finalArray[i]>finalArray[j]){
                    int tmp = finalArray[i];
                    finalArray[i]=finalArray[j];
                    finalArray[j]=tmp;
                }
            }
        }
//Fifth loop____________________________________________        

        System.out.println("Final Sorted Array: ");
        for(int i=0;i<totalElements;i++){
            System.out.print(finalArray[i] + " ");
        }

    }
}
