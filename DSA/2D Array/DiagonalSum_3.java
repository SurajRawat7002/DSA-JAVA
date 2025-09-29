public class DiagonalSum_3{
    static void sumOfDiagonal(int matrix[][]){
        int totalSum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             totalSum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             totalSum+=matrix[i][j];
        //         }
        //     }
        // }  here time complexity is 0(n^2)

        // second approach 
        for(int i=0;i<matrix.length;i++){
            totalSum+=matrix[i][i];
            if(i!=matrix.length-i-1){  
                          totalSum+=matrix[i][matrix.length-1-i];  // sum of secondary diagonal is eqaul to n-1 and i!=j
            }  // here time complexity 0(n)
      

        }

        System.out.println("The total sum of primary diagonal is " + totalSum);
    }
    public static void main(String[]args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        sumOfDiagonal(matrix);
    }
}