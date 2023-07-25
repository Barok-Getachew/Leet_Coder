class Solution {
bool isPalindrome(int x) {
  if (x < 0) {
    return false;
  }

  int reminder = x % 10;
  int result = 0;
  int temp = x;

  while (temp != 0) {
    reminder = temp % 10;
    result = (result * 10) + reminder;
    temp = temp ~/ 10;
  }

  if (x != result) {
    return false;
  }
  return true;
}

  
}