public class sortingBubble1{
    static void bubbleSort(int num[]){
        
        for(int turn=0;turn<num.length;turn++){
            int swap=0;
            for(int j=0;j<=num.length-2-turn;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                    // swap++; 
                   
                }           
            }
           //if array is alreay sorted then swap value will be 0 and the loop will be stop here 
            if(swap<=0){
                break;
            }

          
            

        }
    }
    static void printNum(int num[]){
        for(int elem:num){
            System.out.print(elem + " ");
        }
    }
    public static void main(String[]args){
        int num[]={4,5,2,3,1};
        bubbleSort(num);
        printNum(num);

    }
}