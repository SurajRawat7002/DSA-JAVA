import java.util.*;
public class Dsa8_Trapping{
    static void trapedWater(int num[]){
        int trapedWater=0;
        int width=1;
        //finding maxleft water
        int maxLeft[]=new int[num.length];
        maxLeft[0]=num[0];
        for(int i=1;i<num.length;i++){
            maxLeft[i]=Math.max(num[i],maxLeft[i-1]);
        }
        // finding right water
        int maxRight[]=new int[num.length];
        maxRight[num.length-1]=num[num.length-1];
        for(int i=num.length-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],num[i]);
        } 

        //finding trapped water
        for(int i=0;i<num.length;i++){
            int waterLevel=Math.min(maxLeft[i],maxRight[i]);
            trapedWater+=(waterLevel-num[i])*width;
        }

        System.out.println("The total Trapped water is " + trapedWater);

    }
    public static void main(String[]args){
        //water trapped between bars
        int num[]={4,2,0,6,3,2,5};
        trapedWater(num);

    }
}