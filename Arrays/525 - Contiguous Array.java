class Solution {
    public int findMaxLength(int[] nums) 
    {
        int currSum=0;
        int maxLen=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i=0; i<nums.length; i++) 
        {
            if (nums[i]==0)
                currSum--;
            else
                currSum++;

            if (map.containsKey(currSum))
                maxLen = Math.max(maxLen, i-map.get(currSum));
            
            else
                map.put(currSum, i);
        }

        return maxLen;
    }
}