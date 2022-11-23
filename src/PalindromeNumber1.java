public class PalindromeNumber1 {
    /*
     *Palindrome number in java: A palindrome number is a number
     * that is same after reverse. For example 545, 151, 34543, 343, 171, 48984
     * are the palindrome numbers. It can also be a string like LOL, MADAM etc
     *
     * Palindrom sayısı, ters çevrildikten sonra aynı olan bir sayıdır.
     * Örneğin 545, 151, 34543, 343, 171, 48984 palindrom sayılarıdır.
     * LOL, MADAM vb. gibi bir dize de olabilir.
     *
     *
     */

    public static void main(String args[]){
        int r,sum=0,temp;
        int number=454;//It is the number variable to be checked for palindrome

        temp=number;
        while(number>0){
            r=number%10;  //getting remainder
            sum=(sum*10)+r;
            number=number/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }


    /*
    class Main {
  public static void main(String[] args) {

    int num = 3553, reversedNum = 0, remainder;

    // store the number to originalNum
    int originalNum = num;

    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }

    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}

     */

}
