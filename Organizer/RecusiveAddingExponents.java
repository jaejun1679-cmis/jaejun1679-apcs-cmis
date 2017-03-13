class RecusiveAddingExponents {

  public static void main(String[] args) {
    int a;
    a = power(2, 0);
    System.out.println(a);
    a = power(2, 1);
    System.out.println(a);
    a = power(2, 2);
    System.out.println(a);
    a = power(2, 3);
    System.out.println(a);
    a = power(2, 4);
    System.out.println(a);
    a = power(3, 0);
    System.out.println(a);
    a = power(3, 1);
    System.out.println(a);
    a = power(3, 2);
    System.out.println(a);
    a = power(3, 3);
    System.out.println(a);
    a = power(3, 4);
    System.out.println(a);
  }

  public static int power(int x, int y) { //what tif nonstatic
    
   if (y == 0) {
    return 1; 
   }//end if1
   
   if (y == 1) {
    return x;
   }//end if2
   
   else {
    return x * power(x, y - 1);
   }//end else

  }//end power
  
}//end class