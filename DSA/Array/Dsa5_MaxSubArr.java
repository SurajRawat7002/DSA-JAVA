public class Dsa5_MaxSubArr{
    static int MaxSum(int num[]){
                int max=Integer.MIN_VALUE; // declare a minimum value 
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int SubArr=0;
                for(int k=i;k<=j;k++){
                    SubArr+=num[k];  //Adding value sub array in sub array;
                }
                if(SubArr>max){
                    max=SubArr; // comparing value to get the max sum of sub array;
                }
            }
        }
        return max;
    }
    public static void main(String[]args){
        int num[]={1,-2,6,-1,3};
        System.out.println( "The max value of sub array is " + MaxSum(num));


    }
}