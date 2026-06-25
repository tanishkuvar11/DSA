class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int ctr=0;
        int currSum=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);

        for(int i=0; i<nums.length; i++)
        {
            currSum+=nums[i];

            ctr+=map.getOrDefault(currSum-k, 0);

            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }    

        return ctr;
    }
}