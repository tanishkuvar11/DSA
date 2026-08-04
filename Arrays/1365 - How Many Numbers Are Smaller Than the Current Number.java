class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] ans=new int[nums.length];
        int[] copy=nums.clone();

        Arrays.sort(copy);
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<copy.length; i++)
        {
            if(!map.containsKey(copy[i]))
                map.put(copy[i], i);
        }

        for(int i=0; i<nums.length; i++)
            ans[i]=map.get(nums[i]);

        return ans;
    }
}