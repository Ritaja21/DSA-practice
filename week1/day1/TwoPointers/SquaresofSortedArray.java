//Return squared array of the given array in sorted way
class Solution {
    public int[] sortedSquares(int[] nums) {
      int left = 0;
      int right = nums.length-1;
      int[] result = new int[nums.length];
      for(int i= nums.length-1 ;i >=0;i--){
        if(Math.abs(nums[left])>Math.abs(nums[right])){
            result[i] = nums[left]*nums[left];
            left++;
        }
        else{
            result[i] = nums[right]*nums[right];
            right--;
        }
      }
      return result;
    }
}
/*
The sorted array when squared contains the largest squared numbers at the extreme points only so to sort the array accordingly with squared elements 2 pointers are added 
on the extreme points and the added at the end of the result array backwards way.
*/
