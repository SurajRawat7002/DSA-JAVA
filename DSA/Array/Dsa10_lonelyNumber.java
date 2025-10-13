    import java.util.*;
class Dsa10_lonelyNumber{

    static void lonely(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i+1]-arr[i]>1){
                    System.out.print(arr[i] + " ");
                }
            }else if(i==arr.length-1){
                if(arr[i]-arr[i-1]>1){
                    System.out.print(arr[i] + " ");
                }
            }else{
                if(arr[i]-arr[i-1] > 1 && arr[i+1]-arr[i] >1){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
    public static void main(String[]args){
        int arr[]={-2,-3,4,5,6,8,10};
        lonely(arr);
    }
}