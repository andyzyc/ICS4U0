import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algoP2recur {
    public static void main(String[] args) throws IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String N = st.nextToken().toLowerCase();
        char[] arr = new char[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i);
        }

        System.out.println(recursiveCalculate(arr, N.length()));
    }

    // recursive method
    public static int recursiveCalculate(char[] arr, int n) {
        int[][] dp = new int[n][n];
        boolean[][] memo = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            memo[i][i] = true;
        }

        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) {
                memo[i][i+1] = true;
                dp[i][i+1] = 1;
            }
        }

        for (int i = 2; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                int k = i + j;
                if (arr[j] == arr[k] && memo[j+1][k-1]) {
                    memo[j][k] = true;
                }
                if (memo[j][k]) {
                    dp[j][k] = dp[j][k-1] + dp[j+1][k] + 1 - dp[j+1][k-1];
                } else {
                    dp[j][k] = dp[j][k-1] + dp[j+1][k] - dp[j+1][k-1];
                }
            }
        }

        return dp[0][n-1];
    }
}
