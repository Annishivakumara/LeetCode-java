/*
url:-  https://www.naukri.com/code360/problems/square-root-integral_893351?leftPanelTab=0%3Futm_source%3Dstriver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM
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
