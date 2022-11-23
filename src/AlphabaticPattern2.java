public class AlphabaticPattern2 {
    /*
    Repeating Alphabet Pattern
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        G G G G G G G
        H H H H H H H H
        I I I I I I I I I
        J J J J J J J J J J

     */
    public static void main(String[] args)
    {
        int letter = 65; //ASCII value of capital A is 65
//inner loop for rwos
        for (int i = 0; i<= 9; i++)
        {
//outer loop for columns
            for (int j = 0; j <= i; j++)
            {
//prints the character
                System.out.print((char) letter + " ");
            }
            letter++;
            System.out.println();
        }
    }

}
