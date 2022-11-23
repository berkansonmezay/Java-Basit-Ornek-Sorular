public class PrimeNumberAsalSayi1 {
    /**
     * Prime number in Java: Prime number is a number that is greater
     * than 1 and divided by 1 or itself only. In other words, prime numbers
     * can't be divided by other numbers than itself or 1.
     * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
     *
     * Asal sayı, 1'den büyük ve yalnızca 1'e veya
     * kendisine bölünen bir sayıdır. Yani asal sayılar kendisinden veya
     * 1'den başka sayılara bölünemez.
     * Örneğin 2, 3, 5, 7, 11, 13, 17.... asal sayılardır.
     *
     * girilen sayinin asal olup olmadığını yazdıran programı yaziniz
     */

    public static void main(String args[]){
        int i,m=0,flag=0;
        int n=3;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
}
