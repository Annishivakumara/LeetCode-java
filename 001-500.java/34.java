/*
34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left=LowerBound(nums,target);
       int right=UpperBound(nums, target);
       return  new  int[]{left,right};  
    }
    private int LowerBound(int [] nums, int target){
        int index=-1, low=0, high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return index;
        }
    private int UpperBound(int [] nums, int target){
        int index=-1;
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return index;
    }
}
