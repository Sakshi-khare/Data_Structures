package BasicMaths_15;

public class palindrome {
    class Solution {
    public boolean isPalindrome(int n) {
      int revNum = 0;
      int dup = n; // store int dup for later comparison

      while(n>0) {
        int Id = n % 10;
        revNum = (revNum*10)+Id;
        n = n / 10;
      }

      return dup == revNum;

    }
}
}
