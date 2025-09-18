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
    static void insertion(int num[]){
    for(int i=1;i<num.length;i++){
        int curr=num[i];
        int prev=i-1;
        while(prev>=0 && num[prev]>curr){
            num[prev+1]=num[prev];
            prev--;
        }
        num[prev+1]=curr;
    }
    }




    
    public static void main(String[]args){
        int num[]={4,2,1,5,3};
        // bubble(num);
        // selection(num);
        insertion(num);
        for(int elem:num){
            System.out.print(elem + " ");
        }
    }
}