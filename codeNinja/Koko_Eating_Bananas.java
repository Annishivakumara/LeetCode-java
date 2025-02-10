 /*
URL:-  https://www.naukri.com/code360/problems/minimum-rate-to-eat-bananas_7449064?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM
*/
public class Solution {
    public static int minimumRateToEatBananas(int []v, int h) {
        int low=1;
        int high=getMax(v);
       int  ans=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int totalhours=ceil(v,mid);
            if(totalhours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int ceil(int  [] v, int mid){
        int totalhours =0;
        for(int i=0;i<v.length;i++){
               totalhours=totalhours+(int) Math.ceil((double) v[i] / mid);
        }
        return totalhours;
    }
    private static int getMax(int[] v) {
        int max = Integer.MIN_VALUE;
        for (int bananas : v) {
            if (bananas > max) {
                max = bananas;
            }
        }
        return max;
    }
}
