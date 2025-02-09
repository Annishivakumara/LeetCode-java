/*
Square Root
Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number

Examples:

Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.
*/
import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		long low=1;
		long high=N;
		
		while(low<=high){
			long mid=(low+high)/2;
			long m=(mid*mid);
			if(m<=N){
				
				 low=mid+1;
			}else{
				
				high=mid-1;
			}
		}
		return (int)high;
	}
}
