import java.util.Scanner;

public class NumberPattern4 {
    /*
  Enter the number of rows youy want to print: 8
        8
        8 7
        8 7 6
        8 7 6 5
        8 7 6 5 4
        8 7 6 5 4 3
        8 7 6 5 4 3 2
        8 7 6 5 4 3 2 1

     */

    public static void main(String[] args)
    {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows youy want to print: ");
        rows = sc.nextInt();
        for (i = rows; i >= 1; i--)
        {
            for (j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }  }
