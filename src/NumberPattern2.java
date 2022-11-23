public class NumberPattern2 {
    /*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
            16 17 18 19 20 21
            22 23 24 25 26 27 28
     */


    public static void main(String[] args)
    {
        int i, j, k = 1;
//inner loop
        for (i = 1; i <= 7; i++)
        {
//outer loop
            for (j = 1; j< i + 1; j++)
            {
//prints the value of k
                System.out.print(k++ + " ");
            }
//throws the cursor at the next line
            System.out.println();
        }
    }
}
