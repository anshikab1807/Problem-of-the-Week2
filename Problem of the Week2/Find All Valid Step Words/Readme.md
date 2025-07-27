Find All Valid Step Words From a Given Word and Dictionary

This Java program finds all "step words" from a dictionary that can be formed by adding one character to the given base word.

Step Word:
A word made by adding **exactly one character** to the original word and possibly rearranging.

Input:
- Base word (e.g. "apple")
- Dictionary of words

Output:
All valid step words (e.g. "apples", "applet")

How it Works:
- Compare frequency of characters in both base and candidate.
- Valid if only **one extra character** and no letter is removed.

Example:
Input: "apple", Dictionary: ["apples", "apply", "applet", "appley"]  
Output: ["apples", "applet", "appley"]
