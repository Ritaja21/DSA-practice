//To find Maximum and Minimum of an Array
import java.util.*;

public class MaxMinArray{
 public static int findmax(int[] arr){
   int Max_num = Integer.MIN_VALUE;
   for(int i =0;i<arr.length;i++){
     if(arr[i]>=Max_num) Max_num = arr[i];
   }
   return Max_num;
 }

 public static int findmin(int[] arr){
   int Min_num = Integer.MAX_VALUE;
   for(int i =0;i<arr.length;i++){
    if(arr[i]<=Min_num) Min_num = arr[i];
   }
   return Min_num;
 }
 public static void main (String[] args){
   int arr[] = {2,3,8,4,9,1};
   int max = findmax(arr);
   int min = findmin(arr);
   System.out.println("The array is:");
   for(int i= 0;i<arr.length;i++){
    System.out.print(arr[i] + "\t ");
   }
   System.out.println("The maximum number in this array is:" + max);
   System.out.println("The minimum number in this array is:"+ min);
 }
} 
//To practice and revise Java syntax and brush up basic logical & syntactical knowledge
