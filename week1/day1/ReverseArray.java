//To reverse an array 
import java.util.*;

public class Array{
  public static void main(String[] args){
    int[] arr = {12,23,34,45,56};
    System.out.println("The original array given is:");
    for(int i =0;i<arr.length;i++) System.out.print(arr[i] + "\t");
    int left = 0;
    int right = arr.length -1 ;
    while(left<right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    System.out.println("The reversed array is:");
    for(int i = 0;i<arr.length;i++) System.out.print(arr[i] + "\t");
  }   
}
