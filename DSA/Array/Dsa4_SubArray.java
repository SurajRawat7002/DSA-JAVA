public class Dsa4_SubArray{
    static void FindSubArray(int num[]){
            int totalSub=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                // int sum=0; // to calculate the sum of each subarray
                for(int k=start; k<=end;k++){
                    System.out.print(num[k] + " ");
                    // sum=sum+num[k]; // adding value of k in sum to calculate sub array sum
                }
                System.out.println();
                // System.out.println("sum is " + sum); //printing the sub array
                    totalSub++;  //counting sub array
            }
            System.out.println();
        }
        System.out.println("total subarrays "+totalSub);
    }
    public static void main(String[]args){
        int numbers[]={2,4,6 ,8,10};
        FindSubArray(numbers);

    }
} 