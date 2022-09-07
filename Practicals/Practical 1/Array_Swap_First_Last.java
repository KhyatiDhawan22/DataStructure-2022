import java.util.Arrays;
 
public class Array_Swap_First_Last{
 
   public static void main(String args[]) {
      int[] arr = {10, 20, 30, 40};
      System.out.println(Arrays.toString(arr));
      swapElements(arr);
      System.out.println(Arrays.toString(arr));
   }
 
   public static void swapElements(int[] arr) {
      int tmp = arr[0];
      arr[0] = arr[arr.length - 1];
      arr[arr.length - 1] = tmp;
   }
}
