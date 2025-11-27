//To find second largest element of an array
import java.util.*;

public class Array{
  public static void main(String[] args){
    int[] arr = {34, 23,67,98,12};
    System.out.println("The given array is:");
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i] + "\t");
  }
    int largestNum = Integer.MIN_VALUE;
    int secondLargestNum = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]>largestNum){
        secondLargestNum = largestNum;
        largestNum = arr[i];
      }
      else if(arr[i]<largestNum && arr[i]>secondLargestNum) secondLargestNum = arr[i];
    }
    System.out.println("The largest element of the array is" + largestNum + "and the second largest element of the array is:"+ secondLargestNum);
 }
}
