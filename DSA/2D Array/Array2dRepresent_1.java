import java.util.*;
public class Array2dRepresent{
    //finding the elem position

    // static boolean findElem(int matrix[][],int key){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==key){
    //                 System.out.println("key found at (" + i+","+ j + ")");
    //                 return true;
    //             }
    //         }
    //     }
    //     System.out.println("key not found ");
    //     return false;
    // }

    // finding greatest elem from matrix

     static void findGreatest(int matrix[][]){
        int maxElem=Integer.MIN_VALUE;
               for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(maxElem < matrix[i][j]){
                    maxElem=matrix[i][j];
                }
            }
        }
        System.out.println("The max elem from above matrix is "+ maxElem);
     }
  

    

public static  void  main(String[]args){
    Scanner sc=new Scanner(System.in);
    //creation of 2d array or matrix
    int matrix[][]=new int [3][3];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=sc.nextInt();
        }
    }

    //printing of array
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println("");
    }

    // findElem(matrix,9);
    findGreatest(matrix);

}
}