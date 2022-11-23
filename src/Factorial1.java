public class Factorial1 {
    /*
     * Factorial of n is the product of all positive descending integers.
     * Factorial of n is denoted by n!. For example:
     *
     * 4! = 4*3*2*1 = 24
     * 5! = 5*4*3*2*1 = 120
     *
     * n'nin faktöriyeli, azalan tüm pozitif tam sayıların çarpımıdır.
     * n'nin faktöriyeli n! ile gösterilir.
     * Örneğin:
     * 4! = 4*3*2*1 = 24
     * 5! = 5*4*3*2*1 = 120
     */

    public static void main(String args[]){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
