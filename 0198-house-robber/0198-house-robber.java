class Solution{
    int rob (int i,int[]nums,int[]dp)
    {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1)
            return dp[i];
        return 
        dp[i]=Math.max(nums[i]+rob(i+2,nums,dp),rob(i+1,nums,dp));
    
    }
    public int rob (int[]nums)
    {
        int[] dp=new int [nums.length];
        Arrays.fill(dp,-1);
        return rob(0,nums,dp);
    }
}