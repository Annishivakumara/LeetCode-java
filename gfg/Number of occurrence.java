/*
Number of occurrence
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

Examples :
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
*/
class Solution {
    int countFreq(int[] arr, int target) {
       int left=leftArray(arr, target);
       int right=rightArray(arr, target);
       return (left+right);
    }
    private int leftArray(int [] arr, int target){
        int count=1;
        int low=0, high=arr.length-1;
        while(low<=high){
        int mid=(high+low)/2;
            if(arr[mid]==target){
                count++;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return count;
    }
    private int rightArray(int [] arr, int target){
        int count=1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                count++;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return count;
        }
}
