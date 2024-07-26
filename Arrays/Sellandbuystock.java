class Solution {
    public int maxProfit(int[] a) {
        int min=a[0];
        int profit=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            profit=Math.max(a[i]-min,profit);
            min=Math.min(min,a[i]);
        }
        return profit;
    }
}