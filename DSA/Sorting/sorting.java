public class sorting{
    // static void bubble(int num[]){
    //     for(int i=0;i<num.length-1;i++){ // from 0 to 3
    //         for(int j=0;j<num.length-1-i;j++){ // the loop will work from 0 to 3
    //             if(num[j]>num[j+1]){ //here we check the condition if curr is greater than curr_+1
    //                 int temp=num[j];
    //                 num[j]=num[j+1];
    //                 num[j+1]=temp;  // swaping method to swap two element
    //             }
    //         }
    //     }
    // }


    //Selection sort 

    // static void selection(int num[]){
    //     for(int i=0;i<num.length-1;i++){
    //         int smallest=i;
    //         for(int j=i+1;j<num.length;j++){
    //             if(num[smallest]>num[j]){
    //                 smallest=j;
    //             }
    //             int temp=num[i];
    //             num[i]=num[smallest];
    //             num[smallest]=temp;
    //         }
    //     }
    // }

    //Insertion sort
    // static void insertion(int num[]){
    // for(int i=1;i<num.length;i++){
    //     int curr=num[i];
    //     int prev=i-1;
    //     while(prev>=0 && num[prev]>curr){
    //         num[prev+1]=num[prev];
    //         prev--;
    //     }
    //     num[prev+1]=curr;
    // }
    // }

    //counting sort
    static void countingSort(int arr[]){
        //finding largest term from the array
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        //creating counting array to find the frequency of every array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting the original array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    
    public static void main(String[]args){
        int num[]={4,2,1,5,3};
        int arr[]={2,2,1,3,1,4,6,5,7};
        // bubble(num);
        // selection(num);
        // insertion(num);
        countingSort(arr);
        for(int elem:arr){
            System.out.print(elem + " ");
        }
    }
}