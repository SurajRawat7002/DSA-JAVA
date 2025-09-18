public class sorting{
    static void bubble(int num[]){
        for(int i=0;i<num.length-1;i++){ // from 0 to 3
            for(int j=0;j<num.length-1-i;j++){ // the loop will work from 0 to 3
                if(num[j]>num[j+1]){ //here we check the condition if curr is greater than curr_+1
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;  // swaping method to swap two element
                }
            }
        }
    }
    public static void main(String[]args){
        int num[]={4,2,1,5,3};
        bubble(num);
        for(int elem:num){
            System.out.print(elem + " ");
        }
    }
}