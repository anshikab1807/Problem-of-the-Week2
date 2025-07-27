Longest Common Subsequence of 3 Strings

This program finds the length of the longest common subsequence (LCS) among three strings using 3D dynamic programming.

Input:
Three strings A, B, and C.

Output:
Length of their common subsequence.

How it Works:
- A 3D dp[i][j][k] table stores LCS length up to i-th of A, j-th of B, k-th of C.
- If characters match at all positions: Add 1 to result of subproblem.
- Else: Take the max by skipping one character at a time.

Example:
Input: "abcd1e2", "bc12ea", "bd1ea"  
Output: 3
