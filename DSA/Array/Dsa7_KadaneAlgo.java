import java.util.*;
public class Dsa7_KadaneAlgo{
    // kadane algo with limitations

    static int kadane(int num[]){
        int CurrSum= 0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            CurrSum=CurrSum + num[i];
            if(CurrSum < 0){
                CurrSum=0;
            }
            MaxSum=Math.max(CurrSum, MaxSum)==0?-1:Math.max(CurrSum,MaxSum);
        }
        return MaxSum;
    }

    //updated kadane without any limitations

    // static int kadane(int number[]){
    //     int currsum=number[0];
    //     int max=number[0];
    //     for(int i=1;i<number.length;i++){
    //         currsum+=Math.max(number[i],currsum+number[i]);
    //         max=Math.max(currsum,max);
    //     }
    //     return max;
    // }


    public static void  main(String[]args){
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadane(number));
    }
}