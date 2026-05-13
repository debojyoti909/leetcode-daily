public class Water_Bottles_1518 {
    class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int nb=numBottles;
        int c=numBottles;
        while(nb>=numExchange){
            int nb1=nb/numExchange;
            c+=nb1;
            int nb2=nb%numExchange;
            nb=nb1+nb2;
        }
        return c;
    }
}
}
