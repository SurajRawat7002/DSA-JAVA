public class Dsa2_ReverseArr{
    //function for reversing an array
    static void ReverseArr(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[]args){
        //declaring num arr
        int num []={3,4,5,6,7,8,9};
        ReverseArr(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}