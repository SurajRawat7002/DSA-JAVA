public class sortingSelection2{
    static void selectionSort(int num[]){
        for(int i=0;i<=num.length-2;i++){
            //assume the current elem is min elem
            int minPos=i;
            //Finding the position of min element
            for(int j=i+1;j<=num.length-1;j++){
                if(num[minPos]>num[j]){
                    minPos=j;
                }
            }
            //swaping
            int temp=num[i];
            num[i]=num[minPos];
            num[minPos]=temp;
        }
    }

    public static void main(String[]args){
        int num[]={3,4,2,1,5};
        selectionSort(num);
        for(int elem:num){
            System.out.print(elem+ " ");
        }
    }
}