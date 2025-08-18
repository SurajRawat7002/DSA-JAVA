import java.util.*;
public class Dsa7_KadaneAlgo{
    static void kadane(int num[]){
        int CurrSum= 0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            CurrSum=CurrSum + num[i];
            if(CurrSum < 0){
                CurrSum=0;
            }
            MaxSum=Math.max(CurrSum, MaxSum)==0?-1:Math.max(CurrSum,MaxSum);
        }
        System.out.println("Max sum is " + MaxSum);
    }
    public static void  main(String[]args){
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(number);
    }
}