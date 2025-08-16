public class Dsa1_BinarySearch{
    //function for finding index using binary search
    static int FindIndex(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>key){
                end=mid-1;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        //Here our number array and key
        int num []={4,5,6,8,9,10,12,23};
        int key=9;
        int indx=FindIndex(num,key);
        System.out.println("The index of " + key + " is " + indx);
    }
}