/*
URL:-- https://www.naukri.com/code360/problems/nth-root-of-m_1062679?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM
*/

public class Solution {
    public static int NthRoot(int n, int m) {
        int low=1,high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int s=root(mid, n,m);
            if(s==1){
                return mid;
            }else if(s==0){
                low=mid+1;
            }else{
                high=mid-1;
            }
           
        }
         return -1;
        
    }
    static int   root(int mid, int n, int m){
        // return 1 if m== ans;
        // return 0 if ans>m;
        // return 2 if ans>m
        long ans=1;
        for ( int i=1; i<=n;i++){
            ans=ans*mid;
             if(ans>m){
                return 2;
                 }
            }
           
            if(ans==m){
                return 1;
                 }
                 return 0;
     
    }
}
