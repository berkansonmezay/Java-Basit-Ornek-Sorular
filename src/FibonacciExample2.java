public class FibonacciExample2 {
    /**
     * In fibonacci series, next number is the sum of previous two numbers
     * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. ü
     * The first two numbers of fibonacci series are 0 and 1.
     *
     * Fibonacci serisinde sonraki sayı önceki iki sayının toplamıdır,
     * örneğin 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 vb.
     * Fibonacci serisinin ilk iki sayısı 0 ve 1'dir.
     *
     * 10 adet sayi icin yapalim.
     */

        static int n1=0,n2=1,n3=0;
        static void printFibonacci(int count){
            if(count>0){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" "+n3);
                printFibonacci(count-1);
            }
        }
        public static void main(String args[]){
            int count=10;
            System.out.print(n1+" "+n2);//printing 0 and 1
            printFibonacci(count-2);//n-2 because 2 numbers are already printed
        }
    }

