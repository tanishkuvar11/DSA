class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0; i<row.length; i++)
        {
            int k=0;
            if(row[i]==1)
            {
                while(k<matrix[0].length)
                    matrix[i][k++]=0;
            }
        }

        for(int i=0; i<col.length; i++)
        {
            int k=0;
            if(col[i]==1)
            {
                while(k<matrix.length)
                    matrix[k++][i]=0;
            }
        }
    }
}   