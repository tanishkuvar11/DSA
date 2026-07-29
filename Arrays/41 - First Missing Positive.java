class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        int minPos=1;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(nums[i]==minPos)
            {
                while(map.containsKey(minPos))
                    minPos++;
            }
        }        

        return minPos;
    }
}