
public class Problem_1518 {

    public static void main(String[] args) {
        Solution_1518 obj = new Solution_1518();

        System.out.println(obj.numWaterBottles(15, 4));
    }
}

//class Solution_1518 {
//    public int numWaterBottles(int numBottles, int numExchange) {
//        int drink = numBottles;
//        while(numBottles >= numExchange) {
//            numBottles -= numExchange;
//            drink++;
//            numBottles++;
//        }
//        return drink;
//    }
//}
class Solution_1518 {

    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        while (numBottles >= numExchange) {
            int remainBottles = numBottles % numExchange;
            drink += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + remainBottles;

        }
        return drink;
    }
}
