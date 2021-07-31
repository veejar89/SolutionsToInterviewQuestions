
// A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
// Example
// The string contains all letters in the English alphabet, so return pangram.
// Function Description
// Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.
// pangrams has the following parameter(s):
// string s: a string to test
// Returns
// string: either pangram or not pangram
// Input Format
// A single line with string .
// Sample Input
// Sample Input 0
// We promptly judged antique ivory buckles for the next prize
// Sample Output 0
// pangram
// Sample Explanation 0
// All of the letters of the alphabet are present in the string.
// Sample Input 1
// We promptly judged antique ivory buckles for the prize
// Sample Output 1
// not pangram
// Sample Explanation 0
// The string lacks an x.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Panagrams {
  public static void main(String[] args) throws IOException {
    System.out.println("Test Case 1: " + Result.pangrams("The quick brown fox jumps over the lazy dog"));
    System.out
        .println("Test Case 2: " + Result.pangrams("We promptly judged antique ivory buckles for the next prize"));
    System.out
        .println("Test Case 3: " + Result.pangrams("All of the letters of the alphabet are present in the string"));
    System.out.println("Test Case 4: " + Result.pangrams("We promptly judged antique ivory buckles for the prize"));
  }
}

class Result {
  public static String pangrams(String s) {
    for (char ch = 'a'; ch <= 'z'; ch++) {
      if (s.toLowerCase().indexOf(ch) < 0) {
        return "not panagram";
      }
    }
    return "Panagram";
  }
}
