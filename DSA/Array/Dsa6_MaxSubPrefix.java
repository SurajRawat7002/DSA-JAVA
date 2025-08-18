public class Dsa6_MaxSubPrefix{
    static void PrefixSub(int num[]){
        //Creating our prefix array
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        //Max and Currsum variable
        int maxSum=0;
        int currSum=0;
        //loop for subarray
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }

        }
        System.out.println("The max Sum is " + maxSum);

    }
    public static void main(String[]args){
        //We will use prefix method to get the max sum of a subarray
        int number[]={1,-2,6,-1,3};
        PrefixSub(number);

    }
} 