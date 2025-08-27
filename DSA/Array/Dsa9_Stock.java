public class Dsa9_Stock{
    static int profit(int prices[]){
        int n=prices.length;
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[]args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(profit(prices));
    }
}