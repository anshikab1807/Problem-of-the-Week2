public class brutecode {
    public static int lcsOf3(String a, String b, String c) {
        int n = a.length(), m = b.length(), o = c.length();
        int[][][] dp = new int[n + 1][m + 1][o + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= o; k++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1) && a.charAt(i - 1) == c.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k],
                                        Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                    }
                }
            }
        }

        return dp[n][m][o];
    }

    public static void main(String[] args) {
        String A = "abcd1e2", B = "bc12ea", C = "bd1ea";
        System.out.println("LCS length: " + lcsOf3(A, B, C));
    }
}
