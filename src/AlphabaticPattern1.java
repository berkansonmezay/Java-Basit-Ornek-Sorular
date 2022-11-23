public class AlphabaticPattern1 {
    /*
    Right Triangle Alphabetic Pattern
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        A B C D E F G
        A B C D E F G H
        A B C D E F G H I

     */
    public static void main(String[] args)
    {
        int alphabet = 65; //ASCII value of capital A is 65
//inner loop for rows
        for (int i = 0; i <= 8; i++)
        {
//outer loop for columns
            for (int j = 0; j <= i; j++)
            {
//adds the value of j in the ASCII value of A and prints the corresponding alphabet
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
