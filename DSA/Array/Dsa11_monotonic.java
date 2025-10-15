import java.util.*;
class Dsa11_monotonic{
    static boolean increasing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    static boolean decreasing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    static boolean monotonic(int arr[]){
        return increasing(arr) || decreasing(arr);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,4,5,8,6,7,7};
        System.out.println(monotonic(arr));
    }
}