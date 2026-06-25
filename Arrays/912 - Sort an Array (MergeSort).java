class Solution {
    public void mergeSort(int[] arr)
    {
        int n=arr.length;
        if(n<=1)
            return;

        int mid=n/2;

        int[] B=new int[mid];
        int[] C=new int[n-mid];

        for(int i=0; i<mid; i++)
            B[i]=arr[i];

        for(int i=mid; i<n; i++)
            C[i-mid]=arr[i];

        mergeSort(B);
        mergeSort(C);

        merge(arr, B, C);
    }

    public void merge(int[] arr, int[] B, int[] C)
    {
        int p=B.length;
        int q=C.length;

        int i=0, j=0, k=0;

        while(i<p && j<q)
        {
            if(B[i]<C[j])
                arr[k++]=B[i++];
            
            else
                arr[k++]=C[j++];
        }

        while(i<p)
            arr[k++]=B[i++];

        while(j<q)
            arr[k++]=C[j++];
    }

    public int[] sortArray(int[] nums) 
    {    
        mergeSort(nums);
        return nums;
    }
}