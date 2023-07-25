class Solution {
    public int reverse(int x) {
    
      int remeinder = x % 10 ;
      long result = 0;
      while(x != 0){
          remeinder = x%10;
          result = (result*10)+remeinder;
          x = x/10 ;
          

      }
      if(result > 2147483647 || result < -2147483648){
        return 0;
      }
return (int)result;
  }
    }
