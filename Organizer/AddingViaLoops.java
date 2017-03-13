class AddingViaLoops {
  public static void main(String[] args) {
    System.out.println(power(2, 6));
  }//end main
  
  public static int power(int x, int y) {
    
    int sum = 0;
    
    for(int index = 0; index < y; index++) {
      
      if (index == 0) {
        sum = x;
      }// end if
      
      else {
        sum = sum * x;
        
      }//end else
      
    }//end for
    
    return sum;
  }//end power
  
}//end class