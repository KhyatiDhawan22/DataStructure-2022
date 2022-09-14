/*
Q3=Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.
A boomerang is a set of three points that are all distinct and not in a straight line.

Note: if slopes of lines with any two point will be same , then they are co-linear
i.e.
(y2−y1)*(x3−x1)= (y3−y1)*(x2−x1) 

*/
import java.util.*;
class Java_BoomerangPoints_Q3
{
    public static void main(String args[])
    {
    	// Creating a 2-D Array
        int[][] arr = new int[3][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");

        for(int i = 0 ; i < arr.length; i++){
          for(int j = 0; j < arr[i].length; j++ ){
              arr[i][j] = sc.nextInt();
          }
        }

        System.out.println("Array elements are: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        
        if(isBoomerang(arr))
            System.out.println("true");
        else
            System.out.println("false");
    }
    static boolean isBoomerang(int[][] points)
    {
        int dx1 = (points[1][0] - points[0][0]);
        int dy1 = (points[1][1] - points[0][1]);
        int dx2 = (points[2][0] - points[1][0]);
        int dy2 = (points[2][1] - points[1][1]);
        return (dx1 * dy2) != (dy1 * dx2);
    }
}
