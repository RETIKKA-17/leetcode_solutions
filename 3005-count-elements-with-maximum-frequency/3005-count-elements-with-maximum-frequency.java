class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find maximum frequency
        int max = 0;

        for(int freq : map.values()) {
            if(freq > max) {
                max = freq;
            }
        }

        // Add all frequencies equal to max
        int ans = 0;

        for(int freq : map.values()) {
            if(freq == max) {
                ans += freq;
            }
        }

        return ans;
    }
}