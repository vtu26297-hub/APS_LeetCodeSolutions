class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null|| prices.length==0){
            return 0;

        }
        int buyPrice=prices[0];
        int profit=0;
        for (int i=1;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
                }else{
                    profit=Math.max(profit,prices[i]-buyPrice);

                }
            }
            return profit;
        } 
        public static void main(String []args){
            Solution s=new Solution();
            int[] price={7,1,5,3,6,4};
            System.out.println(s.maxProfit(price));
            }
}