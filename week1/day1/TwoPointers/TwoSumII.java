//Find pairs having the sum amount of the target number in an array
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum = 0;    
        while(left<right){
            sum = numbers[left] + numbers[right];
            if(sum == target) return new int[]{left+1,right+1};
            else if (sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }
}

/*Using two pointer approach 
we add 2 pointers at the beginning and end of the array and check there sum with the target
as the array is in increasing order (sorted array) so the sum we get is also increasing
so we check the 3 condition sum == target , sum< target and sum>target and accordingly find the pairs
key points : two pointers approach & return array in functions 
*/
