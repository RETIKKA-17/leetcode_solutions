class Solution {
    public int singleNumber(int[] nums) {
        int count=0,i,j;
        for(i=0;i<nums.length;i++)
        {
            count=0;
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                return nums[i];
            }
        }
        return -1;
    }
}