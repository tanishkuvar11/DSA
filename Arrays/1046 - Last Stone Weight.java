class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        Arrays.sort(stones);
        int count0=0;

        while(count0!=stones.length && count0!=stones.length-1)
        {
            int largest=stones[stones.length-1];
            int largest2=stones[stones.length-2];

            if(largest==largest2)
            {
                stones[stones.length-1]=0;
                stones[stones.length-2]=0;
                count0+=2;
            }

            else
            {
                stones[stones.length-2]=0;
                stones[stones.length-1]=largest-largest2;
                count0+=1;
            }

            Arrays.sort(stones);
        }

        return stones[stones.length-1];
    }
}