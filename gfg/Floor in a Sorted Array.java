/*
Binary Search Algo
Floor in a Sorted Array
Difficulty: EasyAccuracy: 33.75%Submissions: 416K+Points: 2
Given a sorted array arr[] (with unique elements) and an integer k, find the index (0-based) of the largest element in arr[] that is less than or equal to k. This element is called the "floor" of k. If such an element does not exist, return -1.

Examples

Input: arr[] = [1, 2, 8, 10, 11, 12, 19], k = 0
Output: -1
Explanation: No element less than 0 is found. So output is -1.
*/

class Solution {

    static int findFloor(int[] arr, int k) {
    int low=0, high=arr.length-1;
    int ans=-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]<=k){
            ans=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return ans;
    }
}
