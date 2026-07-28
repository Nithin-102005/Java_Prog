import java.util.*;
import java.util.Arrays;
public class practiceP2 {
    public static int getMinCoins(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int targetAmount = 11;
        
        int result = getMinCoins(coins, targetAmount);
        System.out.println("Minimum coins required: " + result); 
    }
}


