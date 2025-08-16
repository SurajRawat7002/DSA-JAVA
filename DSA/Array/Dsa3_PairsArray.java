public class Dsa3_PairsArray{
    static void PairsArray(int num[]){
        int totalPair=0;
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + curr + "," + num[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are " + totalPair);
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,5,9,10,11,12,13,14,15,16};
        PairsArray(numbers);
    }
}