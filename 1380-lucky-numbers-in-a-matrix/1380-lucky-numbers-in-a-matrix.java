class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int min,max;
        int j;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            min=matrix[i][0];
            int mincl=0;
            for(j=1;j<matrix[i].length;j++)
            {
                if (matrix[i][j] < min)
                {
                    min=matrix[i][j];
                    mincl=j;
                }
            }
             max = min;

            for (int k = 0; k < matrix.length; k++) 
            {

                if (matrix[k][mincl] > max)
                {
                    max = matrix[k][mincl];
                }
            }
            if (min == max) 
            {
               result.add(min);
            }
        }

        return result;
    }
}
        